package com.lianggzone.designpattern.adapter.example.fishingboat;

import org.junit.Test;

/**
 * <h3>概要:</h3><p>FishingBoatTest</p>
 * <h3>功能:</h3><p>FishingBoatTest</p>
 * <h3>履历:</h3>
 * <li>2017年5月24日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class FishingBoatTest {
    
    @Test
    public void test(){
        Captain captain = new Captain(new BattleFishingBoat());
        captain.move();
        captain.fire();
	}
}
