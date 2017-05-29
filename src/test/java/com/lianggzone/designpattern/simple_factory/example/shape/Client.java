package com.lianggzone.designpattern.simple_factory.example.shape;


public class Client {
	public static void main(String[] args) {
		SimpleShapeFactory shapeFactory = new SimpleShapeFactory();

		Shape circle = shapeFactory.createShape("CIRCLE");
		circle.draw();

		Shape rectangle = shapeFactory.createShape("RECTANGLE");
		rectangle.draw();

		Shape square = shapeFactory.createShape("SQUARE");
		square.draw();
	}
}
