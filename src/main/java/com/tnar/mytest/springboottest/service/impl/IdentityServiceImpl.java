package com.tnar.mytest.springboottest.service.impl;

import com.tnar.mytest.springboottest.model.Identity;
import com.tnar.mytest.springboottest.mapper.IdentityMapper;
import com.tnar.mytest.springboottest.service.IIdentityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈丰
 * @since 2018-11-07
 */
@Service
public class IdentityServiceImpl extends ServiceImpl<IdentityMapper, Identity> implements IIdentityService {

}
