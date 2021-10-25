package com.dalelee.gradledemo.abstractc;

public abstract class TestAbstract {
    private String str;

    public void make(){
        select();
    }

    private void select() {
        System.out.println("第一步，选择材料豆子");
    }

    abstract void addCondiment();
}
