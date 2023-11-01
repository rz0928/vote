package com.example.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vote.entity.Vote;
import org.apache.ibatis.annotations.Mapper;


/**
 * 投票实体类(Vote)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-01 09:59:27
 */
@Mapper
public interface VoteMapper extends BaseMapper<Vote> {

}


