package com.littledyf.composite.safe;


/**
 * @Author dengyifan
 * @create 2024/5/9 10:58
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite("北京总公司");
        composite.add(new LeafOne("北京总公司财务部门"));
        composite.add(new LeafTwo("北京总公司技术部门"));


        Composite composite1 = new Composite("上海分公司");
        composite1.add(new LeafOne("上海分公司财务部门"));
        composite1.add(new LeafTwo("上海分公司技术部门"));
        composite.add(composite1);



        Composite composite2 = new Composite("深圳分公司");
        composite2.add(new LeafOne("深圳分公司财务部门"));
        composite2.add(new LeafTwo("深圳分公司技术部门"));
        composite.add(composite2);

        System.out.println("公司架构：");
        composite.display(1);
        System.out.println("职能：");
        composite.operation();
    }
}
