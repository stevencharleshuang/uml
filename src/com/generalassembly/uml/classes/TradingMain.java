package com.generalassembly.uml.classes;

public class TradingMain implements Market {
    private final TradeDAL TradeDAL = new TradeDAL(new JdbcTemplate());
    private Market marketTemplate;

    public void bookTrade(Asset asset) {
    }

    protected void saveTradeDetails() {
    }
}
