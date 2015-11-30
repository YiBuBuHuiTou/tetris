package com.cxd.config;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * 游戏配置包含窗口的配置
 * @author Arrow
 *
 */
public class GameConfig {
	private int width;
	private int height;
	private int windowsize;
	private int padding;
	private String title ;
	

	public String getTitle() {
		return title;
	}

	private List<LayerConfig> layersConfig;

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getWindowsize() {
		return windowsize;
	}

	public int getPadding() {
		return padding;
	}

	public List<LayerConfig> getLayersConfig() {
		return layersConfig;
	}

	public GameConfig() throws DocumentException {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("config/cfg.xml");
		Element game = doc.getRootElement();
		Element frame = game.element("frame");
		// 读取窗口参数
		this.setUiConfig(frame);

	}

	/**
	 * 读取窗口参数
	 * 
	 * @param frame
	 */
	@SuppressWarnings("unchecked")
	private void setUiConfig(Element frame) {
		this.title = frame.attributeValue("title") ;
		this.height =Integer.parseInt(frame.attributeValue("height"));
		this.width =Integer.parseInt(frame.attributeValue("width"));
		this.windowsize =Integer.parseInt(frame.attributeValue("windowsize"));
		this.padding =Integer.parseInt(frame.attributeValue("padding"));
		List<Element> layers = frame.elements("layer");
		layersConfig = new ArrayList<LayerConfig>();
		for (Element e : layers) {
			LayerConfig lc = new LayerConfig(
					                 e.attributeValue("className"),
					Integer.parseInt(e.attributeValue("x")), 
					Integer.parseInt(e.attributeValue("y")), 
					Integer.parseInt(e.attributeValue("w")), 
					Integer.parseInt(e.attributeValue("h")));
			layersConfig.add(lc);
		}

	}

	/**
	 * 读取系统参数
	 */
	private void setSystemConfig() {
		// TODO
	}

	/**
	 * 读取数据访问参数
	 */
	private void setDataConfig() {
		// TODO
	}
}
