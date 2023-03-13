package com.qzd.eshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qzd.common.utils.PageUtils;
import com.qzd.eshop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Zongdi
 * @email sunlightcs@gmail.com
 * @date 2023-03-10 20:05:02
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

