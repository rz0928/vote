package com.example.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vote.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * 用户表(User)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-01 09:59:27
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}


