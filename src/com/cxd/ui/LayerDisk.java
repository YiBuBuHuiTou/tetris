package com.cxd.ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerDisk extends Layer {
	private static final Image IMG_DISK= new ImageIcon("graphics/string/disk.png").getImage(); ;

	public LayerDisk(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
		g.drawImage(IMG_DISK, this.getX()+PADDING, this.getY()+PADDING, null) ;
	}
}
