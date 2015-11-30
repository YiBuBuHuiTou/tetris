package com.cxd.service;

import java.awt.Point;

import com.cxd.dto.GameDto;
import com.cxd.entity.GameAct;

public class GameService {
	private GameDto gameDto;

	public GameService(GameDto gameDto) {
		this.gameDto = gameDto;
		GameAct gameAct = new GameAct();
		gameDto.setGameAct(gameAct);
	}

	public void keyUp() {
		// TODO
		gameDto.getGameAct().round();
	}

	public void keyDown() {
		if (gameDto.getGameAct().move(0, 1)) {
			return;
		}
		// 获得地图对象
		boolean[][] map = gameDto.getGameMap();
		Point[] act = gameDto.getGameAct().getActPoint();
		for (Point point : act) {
			map[point.x][point.y] = true;
		}
		// TODO判断是否可以消行
		// 消行
		// 算分
		// 判断是否可以升级
		// 升级
		// 刷新一个新的方块
		gameDto.getGameAct().init(0);
	}

	public void keyRight() {
		gameDto.getGameAct().move(1, 0);
	}

	public void keyLeft() {
		gameDto.getGameAct().move(-1, 0);
	}
}
