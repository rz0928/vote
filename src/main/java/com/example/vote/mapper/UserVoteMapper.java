package com.example.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vote.entity.UserVote;
import org.apache.ibatis.annotations.Mapper;


/**
 * 用户投票关系表(UserVote)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-01 09:59:27
 */
@Mapper
public interface UserVoteMapper extends BaseMapper<UserVote> {

}


