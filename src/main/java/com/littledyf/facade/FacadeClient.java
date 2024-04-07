package com.littledyf.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
