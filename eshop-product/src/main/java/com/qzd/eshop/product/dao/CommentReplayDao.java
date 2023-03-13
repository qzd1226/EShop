package com.qzd.eshop.product.dao;

import com.qzd.eshop.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author Zongdi
 * @email sunlightcs@gmail.com
 * @date 2023-03-10 20:05:02
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
