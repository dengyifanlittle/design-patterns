package com.littledyf.template;

/**
 * @Author dengyifan
 * @create 2023/12/12 15:44
 * @description
 */
public abstract class ExamPaperTemplate {

    public abstract String Answer1();

    public abstract String Answer2();

    public abstract String Answer3();

    public abstract String Answer4();

    public abstract String Answer5();

    private void Question1(){
        System.out.println(String.format("1+1=%s", Answer1()));
    }

    private void Question2(){
        System.out.println(String.format("1+2=%s", Answer2()));
    }

    private void Question3(){
        System.out.println(String.format("1+3=%s", Answer3()));
    }

    private void Question4(){
        System.out.println(String.format("1*1=%s", Answer4()));
    }


    /**
     * 钩子方法，子类覆盖
     */
    private void Question5(){
        System.out.println(String.format("建议:%s", Answer5() == null ? "无" : Answer5()));
    }

    /**
     * 钩子方法，子类选择性执行
     */
    boolean customer(){
        return true;
    }

    public void TemplateMethod(){
        Question1();
        Question2();
        Question3();
        if (customer()){
            Question4();
        }
        Question5();
    }
}
