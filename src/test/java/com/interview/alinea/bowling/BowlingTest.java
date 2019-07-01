package com.interview.alinea.bowling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.interview.alinea.katabowling.models.Game;

public class BowlingTest {
	@Test
	public void computeBowlingScoreProvidedExample() {
		Game game = new Game("81#9/#X#X#81#72#X#X#X#8/9");
		assertEquals(game.score(), 191);
	}

	@Test
	public void computeBowlingScoreExample() {
		Game game = new Game("11#11#X#11#11#1/#11#11#11#11");
		assertEquals(game.score(), 39);
	}

	@Test
	public void computeBowlingMaxScore() {
		Game game = new Game("X#X#X#X#X#X#X#X#X#XXX");
		assertEquals(game.score(), 300);
	}

	@Test
	public void computeBowlingMinScore() {
		Game game = new Game("00#00#00#00#00#00#00#00#00#00");
		assertEquals(game.score(), 0);
	}

}
