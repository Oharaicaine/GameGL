package com.oharaicaine.game.world;

import java.awt.image.BufferedImage;
import java.util.concurrent.CopyOnWriteArrayList;

import com.oharaicaine.game.blocks.Block;
import com.oharaicaine.game.blocks.StoneFloorBlock;
import com.oharaicaine.game.blocks.StoneWallBlock;
import com.oharaicaine.game.graphics.Shader;
import com.oharaicaine.game.maths.Vector3f;
import com.oharaicaine.game.utils.Utils;

public class World {
	
	private BufferedImage map;
	private float mapSize = 20;
	
	public static CopyOnWriteArrayList<Block> worldMap = new CopyOnWriteArrayList<Block>();
	
	public World() {
		map = Utils.loadBufferedImage("res/map.png");
		initMap();
	}
	
	
	private void initMap() {
		
		for(int x = 0; x < mapSize; x++){
			for(int y = 0; y < mapSize; y++){
				int col = map.getRGB(x, y);
				switch(col & 0xFFFFFF){
					case 0x808080:
						worldMap.add(new StoneFloorBlock(new Vector3f(x-10.0f, y-10.0f, 0.0f)));
						break;
					case 0x404040:
						worldMap.add(new StoneWallBlock(new Vector3f(x-10.0f, y-10.0f, 0.0f)));
						break;	
				}
			}
		}	
		
	}


	public void update(){}
	
	public void render(){
		Shader.BASIC.enable();
		for (Block block : worldMap) {
			block.render();
		}
		Shader.BASIC.disable();
			
	}

}
