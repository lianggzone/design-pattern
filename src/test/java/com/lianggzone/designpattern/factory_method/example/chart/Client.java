package com.lianggzone.designpattern.factory_method.example.chart;

public class Client {
	public static void main(String[] args) {
		ChartFactory pieFactory = new PieFactory();
		Pie pie = (Pie) pieFactory.create();
		pie.display();

		ChartFactory lineFactory = new LineFactory();
		Line line = (Line) lineFactory.create();
		line.display();
	}
}
