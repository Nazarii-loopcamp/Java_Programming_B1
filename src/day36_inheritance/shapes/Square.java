package day36_inheritance.shapes;

import day36_inheritance.access.a.Second;

public class Square extends Shape {
    double side;

    public Square (double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double area (){
        return side * side;
    }

    @Override
    public double perimeter () {
        return side*4;
    }

//    @Override
//    public String toString() {
//        return "Square{" +
//                "side=" + side +
//                '}';
//    }


    @Override
    public String toString() {
        return "Square side " + side +
                " name " + name;
    }
}
