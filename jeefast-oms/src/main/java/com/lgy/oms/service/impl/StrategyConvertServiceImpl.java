package com.lgy.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lgy.oms.domain.StrategyConvertShop;
import com.lgy.oms.mapper.StrategyConvertShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lgy.oms.mapper.StrategyConvertMapper;
import com.lgy.oms.domain.StrategyConvert;
import com.lgy.oms.service.IStrategyConvertService;

import java.util.List;

/**
 * 转单策略 服务层实现
 *
 * @author lgy
 * @date 2019-10-31
 */
@Service
public class StrategyConvertServiceImpl extends ServiceImpl<StrategyConvertMapper, StrategyConvert> implements IStrategyConvertService {

    @Autowired
    protected StrategyConvertShopMapper shopMapper;

    @Override
    public List<StrategyConvertShop> getConvertShop(String gco) {
        return shopMapper.getConvertShop(gco);
    }

    @Override
    public boolean changeAuto(Long id, String auto) {
        return shopMapper.changeAuto(id, auto);
    }
}