package edu.csusm.group12.asteroids.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PlayerTest {

	private Player player;

	@BeforeEach
	public void setup() {
		player = new Player();
	}
	
	@Test
    public void testPlayerCreation() {
        assertNotNull(player);
        System.out.print("Player Creation Test Successfull");
    }

    @Test
    public void testPlayerDontNeedRemoval() {
        
        assertFalse(player.needsRemoval());
        System.out.print("Dont Need Removal Test Successfull");
    }

    @Test
    public void testPlayerInitialKillScore() {
        int killscore = player.getKillScore();
        assertEquals(0,killscore);
        System.out.print("KillScore Test Successfull");
    }

    
}
