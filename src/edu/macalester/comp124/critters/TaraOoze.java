package edu.macalester.comp124.critters;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import acm.graphics.*;
import sun.plugin2.util.SystemUtil;

/**
 * Created by Tara on 10/16/2014.
 */
public class TaraOoze extends Critter {

	private double time;
	private int lastPuddle;

	public TaraOoze(){
		super();
		time=0;
		lastPuddle=0;
	}

	@Override
	public void moveTowardsGoal(double dt){
		super.moveTowardsGoal(dt);
		time+=dt;
		if(lastPuddle+.5<=(int)time){
			lastPuddle=(int)time;
			spawnSmoke();
		}
		GCompound g=getGraphics();
		GObject object;

		// Update smoke
		ArrayList<TaraSmoke> toRemove=new ArrayList<TaraSmoke>();
		for(int a=0; a<g.getElementCount(); a++){
			object=g.getElement(a);
			if(object instanceof TaraSmoke) {
				TaraSmoke t=(TaraSmoke)object;
				t.updatePos(g.getX(), g.getY());
				if(!t.lives()){
					toRemove.add(t);
				}
			}
		}

		for(TaraSmoke t:toRemove){
			g.remove(t);
		}

	}

	private void spawnSmoke(){
		GCompound g=getGraphics();
		double velX=.5, velY=-.5;
		TaraSmoke temp=new TaraSmoke(g.getX(), g.getY(), 10, velX, velY);
		temp.setColor(new Color(40,40,40));
		temp.move(44,24);
		g.add(temp);
	}

	@Override
	protected void buildGraphics() {

		// Body
		GImage muk = null;
		try {
			muk = new GImage(ImageIO.read(getClass().getResource("/muksmall.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getGraphics().add(muk);

		// Eyes
		Color pupil=new Color(0,0,0);
		addEye(new Eye(3, .2, 0, pupil), 67/2,22/2);
		addEye(new Eye(4, .2, 0, pupil), 120/2,20/2);

	}
}
