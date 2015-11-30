package com.cxd.config;

/**
 * 游戏中窗口的配置
 * @author Arrow
 *
 */
public class LayerConfig {
	private String className ;
	private int x ;
	private int y ;
	private int w ;
	private int h ;


	public String getClassName() {
		return className;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	public LayerConfig(String className, int x, int y, int w, int h) {
		this.className = className;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

}
