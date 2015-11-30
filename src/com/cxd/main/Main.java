package com.cxd.main;

import com.cxd.controller.GameController;
import com.cxd.controller.PlayerController;
import com.cxd.dto.GameDto;
import com.cxd.service.GameService;
import com.cxd.ui.FrameGame;
import com.cxd.ui.PanelGame;

public class Main {
	public static void main(String[] args) throws Exception{
		//创建游戏数据
		GameDto gameDto = new GameDto() ;
		//创建游戏面板
		PanelGame pg = new PanelGame(gameDto) ;
		//创建游戏逻辑块(安装游戏数据)
		GameService gameService = new GameService(gameDto) ;
		//创建游戏控制器(连接游戏面板与逻辑块)
		GameController gameController = new GameController(pg,gameService) ;
		//创建玩家控制器（连接游戏控制器）
		PlayerController playerController = new PlayerController(gameController) ;
		pg.setGameController(playerController);
		//创建游戏窗口（安装游戏面板）
		 new FrameGame(pg) ;	
	
	}

}
