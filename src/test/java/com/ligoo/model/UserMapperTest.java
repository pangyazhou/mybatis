package com.ligoo.model;

import com.ligoo.BaseMapperTest;
import com.ligoo.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.dao.SysUserMapper;
import test.model.SysUserExample;

import java.util.*;

public class UserMapperTest extends BaseMapperTest {
    Logger logger = LoggerFactory.getLogger(UserMapperTest.class);
    SqlSession sqlSession = null;

    @Before
    public void beforeMethod(){
        sqlSession = getSqlSession();
    }
    @After
    public void afterMethod(){
        sqlSession.close();
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysUser> userList = userMapper.selectAll();
            Assert.assertNotNull(userList);
            Assert.assertTrue(userList.size() > 0);
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user =userMapper.selectById(3l);
            Assert.assertNotNull(user);
            Assert.assertEquals("admin", user.getUserName());
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectRolesByUserId(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<SysRole> roleList = userMapper.selectRolesByUserId(3l);
        Assert.assertNotNull(roleList);
        Assert.assertTrue(roleList.size() > 0);
    }

    @Test
    public void testInsert(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        SysUser user = new SysUser();
        user.setUserName("test1");
        user.setUserPassword("123456");
        //user.setUserEmail("test1@mybatis.tk");
        user.setUserInfo("test info");
        user.setHeadImg(new byte[]{1, 2, 3});
        user.setCreateTime(new Date());
        int result = userMapper.insert(user);
        Assert.assertEquals(1, result);
        Assert.assertNotNull(user.getId());
        System.out.println(user.getId());
        user = userMapper.selectById(user.getId());
        Assert.assertEquals("test@mybatis.tk", user.getUserEmail());
        //sqlSession.commit();
        sqlSession.rollback();
    }

    @Test
    public void testUpdateById(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        SysUser user = userMapper.selectById(3l);
        Assert.assertEquals("admin", user.getUserName());
        user.setUserName("admin_test");
        user.setUserEmail("admin_test@mybatis.tk");
        int result = userMapper.updateById(user);
        Assert.assertEquals(1, result);
        user = userMapper.selectById(3l);
        Assert.assertEquals("admin_test", user.getUserName());
        sqlSession.rollback();
    }

    @Test
    public void testDeleteById(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        SysUser user1 = userMapper.selectById(3l);
        Assert.assertNotNull(user1);
        Assert.assertEquals(1, userMapper.deleteById(3l));
        Assert.assertNull(userMapper.selectById(3l));

        SysUser user2 = userMapper.selectById(4l);
        Assert.assertNotNull(user2);
        Assert.assertEquals(1, userMapper.deleteById(user2));
        Assert.assertNull(userMapper.selectById(4l));
        sqlSession.rollback();
    }

    @Test
    public void testSelectRolesByUserIdAndRoleEnabled(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<SysRole> roleList = userMapper.selectRolesByUserIdAndRoleEnabled(3l, 1);
        Assert.assertNotNull(roleList);
        Assert.assertTrue(roleList.size() > 0);
        sqlSession.rollback();
    }

    @Test
    public void testSelectByUser(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser user = new SysUser();
        user.setUserName("ad");
        List<SysUser> userList = mapper.selectByUser(user);
        Assert.assertTrue(userList.size() > 0);

        user = new SysUser();
        user.setUserEmail("test@mybatis.tk");
        userList = mapper.selectByUser(user);
        Assert.assertTrue(userList.size() > 0);

        user = new SysUser();
        user.setUserName("ad");
        user.setUserEmail("test@mybatis.tk");
        userList = mapper.selectByUser(user);
        Assert.assertTrue(userList.size() == 0);
    }

    @Test
    public void testUpdateByIdSelective(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser user = new SysUser();
        user.setId(3l);
        user.setUserEmail("test@mybatis.tk");
        int result = mapper.updateByIdSelective(user);
        Assert.assertEquals(1, result);
        user = mapper.selectById(3l);
        Assert.assertEquals("admin", user.getUserName());
        Assert.assertEquals("test@mybatis.tk", user.getUserEmail());
    }

    @Test
    public void testSelectByIdOrUserName(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser query = new SysUser();
        query.setId(3l);
        query.setUserName("admin");

        SysUser user = mapper.selectByIdOrUserName(query);
        Assert.assertNotNull(user);

        query.setId(null);
        user = mapper.selectByIdOrUserName(query);
        Assert.assertNotNull(user);

        query.setUserName(null);
        user = mapper.selectByIdOrUserName(query);
        Assert.assertNull(user);
    }

    @Test
    public void testSelectByIdList(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Long> list = new ArrayList<>();
        list.add(3l);
        list.add(4l);
        List<SysUser> userList =  mapper.selectByIdList(list);
        Assert.assertEquals(2, userList.size());
    }

    @Test
    public void testInsertList(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<SysUser> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            SysUser user = new SysUser();
            user.setUserName("test" + i);
            user.setUserPassword("123456");
            user.setUserEmail("test@mybatis.tk");
            userList.add(user);
        }
        int result = mapper.insertList(userList);
        Assert.assertEquals(5, result);
        for (SysUser user: userList){
            System.out.println(user.getId());
        }
    }

    @Test
    public void testUpdateByMap(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("id", 3l);
        map.put("user_email", "test@mybatis.tk");
        map.put("user_password", "ligoo123");
        mapper.updateByMap(map);
        SysUser user = mapper.selectById(3l);
        Assert.assertEquals("test@mybatis.tk", user.getUserEmail());
    }

    @Test
    public void testExample(){
        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        SysUserExample example = new SysUserExample();
        example.setOrderByClause("id desc, user_name asc");
        example.setDistinct(true);
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andIdGreaterThanOrEqualTo(3l);
        criteria.andIdLessThan(5l);
        criteria.andUserEmailLike("%mybatis%");

        SysUserExample.Criteria or = example.or();
        or.andUserNameEqualTo("admin");
        List<test.model.SysUser> userList =  mapper.selectByExampleWithBLOBs(example);
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size() > 0);

    }
}
