package com.fox.lzhoumall.product.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fox.lzhoumall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lzhou
 * @email 1978352576qq.com
 * @date 2021-11-04 11:35:30
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

