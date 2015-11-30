package com.cxd.ui;

import java.awt.Graphics;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.cxd.config.ConfigFactory;
import com.cxd.config.GameConfig;
import com.cxd.config.LayerConfig;
import com.cxd.controller.PlayerController;
import com.cxd.dto.GameDto;

public class PanelGame extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Layer> layers = null;
	private GameDto gameDto ;
	public PanelGame(GameDto gameDto) {
		this.gameDto = gameDto ;
		this.initComponent();
		// 初始化窗口组件
		this.initLayer();
		
	}
	private void initComponent(){

	}
	public void setGameController(PlayerController playerController){
		this.addKeyListener(playerController);
		
		
	}
	

	/**
	 * 初始化窗口
	 */
	private void initLayer() {
		try {
			// 获取游戏参数对象
			GameConfig cfg = ConfigFactory.getGameConfig();
			// 获取游戏参数对象中的窗口参数对象
			List<LayerConfig> layersCfg = cfg.getLayersConfig();
			layers = new ArrayList<Layer>();
			// 取出窗口参数对象中的参数
			for (LayerConfig layerCfg : layersCfg) {
				// 获取一个类对象
				Class<?> cls = Class.forName(layerCfg.getClassName());
				// 获取构造函数
				Constructor<?> ctr = cls.getConstructor(int.class, int.class,
						int.class, int.class);
				// 创建对象
				Layer l = (Layer) ctr.newInstance(layerCfg.getX(),
						layerCfg.getY(), layerCfg.getW(), layerCfg.getH());
				//将数据传入layer
				l.setGameDto(gameDto);
				layers.add(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public PanelGame() {
	// lays = new Layer[] {
	// new LayerBackground(0, 0, 0, 0) ,
	// new LayerDataBase(32, 50, 250, 250),
	// new LayerDisk(32, 377, 250, 250),
	// new LayerGame(330, 50, 320, 576),
	// new LayerButton(700, 50, 250, 40),
	// new LayerNext(700, 130, 113, 100),
	// new LayerLevel(825, 130, 125, 100),
	// new LayerPoint(700, 265, 250, 150),
	// new LayerAbout(700, 450, 250, 176), };
	// }

	@Override
	protected void paintComponent(Graphics g) {
		//调用父类方法
		super.paintComponent(g);
		
		//绘制界面
		for (Layer l : layers) {
			l.paint(g);
		}
		//返回焦点
		this.requestFocus();
		
	}
}
