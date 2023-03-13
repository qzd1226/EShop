package com.qzd.eshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qzd.common.utils.PageUtils;
import com.qzd.eshop.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author Zongdi
 * @email sunlightcs@gmail.com
 * @date 2023-03-10 20:05:02
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

