package com.littledyf.builder.one;

import java.util.List;

/**
 * @Author dengyifan
 * @create 2023/11/14 9:40
 * @description
 */
public abstract class Builder {

    public abstract void buildName(String name);

    public abstract void buildRequires(List<String> requires);

    public abstract void buildNotRequires(List<String> notRequires);

    public abstract Product getProduct();
}
