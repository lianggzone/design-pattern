package com.lianggzone.designpattern.simple_factory.example.chart;

public class Client {
	public static void main(String[] args) {
		ChartFactory chartFactory = new ChartFactory();
		
		Pie pie = (Pie) chartFactory.getChart("PIE");
		pie.display();

		Line line = (Line) chartFactory.getChart("LINE");
		line.display();
	}
}
