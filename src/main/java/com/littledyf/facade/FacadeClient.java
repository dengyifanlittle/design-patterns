package com.littledyf.facade;

/**
 * @Author dengyifan
 * @create 2024/1/16 16:33
 * @description
 */
public class FacadeClient {
    public static void main(String[] args) {
        FundFacade fundFacade = new FundFacade();

        fundFacade.buyFund();

        fundFacade.sellFund();
    }
}
