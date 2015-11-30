package com.cxd.ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerBackground extends Layer{
  
	public LayerBackground(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
	private static final Image IMG_BG = new ImageIcon("graphics/background/light.jpg").getImage() ;
	@Override
	public void paint(Graphics g) {
		g.drawImage(IMG_BG, 0, 0,1000,700, null) ;
		
	}
}
