package com.littledyf.template;

/**
 * @Author dengyifan
 * @create 2023/12/12 15:51
 * @description
 */
public class StudentConcrete1 extends ExamPaperTemplate{
    @Override
    public String Answer1() {
        return "2";
    }

    @Override
    public String Answer2() {
        return "3";
    }

    @Override
    public String Answer3() {
        return "4";
    }

    @Override
    public String Answer4() {
        return null;
    }

    @Override
    public String Answer5() {
        return null;
    }

    @Override
    boolean customer(){
        return false;
    }

}
