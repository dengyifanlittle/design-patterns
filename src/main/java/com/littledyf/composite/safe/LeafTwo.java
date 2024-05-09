package com.littledyf.composite.safe;

/**
 * @Author dengyifan
 * @create 2024/5/9 10:56
 * @description
 */
public class LeafTwo extends Component{
    private String name;
    public LeafTwo(String name) {
        this.name = name;
    }

    @Override
    void display(int depth) {
        System.out.println("深度:" + depth + " 名称:" + name);
    }

    @Override
    void operation() {
        System.out.println(name + "技术操作");
    }
}
