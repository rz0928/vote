package com.example.vote.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 投票选项表(Options)表实体类
 *
 * @author makejava
 * @since 2023-11-01 09:59:26
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("options")
public class Options  {
@TableId
    private Long id;

//选项名
    private String name;
//得票数
    private Integer number;
//所属投票实体
    private Long voteId;

}
