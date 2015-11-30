package com.cxd.ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.cxd.config.ConfigFactory;
import com.cxd.config.GameConfig;
import com.cxd.dto.GameDto;

public abstract class Layer {
	protected static final int PADDING ;
	protected static final int SIZE ;
	private static final Image WINDOW_IMG= new ImageIcon("graphics/window/Window.png").getImage(); ;
	private int x;
	private int y ;
	private int w ;
	private int h ;
	protected GameDto gameDto ;
	
	static{
		GameConfig gf = ConfigFactory.getGameConfig() ;
		PADDING = gf.getPadding() ;
		SIZE = gf.getWindowsize() ;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public void setGameDto(GameDto gameDto) {
		this.gameDto = gameDto;
	}
	public Layer(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	protected void createWindow(Graphics g){
		
		g.drawImage(WINDOW_IMG, x,y, x + SIZE, y + SIZE, 0, 0, SIZE, SIZE, null);
		g.drawImage(WINDOW_IMG, x,y+SIZE, x+SIZE, y +SIZE+ h, 0, SIZE, SIZE, 57, null);
		g.drawImage(WINDOW_IMG, x,y+SIZE+h, x + SIZE, y + SIZE*2+h, 0, 57, SIZE, SIZE+57, null);
		g.drawImage(WINDOW_IMG, x+SIZE,y, x+SIZE+w, y +SIZE, SIZE, 0, SIZE+50, SIZE, null);
		g.drawImage(WINDOW_IMG, x+SIZE+w,y, x + SIZE*2+w, y + SIZE, 57, 0, 64, SIZE, null);
		g.drawImage(WINDOW_IMG, x+SIZE+w,y+SIZE,x + SIZE*2+w, y +SIZE+ h, 0, SIZE, SIZE, 57, null);
		g.drawImage(WINDOW_IMG, x+SIZE,y+SIZE+h, x+SIZE+w, y +SIZE*2+h, SIZE, 0, SIZE+50, SIZE, null);
		g.drawImage(WINDOW_IMG,  x+SIZE+w,y+SIZE+h, x + SIZE*2+w , y +SIZE*2+h, 57, 57, 64, 64, null);
		
		
	}
	/**
	 * 刷新游戏内容
	 * @param g 画笔
	 */
	abstract public void  paint(Graphics g) ;
	
	
}
