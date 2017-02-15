package org.qingyuan.wind.service.impl.stock;

import org.hsweb.web.bean.common.QueryParam;
import org.qingyuan.wind.bean.stock.Stock;
import org.qingyuan.wind.dao.stock.StockMapper;
import org.hsweb.web.service.impl.AbstractServiceImpl;
import org.qingyuan.wind.service.stock.StockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 股票服务类
 * Created by generator
 */
@Service("stockService")
public class StockServiceImpl extends AbstractServiceImpl<Stock, String> implements StockService {

    @Resource
    protected StockMapper stockMapper;

    @Override
    protected StockMapper getMapper() {
        return this.stockMapper;
    }
}
