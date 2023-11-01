package com.example.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vote.entity.Options;
import org.apache.ibatis.annotations.Mapper;


/**
 * 投票选项表(Options)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-01 09:59:24
 */
@Mapper
public interface OptionsMapper extends BaseMapper<Options> {

}


