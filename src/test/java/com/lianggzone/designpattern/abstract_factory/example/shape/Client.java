package com.lianggzone.designpattern.abstract_factory.example.shape;

public class Client {
	public static void main(String[] args) {
		AbstractShapeFactory blueShapeFactory = new BlueShapeFactory();
		blueShapeFactory.createCircle().draw();
		blueShapeFactory.createRectangle().draw();
		blueShapeFactory.createSquare().draw();
		
		AbstractShapeFactory greenShapeFactory = new GreenShapeFactory();
		greenShapeFactory.createCircle().draw();
		greenShapeFactory.createRectangle().draw();
		greenShapeFactory.createSquare().draw();	
	}
}
