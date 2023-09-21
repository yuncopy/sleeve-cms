package io.github.talelin.latticy.model.my;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * Banner实体类
 */
@Getter
@Setter
@TableName("banner")
public class BannerDo  {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * banner 名称
     */
    private String name;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String img;
    /**
     * 描述
     */
    private String description;

    @JsonIgnore
    private Date updateTime;

    @JsonIgnore
    private Date createTime;

    @JsonIgnore
    @TableLogic
    private Date deleteTime;
}
