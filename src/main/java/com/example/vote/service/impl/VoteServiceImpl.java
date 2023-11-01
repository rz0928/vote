package com.example.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.vote.entity.Vote;
import com.example.vote.mapper.VoteMapper;
import com.example.vote.service.VoteService;
import org.springframework.stereotype.Service;

/**
 * 投票实体类(Vote)表服务实现类
 *
 * @author makejava
 * @since 2023-11-01 09:59:27
 */
@Service("voteService")
public class VoteServiceImpl extends ServiceImpl<VoteMapper, Vote> implements VoteService {

}
