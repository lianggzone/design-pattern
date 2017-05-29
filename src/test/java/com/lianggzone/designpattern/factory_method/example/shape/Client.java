package com.lianggzone.designpattern.factory_method.example.shape;

public class Client {
	public static void main(String[] args) {
		ShapeFactory circleFactory = new CircleFactory();
		Shape circle = circleFactory.create();
		circle.draw();

		ShapeFactory rectangleFactory = new RectangleFactory();
		Shape rectangle = rectangleFactory.create();
		rectangle.draw();

		ShapeFactory squareFactory = new SquareFactory();
		Shape square = squareFactory.create();
		square.draw();
	}
}
