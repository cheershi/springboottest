package com.tnar.mytest.springboottest.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tnar.mytest.springboottest.mapper.UserMapper;
import com.tnar.mytest.springboottest.model.User;
import com.tnar.mytest.springboottest.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈丰
 * @since 2018-11-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    public List<User> selectConnectById(Integer id){
        return  this.baseMapper.selectConnectById(id);
    }

    public List<User> selectConnect(){
        return  this.baseMapper.selectConnect();
    }

    public Page<User> selectConnect(Page<User> page){
        return  page.setRecords(this.baseMapper.selectConnect(page));
    }

    public List<User> selectDynamic(User user){
        return this.baseMapper.selectDynamic(user);
    }
}
