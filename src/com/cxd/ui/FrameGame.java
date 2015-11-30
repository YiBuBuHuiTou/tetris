package com.cxd.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.cxd.config.ConfigFactory;
import com.cxd.config.GameConfig;


public class FrameGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameGame(PanelGame panelGame)  {
		this.initFrameGame(panelGame);
	}
	/**
	 * 初始化游戏框架
	 */
	private void initFrameGame(PanelGame panelGame){
		GameConfig gc = ConfigFactory.getGameConfig() ;
		this.setTitle(gc.getTitle());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(gc.getWidth(), gc.getHeight());
		this.setResizable(false);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screen.width - gc.getWidth())>>1,
				(screen.height - gc.getHeight()>>1) - 20);
		this.setContentPane(panelGame);
		this.setVisible(true);
	}
}
