package com.littledyf.template;

/**
 * @Author dengyifan
 * @create 2023/12/12 15:51
 * @description
 */
public class TemplateClient {
    public static void main(String[] args) {
        ExamPaperTemplate examPaperTemplate1 = new StudentConcrete1();
        examPaperTemplate1.TemplateMethod();
        System.out.println("============");
        ExamPaperTemplate examPaperTemplate2 = new StudentConcrete2();
        examPaperTemplate2.TemplateMethod();
    }

}
