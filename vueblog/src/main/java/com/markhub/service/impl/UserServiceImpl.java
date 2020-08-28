package com.markhub.service.impl;

import com.markhub.entity.User;
import com.markhub.mapper.UserMapper;
import com.markhub.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Frenkie
 * @since 2020-08-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
