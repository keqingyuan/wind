package org.qingyuan.wind.controller.stock;

import org.hsweb.web.core.datasource.DynamicDataSource;
import org.hsweb.web.core.logger.annotation.AccessLogger;
import org.hsweb.web.core.authorize.annotation.Authorize;
import org.hsweb.web.bean.common.QueryParam;
import org.qingyuan.wind.bean.stock.Stock;
import org.hsweb.web.controller.GenericController;
import org.hsweb.web.core.message.ResponseMessage;
import org.springframework.web.bind.annotation.RestController;
import org.qingyuan.wind.service.stock.StockService;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 股票控制器
 * Created by hsweb-generator
 */
@RestController
@RequestMapping(value = "/stock")
@AccessLogger("股票")
@Authorize(module = "stock")
public class StockController extends GenericController<Stock, String> {

    @Resource
    private  StockService stockService;

    @Override
    public  StockService getService() {
        return this.stockService;
    }

    @Override
    public ResponseMessage list(QueryParam param) {
        DynamicDataSource.use("wind");
        ResponseMessage responseMessage = super.list(param);
        DynamicDataSource.useDefault();
        return responseMessage;
    }
}
