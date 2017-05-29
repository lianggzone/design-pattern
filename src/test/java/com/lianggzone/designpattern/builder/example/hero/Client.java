package com.lianggzone.designpattern.builder.example.hero;

import com.lianggzone.designpattern.builder.example.hero.Hero.Builder;

public class Client {
	
	public static void main(String[] args) {
		Builder builder = new Hero.Builder();
		//Hero hero = builder.setName("梁桂钊").setArmor("盔甲").setWeapon("武器").build();
		Hero hero = builder.setName("梁桂钊").setArmor("盔甲").build();
		System.out.println(hero);
	}
}
