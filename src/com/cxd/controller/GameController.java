package com.cxd.controller;

import com.cxd.service.GameService;
import com.cxd.ui.PanelGame;

public class GameController {
	/**
	 * 游戏界面
	 */
	private PanelGame panelGame;
	/**
	 * 游戏逻辑
	 */
	private GameService gameService;

	public GameController(PanelGame panelGame, GameService gameService) {
		this.panelGame = panelGame;
		this.gameService = gameService;
	}

	public void keyUp() {
		gameService.keyUp();
		this.panelGame.repaint();
	}

	public void keyDown() {
		gameService.keyDown();
		this.panelGame.repaint();
	}

	public void keyRight() {
		gameService.keyRight();
		this.panelGame.repaint();
	}

	public void keyLeft() {
		gameService.keyLeft();
		this.panelGame.repaint();
	}

}
