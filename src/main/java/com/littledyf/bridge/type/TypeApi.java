package com.littledyf.bridge.type;

import com.littledyf.bridge.color.ColorApi;
import com.littledyf.bridge.size.SizeApi;

/**
 * @Author dengyifan
 * @create 2023/11/13 10:58
 * @description
 */
public abstract class TypeApi {
    protected ColorApi colorApi;

    protected SizeApi sizeApi;

    public void setSpecification(ColorApi colorApi, SizeApi sizeApi){
        this.colorApi = colorApi;
        this.sizeApi = sizeApi;
    }

    public abstract void type();
}
