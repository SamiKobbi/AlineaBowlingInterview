package com.interview.alinea.katabowling;

import com.interview.alinea.katabowling.models.Game;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  //4+10+8+10+2+8
   	//Game game = new Game("11#11#X#11#11#1/#11#11#11#11");
   //	int score = game.score();
   	//9+10+10+10+10+9+10+9+9+9+8+10+10+10+10+10+10
		
		 Game game3 = new Game("81#9/#X#X#81#72#X#X#X#8/9"); int score3 =
		 game3.score(); System.out.println(score3);
		 
    	Game game2 = new Game("X#X#X#X#X#X#X#X#X#XXX");
    	System.out.print(game2.score());
    }
}
