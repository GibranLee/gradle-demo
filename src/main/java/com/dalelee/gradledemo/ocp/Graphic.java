package com.dalelee.gradledemo.ocp;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-09-02 10:27
 **/
public class Graphic {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }

    //抽象类
    static abstract class Shape{
        int m_type;
        //抽象方法
        public abstract void draw();
    }

    //这是一个用于绘图的类[使用方]
    static class GraphicEditor {
        //接收Shape对象，调用draw方法
        public void drawShape(Shape s) {
            s.draw();
        }
    }

    static class Rectangle extends Shape {
        Rectangle(){
            super.m_type=1;
        }
        @Override
        public void draw() {
            System.out.println("绘制矩形");
        }
    }

    static class Circle extends Shape {
        Circle(){
            super.m_type=2;
        }
        @Override
        public void draw() {
            System.out.println("绘制圆形");
        }
    }

    static class Triangle extends Shape {
        Triangle(){
            super.m_type=3;
        }
        @Override
        public void draw() {
            System.out.println("绘制三角形");
        }
    }

    //新增一个图形
    static class OtherGraphic extends Shape{
        OtherGraphic(){
            super.m_type=4;
        }
        @Override
        public void draw() {
            System.out.println("绘制其它图形");
        }
    }


}
