package com.example.vote.entity;

import java.util.Date;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 投票实体类(Vote)表实体类
 *
 * @author makejava
 * @since 2023-11-01 09:59:27
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("vote")
public class Vote  {
@TableId
    private Long id;

//选项名
    private String name;

    private Date createTime;
//截止时间，null表示无截止时间
    private Date deadline;
//删除标志（0代表未删除，1代表已删除）
    private Integer delFlag;
}
