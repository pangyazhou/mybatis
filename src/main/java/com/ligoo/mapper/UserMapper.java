package com.ligoo.mapper;

import com.ligoo.model.SysRole;
import com.ligoo.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     *  通过 id 查询用户
     *
     * @param id
     * @rturn
     * */
    SysUser selectById(Long id);

    /**
     * 查询全部用户
     *
     * @return
     * */
    List<SysUser> selectAll();

    /**
     * 通过用户id获取角色信息
     *
     * @param userId
     * @return
     * */
    List<SysRole> selectRolesByUserId(Long userId);

    /**
     * 新增用户
     *
     * @param user
     * @return
     * */
    int insert(SysUser user);


    /**
     * 根据主键更新
     *
     * @param user
     * @return
     * */
    int updateById(SysUser user);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     * */
    int deleteById(Long id);

    /**
     * 通过主键删除
     *
     * @param user
     * @return
     * */
    int deleteById(SysUser user);

    /**
     * 根据用户id和角色的enabled状态获取用户角色
     *
     * @param userId
     * @param enabled
     * @return
     * */
    List<SysRole> selectRolesByUserIdAndRoleEnabled(
            @Param("userId") Long userId,
            @Param("enabled") Integer enabled);


    /**
     * 根据动态条件查询用户信息
     *
     * @param user
     * @return
     * */
    List<SysUser> selectByUser(SysUser user);

    /**
     * 根据主键更新
     *
     * @param user
     * @return
     * */
    int updateByIdSelective(SysUser user);


    /**
     * 根据用户id或用户名查询
     *
     * @param user
     * @return
     * */
    SysUser selectByIdOrUserName(SysUser user);

    /**
     * 根据用户id集合查询
     *
     * @param idList
     * @return
     * */
    List<SysUser> selectByIdList(@Param("myList") List<Long> idList);

    /**
     * 批量插入用户信息
     *
     * @param userList
     * @return
     * */
    int insertList(@Param("userList") List<SysUser> userList);

    /**
     * 通过Map更新列
     *
     * @param map
     * @return
     * */
    int updateByMap(Map<String,Object> map);
}
