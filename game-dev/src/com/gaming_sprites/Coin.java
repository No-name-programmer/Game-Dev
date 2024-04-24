package com.gaming_sprites;
import com.Scores;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Coin extends Sprite {
    public Coin(int x) {
        w = 80;
        h = 80;
        this.x = x;
        y = 450;
        image = new ImageIcon(Player.class.getResource("game-coin.gif"));
    }
    // public int x;
	// public int y;
	// public int w;
	// public int h;
	// public Scores score;
	// private Player player;
	// public Boolean isCollected = false;
	
	// public Coin(int x, Player player, Scores score)
	// {
	// 	this.x = x;
	// 	y = 450;
	// 	w = 80;
	// 	h = 80;
	// 	this.score = score;
	// 	this.player = player;
	// }
	
	// @SuppressWarnings("removal")
	// public void isCollected()
	// {
		
	// 	Thread thread = new Thread(()->
	// 	{
	// 		isCollected = player.hasCollected(this, score);
	// 	});
	// 	thread.start();
	// 	if(isCollected == true)
	// 		thread.stop();

	// }
	
	// public void drawCoin(Graphics g)
	// {
	// 	g.setColor(Color.YELLOW);
	// 	g.fillOval(x, y, w, h);
	// }
}
