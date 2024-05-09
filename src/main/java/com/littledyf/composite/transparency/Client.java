package com.littledyf.composite.transparency;

/**
 * @Author dengyifan
 * @create 2024/5/9 10:40
 * @description
 */
public class Client {

    public static void main(String[] args) {

        Component component = new Composite("北京总公司");
        component.add(new LeafOne("北京总公司财务部门"));
        component.add(new LeafTwo("北京总公司技术部门"));


        Component component1 = new Composite("上海分公司");
        component1.add(new LeafOne("上海分公司财务部门"));
        component1.add(new LeafTwo("上海分公司技术部门"));
        component.add(component1);



        Component component2 = new Composite("深圳分公司");
        component2.add(new LeafOne("深圳分公司财务部门"));
        component2.add(new LeafTwo("深圳分公司技术部门"));
        component.add(component2);

        System.out.println("公司架构：");
        component.display(1);
        System.out.println("职能：");
        component.operation();

    }
}
