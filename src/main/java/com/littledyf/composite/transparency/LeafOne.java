package com.littledyf.composite.transparency;

/**
 * @Author dengyifan
 * @create 2024/5/9 10:20
 * @description
 */
public class LeafOne extends Component{

    private String name;
    public LeafOne(String name) {
        this.name = name;
    }

    @Override
    void add(Component component) {

    }

    @Override
    void remove(Component component) {

    }

    @Override
    void display(int depth) {
        System.out.println("深度:" + depth + " 名称:" + name);
    }

    @Override
    void operation() {
        System.out.println(name + "财务操作");
    }
}
