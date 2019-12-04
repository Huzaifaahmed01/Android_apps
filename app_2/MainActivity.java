package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Scanner;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


abstract class calArea{

    abstract void findTriangle(double b, double h);
    abstract void findRectangle(double l, double b);
    abstract void findSquare(double s);
    abstract void findCircle(double r);

}
class findArea extends calArea{
    void findTriangle(double b,double h){

        double Area = (h*b)/2;
        System.out.println("Area of Triangle: " + Area);
    }
    void findRectangle(double l,double b){

        double Area = (l * b);
        System.out.println("Area of Rectangle: " + Area);
    }
    void findSquare(double s){

        double Area = s*s;
        System.out.println("Area of Square: " + Area);
    }
    void findCircle(double r){

        double Area = 3.14 * r * r ;
        System.out.println("Area of Circle: " + Area);
    }
}


class Area{
    public static void main(String[] args){
        double r,l,b,h,s;
        findArea  area = new findArea();
        Scanner get =  new Scanner(System.in);

        System.out.println("Enter Base and vertical height: ");
        b = get.nextDouble();
        h = get.nextDouble();
        area.findTriangle(b, h);

        System.out.println("Enter length and breadth: ");
        b = get.nextDouble();
        l = get.nextDouble();
        area.findRectangle(l,b);

        System.out.println("Enter side of Square: ");
        s = get.nextDouble();

        area.findSquare(s);

        System.out.println("Enter radius of circle: ");
        r = get.nextDouble();
        area.findCircle(r);

    }
}


