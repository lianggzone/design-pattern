package com.lianggzone.designpattern.adapter.example.fishingboat;

public class Client {
    
	public static void main(String[] args) {
		Captain captain = new Captain(new BattleFishingBoat());
        captain.move();
        captain.fire();
	}
}
