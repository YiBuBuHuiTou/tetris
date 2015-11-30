package com.cxd.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlayerController extends KeyAdapter{
	private GameController gameController ;
	public PlayerController(GameController gameController){
		this.gameController = gameController ;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//TODO
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			this.gameController.keyUp(); break ;
		case KeyEvent.VK_DOWN:
			this.gameController.keyDown() ;break ;
		case KeyEvent.VK_RIGHT:
			this.gameController.keyRight() ;break ;
		case KeyEvent.VK_LEFT:
			this.gameController.keyLeft();break ;
			default:break ;
		}
	}
}
