package com.cxd.ui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerLevel extends Layer {
	private static final Image IMG_LEVEL= new ImageIcon("graphics/string/level.png").getImage(); ;

	public LayerLevel(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		g.drawImage(IMG_LEVEL, this.getX()+PADDING, this.getY()+PADDING, null) ;
		g.setFont(new Font("黑体",Font.BOLD+Font.ITALIC,64));
		g.drawString(String.valueOf(this.gameDto.getLevel()), this.getX()+PADDING+32, this.getY()+PADDING+85);
	}
}
