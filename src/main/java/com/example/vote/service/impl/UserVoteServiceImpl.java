package com.example.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.vote.entity.UserVote;
import com.example.vote.mapper.UserVoteMapper;
import com.example.vote.service.UserVoteService;
import org.springframework.stereotype.Service;

/**
 * 用户投票关系表(UserVote)表服务实现类
 *
 * @author makejava
 * @since 2023-11-01 09:59:27
 */
@Service("userVoteService")
public class UserVoteServiceImpl extends ServiceImpl<UserVoteMapper, UserVote> implements UserVoteService {

}
