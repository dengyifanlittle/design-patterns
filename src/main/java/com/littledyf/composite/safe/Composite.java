package com.littledyf.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dengyifan
 * @create 2024/5/9 10:20
 * @description
 */
public class Composite extends Component{
    private List<Component> children = new ArrayList<>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }
    @Override
    void display(int depth) {
        System.out.println("深度:" + depth + " 名称:" + name);
        for (Component component : children) {
            component.display(depth + 1);
        }
    }

    @Override
    void operation() {
        for (Component component : children){
            component.operation();
        }
    }
}
