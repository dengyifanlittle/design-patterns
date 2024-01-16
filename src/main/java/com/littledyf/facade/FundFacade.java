package com.littledyf.facade;

/**
 * @Author dengyifan
 * @create 2024/1/16 16:28
 * @description
 */
public class FundFacade {
    private StockSubSystemOne stockSubSystemOne;

    private StockSubSystemTwo stockSubSystemTwo;

    private BondSubSystemOne bondSubSystemOne;

    private BondSubSystemTwo bondSubSystemTwo;

    public FundFacade(){
        stockSubSystemOne = new StockSubSystemOne();
        stockSubSystemTwo = new StockSubSystemTwo();
        bondSubSystemOne = new BondSubSystemOne();
        bondSubSystemTwo = new BondSubSystemTwo();
    }

    public void buyFund(){
        stockSubSystemOne.buy();
        stockSubSystemTwo.buy();
        bondSubSystemOne.buy();
        bondSubSystemTwo.buy();
    }

    public void sellFund(){
        stockSubSystemOne.sell();
        stockSubSystemTwo.sell();
        bondSubSystemOne.sell();
        bondSubSystemTwo.sell();
    }

}
