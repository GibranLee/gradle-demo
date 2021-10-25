package com.dalelee.gradledemo.ocp;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-09-02 10:26
 **/
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }

    //Shape类，基类
    static class Shape{
        int m_type;
    }

    //这是一个用于绘图的类[使用方]
    static class GraphicEditor {
        //接收Shape对象，然后根据type，来绘制不同的图形
        public void drawShape(Shape s) {
            if (s.m_type == 1) {
                drawRectangle(s);
            } else if (s.m_type == 2) {
                drawCircle(s);
            } else if (s.m_type == 3) {
                drawTriangle(s);
            }
        }
        //绘制矩形
        public void drawRectangle(Shape r){
            System.out.println("绘制矩形");
        }
        //绘制圆形
        public void drawCircle(Shape r){
            System.out.println("绘制圆形");
        }
        //绘制三角形
        public void drawTriangle(Shape r){
            System.out.println("绘制三角形");
        }
    }

    static class Rectangle extends Shape{
        Rectangle(){
            super.m_type=1;
        }
    }
    static class Circle extends Shape{
        Circle(){
            super.m_type=2;
        }
    }
    static class Triangle extends Shape{
        Triangle(){
            super.m_type=3;
        }
    }
}
