package com.cxd.ui;

import java.awt.Graphics;

public class LayerPoint extends Layer {
	public LayerPoint(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void paint(Graphics g) {
		this.createWindow(g);
	}

}
