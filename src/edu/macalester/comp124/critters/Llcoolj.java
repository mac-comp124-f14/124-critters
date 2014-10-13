package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Llcoolj extends Critter{
	
	@Override
	protected void buildGraphics() {
		
		GRect leftLeg  = new GRect(35, 200, 35, 150);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(strokeColor);
        addLeg(new Leg(leftLeg, 2));
        
        GRect rightLeg  = new GRect(75, 200, 35, 150);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(strokeColor);
        addLeg(new Leg(rightLeg, 2));
        
       
		GImage LlcoolJ = null;
		try {
			LlcoolJ = new GImage(ImageIO.read(getClass().getResource("/LLCOOLJ.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		getGraphics().add(LlcoolJ);
		
		
		addEye(new Eye(10, 0.26, 0.18, Color.RED), 95, 20);
        addEye(new Eye(10, 0.26, 0.18, Color.RED), 110, 30);
	}
	
	
	private static final Color		
		strokeColor = new Color(0, 0, 0),
		fillColor = new Color(100, 0,0);
}
