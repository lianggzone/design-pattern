package com.lianggzone.designpattern.abstract_factory.example.simple_reflection;


public class Client {

	public static void main(String[] args) {
		ShapeFactory blueShapeFactory = new ShapeFactory();
		blueShapeFactory.createCircle().draw();
		blueShapeFactory.createRectangle().draw();
		blueShapeFactory.createSquare().draw();
	}
}
