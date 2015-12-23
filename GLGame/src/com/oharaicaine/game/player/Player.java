package com.oharaicaine.game.player;

import java.awt.geom.Rectangle2D;

import com.oharaicaine.game.graphics.Shader;
import com.oharaicaine.game.graphics.Texture;
import com.oharaicaine.game.graphics.VertexArray;
import com.oharaicaine.game.maths.Matrix4f;
import com.oharaicaine.game.maths.Vector3f;
import com.oharaicaine.game.utils.Index;

public class Player {

	
	private float size = 1.0f;
	private VertexArray mesh;
	private Texture texture;
	
	private Vector3f pos = new Vector3f();
	private Rectangle2D.Float bounds;
	
	public Player(){
		mesh = new VertexArray(Index.vertcies(size, 0.2f), Index.indices(), Index.tcs());
		texture = new Texture("res/player.png");
		bounds = new Rectangle2D.Float(pos.x, pos.y, size, size);
	}
	
	public void update(){}
	
	public void render(){
		Shader.BASIC.enable();
		Shader.BASIC.setUniformMat4f("vw_matrix", Matrix4f.translate(new Vector3f(-pos.x, -pos.y, 0.0f)));
		Shader.BASIC.disable();
		
		Shader.PLAYER.enable();
		texture.bind();
		mesh.render();
		Shader.PLAYER.disable();

	}
	
}
