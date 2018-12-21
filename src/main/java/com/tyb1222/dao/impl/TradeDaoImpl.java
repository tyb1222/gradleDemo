package com.tyb1222.dao.impl;

import com.tyb1222.beans.TradeInfo;
import com.tyb1222.dao.TradeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TradeDaoImpl implements TradeDao {

    @Autowired
    private TradeDao tradeDao;

    @Override
    public void insert(TradeInfo tradeInfo) {
        tradeDao.insert(tradeInfo);
    }
}
