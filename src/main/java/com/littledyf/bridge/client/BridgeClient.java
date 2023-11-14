package com.littledyf.bridge.client;

import com.littledyf.bridge.color.GreenApi;
import com.littledyf.bridge.color.RedApi;
import com.littledyf.bridge.size.LApi;
import com.littledyf.bridge.size.MApi;
import com.littledyf.bridge.type.LongType;
import com.littledyf.bridge.type.ShortType;
import com.littledyf.bridge.type.TypeApi;

/**
 * @Author dengyifan
 * @create 2023/11/13 11:03
 * @description
 */
public class BridgeClient {
    public static void main(String[] args) {
        TypeApi longType = new LongType();
        longType.setSpecification(new RedApi(), new LApi());
        longType.type();


        TypeApi shortType = new ShortType();
        shortType.setSpecification(new GreenApi(), new MApi());
        shortType.type();
    }
}
