package com.example.vote.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 用户投票关系表(UserVote)表实体类
 *
 * @author makejava
 * @since 2023-11-01 09:59:27
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_vote")
public class UserVote  {
//投票编号@TableId
    private Long voteId;
//用户编号@TableId
    private Long userId;




}
