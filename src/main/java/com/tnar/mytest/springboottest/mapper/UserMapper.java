package com.tnar.mytest.springboottest.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.tnar.mytest.springboottest.model.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 陈丰
 * @since 2018-11-07
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> selectConnectById(Integer id);

    List<User> selectConnect();

    List<User> selectConnect(Pagination page);

    List<User> selectDynamic(User user);
}
