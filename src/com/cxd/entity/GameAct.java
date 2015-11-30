package com.cxd.entity;

import java.awt.Point;

public class GameAct {
	private static final int MIN_X = 0;
	private static final int MIN_Y = 0;
	private static final int MAX_X = 9;
	private static final int MAX_Y = 17;

	private Point[] actPoint;

	public GameAct() {
		init(0);
	}

	public void init(int actCode) {
		this.actPoint = new Point[] { 
				new Point(4, 0), 
				new Point(3, 0),
				new Point(5, 0),
				new Point(5, 1) 
				};
	}

	public Point[] getActPoint() {
		return actPoint;
	}

	/**
	 * 移动方块
	 * 
	 * @param moveX
	 *            X轴偏移量
	 * @param moveY
	 *            Y轴偏移量
	 */
	public boolean move(int moveX, int moveY) {

		for (Point point : actPoint) {
			int newX = point.x + moveX;
			int newY = point.y + moveY;
			if (isOverMap(newX, newY)) {
				return false;
			}
		}
		for (Point point : actPoint) {
			point.x += moveX;
			point.y += moveY;
		}
		return true;
	}

	/**
	 * 方块旋转 顺时针旋转公式 o为原点、A为旋转之前的点、B为旋转之后的点 B.x = o.x +o.y -B.y B.y = o.y -o.x
	 * +B.x
	 */
	public void round() {
		for (Point point : actPoint) {
			int newX = actPoint[0].x + actPoint[0].y - point.y;
			int newY = actPoint[0].y - actPoint[0].x + point.x;
			if (isOverMap(newX, newY)) {
				return;
			}
		}
		for (Point point : actPoint) {
			int newX = actPoint[0].x + actPoint[0].y - point.y;
			int newY = actPoint[0].y - actPoint[0].x + point.x;
			point.x = newX;
			point.y = newY;
		}

	}

	/**
	 * 判断是否超出边界
	 * 
	 * @param newX
	 * @param newY
	 * @return
	 */
	private boolean isOverMap(int newX, int newY) {
		if (newX < MIN_X || newX > MAX_X || newY < MIN_Y || newY > MAX_Y) {
			return true;
		} else {
			return false;
		}
	}
}
