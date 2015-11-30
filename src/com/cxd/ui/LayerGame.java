package com.cxd.ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

public class LayerGame extends Layer {
	private static final Image GAME_IMG= new ImageIcon("graphics/game/0.png").getImage();
	private static final Image GAME_B_IMG= new ImageIcon("graphics/game/3.png").getImage();
	private static final int ACT_SIZE =32 ;

	public LayerGame(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		Point[] points = this.gameDto.getGameAct().getActPoint() ;
		//打印方块
		for(int i =0;i<points.length;i++){
		g.drawImage(GAME_IMG, points[i].x*ACT_SIZE+this.getX()+SIZE, 
				points[i].y*ACT_SIZE+this.getY()+SIZE,
				points[i].x*ACT_SIZE+ACT_SIZE+this.getX()+SIZE,  
				points[i].y*ACT_SIZE+ACT_SIZE+this.getY()+SIZE, 
				32, 0, ACT_SIZE<<1, ACT_SIZE, null) ;

		}
		//打印地图
		boolean[][] map = gameDto.getGameMap() ;
		for(int x = 0;x<map.length;x++){
			for(int y =0;y<map[x].length;y++){
				if(map[x][y]){
				g.drawImage(GAME_B_IMG, x*ACT_SIZE+this.getX()+SIZE, 
						y*ACT_SIZE+this.getY()+SIZE,
						x*ACT_SIZE+ACT_SIZE+this.getX()+SIZE,  
						y*ACT_SIZE+ACT_SIZE+this.getY()+SIZE, 
						32, 0, ACT_SIZE<<1, ACT_SIZE, null) ;
			}
			}
		}
	}

}
