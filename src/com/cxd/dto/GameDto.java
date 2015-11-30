package com.cxd.dto;

import java.util.List;

import com.cxd.entity.GameAct;

public class GameDto {
	/**
	 * 数据库记录
	 */
	private List<Player> dbRecode ;
	/**
	 * 本地记录
	 */
	private List<Player> diskRecode ;
	
	private boolean[][] gameMap ;
	private GameAct gameAct ;
	private int next ;
	private int level ;
	private int nowPoint ;
	private int nowRemoveLine ;
	public List<Player> getDbRecode() {
		return dbRecode;
	}
	public void setDbRecode(List<Player> dbRecode) {
		this.dbRecode = dbRecode;
	}
	public List<Player> getDiskRecode() {
		return diskRecode;
	}
	public void setDiskRecode(List<Player> diskRecode) {
		this.diskRecode = diskRecode;
	}
	public boolean[][] getGameMap() {
		return gameMap;
	}
	public void setGameMap(boolean[][] gameMap) {
		this.gameMap = gameMap;
	}
	public GameAct getGameAct() {
		return gameAct;
	}
	public void setGameAct(GameAct gameAct) {
		this.gameAct = gameAct;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getNowPoint() {
		return nowPoint;
	}
	public void setNowPoint(int nowPoint) {
		this.nowPoint = nowPoint;
	}
	public int getNowRemoveLine() {
		return nowRemoveLine;
	}
	public void setNowRemoveLine(int nowRemoveLine) {
		this.nowRemoveLine = nowRemoveLine;
	}
	public GameDto() {
		doInit() ;
	}
	/**
	 * dto初始化
	 */
	public void doInit(){
		//TODO
		this.gameMap = new boolean[10][18] ;
		//TODO初始化所有游戏对象
	}

}
