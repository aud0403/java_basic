package oop1.ex;

public class Rectangle {
    int width;
    int height;

     void calculateArea() {
         int area= width * height;
         System.out.println("정사격형 넓이: "+area);
    }
     void calculatePerimeter() {
        int perimeter= 2*(width + height);
         System.out.println("정사각형 둘레 :"+perimeter);
    }
     void isSquare() {
        if( width == height){
            System.out.println("정사각형이다.");
        }else{
            System.out.println("정사각형 아니다.");
        }
    }

}
