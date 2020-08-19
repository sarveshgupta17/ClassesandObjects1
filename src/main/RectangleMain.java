package main;
import customclass.Rectangle;

public class RectangleMain {
    public static void main(String[] args){
        Rectangle obj=new Rectangle();
        System.out.println("length="+obj.l);
        System.out.println("breadth="+obj.b);
        obj.l=20;
        obj.b=10;
        System.out.println("new length="+obj.l);
        System.out.println("new breadth="+obj.b);
        System.out.println("area is ="+obj.area());
        System.out.println("breadth is ="+obj.perimeter());
    }
}
