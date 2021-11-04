package com.fox.lzhoumall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.fox.lzhoumall.product.dao.BrandDao;
import com.fox.lzhoumall.product.entity.BrandEntity;
import com.fox.lzhoumall.product.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }
}
