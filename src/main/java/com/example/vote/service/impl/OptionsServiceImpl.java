package com.example.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.vote.entity.Options;
import com.example.vote.mapper.OptionsMapper;
import com.example.vote.service.OptionsService;
import org.springframework.stereotype.Service;

/**
 * 投票选项表(Options)表服务实现类
 *
 * @author makejava
 * @since 2023-11-01 09:59:26
 */
@Service("optionsService")
public class OptionsServiceImpl extends ServiceImpl<OptionsMapper, Options> implements OptionsService {

}
