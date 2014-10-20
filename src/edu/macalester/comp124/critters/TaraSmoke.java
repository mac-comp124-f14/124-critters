package edu.macalester.comp124.critters;

import acm.graphics.GOval;

/**
 * Created by Tara on 10/16/2014.
 */
public class TaraSmoke extends GOval {


	private double lastX, lastY;
	private double velX, velY;
	private double size;

	public TaraSmoke(double x, double y, double size, double vX, double vY) {
		super(size, size);
		this.size=size;
		setFilled(true);
		lastX=x;
		lastY=y;
		velX=vX;
		velY=vY;
	}

	public void updatePos(double x, double y){
		double dx=lastX-x, dy=lastY-y;
		lastX=x;
		lastY=y;
		move(dx, dy);
		move(velX, velY);
		size-=.05;
		setSize(size, size);

	}
	public boolean lives(){
		return size>0;
	}

}
