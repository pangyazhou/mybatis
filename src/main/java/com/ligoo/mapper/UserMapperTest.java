package com.ligoo.mapper;

import com.ligoo.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.util.List;


public class UserMapperTest {
    Logger logger = LoggerFactory.getLogger(UserMapperTest.class);
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            List<User> userList = sqlSession.selectList("selectAll");
            printUserList(userList);
        }finally {
            sqlSession.close();
        }
    }

    public void printUserList(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }
}
