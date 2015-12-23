package com.oharaicaine.game.blocks;

import com.oharaicaine.game.graphics.Texture;
import com.oharaicaine.game.graphics.VertexArray;
import com.oharaicaine.game.maths.Vector3f;
import com.oharaicaine.game.utils.Index;

public class StoneFloorBlock extends Block{

	public StoneFloorBlock(Vector3f pos) {
		super(pos);
		this.pos = pos;
		this.mesh = new VertexArray(Index.vertcies(size, 0.0f), Index.indices(), Index.tcs());
		this.texture = new Texture("res/stonefloor.png");
	}
	
	@Override
	public void update(){
		
	}

}
