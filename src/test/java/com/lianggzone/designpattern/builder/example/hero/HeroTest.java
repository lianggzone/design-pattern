package com.lianggzone.designpattern.builder.example.hero;

import org.junit.Test;

import com.lianggzone.designpattern.builder.example.hero.Hero.Builder;

public class HeroTest {
	
	@Test
	public void test(){
		Builder builder = new Hero.Builder();
		//Hero hero = builder.setName("梁桂钊").setArmor("盔甲").setWeapon("武器").build();
		Hero hero = builder.setName("梁桂钊").setArmor("盔甲").build();
		System.out.println(hero);
	}
}
