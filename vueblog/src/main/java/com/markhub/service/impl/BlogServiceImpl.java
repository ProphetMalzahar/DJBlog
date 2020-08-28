package com.markhub.service.impl;

import com.markhub.entity.Blog;
import com.markhub.mapper.BlogMapper;
import com.markhub.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
