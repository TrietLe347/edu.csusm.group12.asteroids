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
 
    }

    @Test
    public void testPlayerDontNeedRemoval() {
        
        assertTrue(player.needsRemoval());

    }

    @Test
    public void testPlayerInitialKillScore() {
        int killscore = player.getKillScore();
        assertEquals(0,killscore);

    }

    
}
