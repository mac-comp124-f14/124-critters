package edu.macalester.comp124.critters;

import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Paul Cantrell
 */
public class CritterProgram extends GraphicsProgram {
    
    private static final double TARGET_FPS = 30, MIN_EFFECTIVE_FPS = 5;
    
    private final Random rand = new Random();
    private List<Class<? extends Critter>> critterClasses;
    private List<Critter> critters;
    
    @Override
    public void run() {
        loadCritterClassess();
        critters = new ArrayList<Critter>();
        for(int n = 0; n < 20; n++)
            addNewCritter();
        
        long prevFrameTime = 0;
        while(true) {
            long frameTime = System.currentTimeMillis();
            double dt = Math.min(1 / MIN_EFFECTIVE_FPS, (frameTime - prevFrameTime) / 1000.0);
            
            moveCritters(dt);
            
            prevFrameTime = frameTime;
            pause(1000 / TARGET_FPS);
        }
    }

    private void addNewCritter() {
        Critter critter = createRandomCritter();
        
        GObject g = critter.getGraphics();
        g.setLocation(randLocationFor(critter.getGraphics()));
        chooseNewGoal(critter);
        critter.setSpeed(rand.nextDouble() * 20 + 10);
        
        add(critter.getGraphics());
        critters.add(critter);
    }
    
    private Critter createRandomCritter() {
        Class<? extends Critter> critterClass = critterClasses.get(rand.nextInt(critterClasses.size()));
        try {
            return critterClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate " + critterClass, e);
        }
    }

    private void moveCritters(double dt) {
        for(Critter critter : critters) {
            critter.moveTowardsGoal(dt);
            
            // Near our goal? Just time to go somewhere else? Pick a new direction!
            double distToGoal = Math.hypot(
                critter.getGoal().getX() - critter.getGraphics().getX(),
                critter.getGoal().getY() - critter.getGraphics().getY());
            if(distToGoal < critter.getSize() || rand.nextDouble() < dt / 10)
                chooseNewGoal(critter);
        }
    }
    
    /**
     * Finds all subclasses of Critter in this package.
     */
    private void loadCritterClassess() {
        Reflections reflections = new Reflections(getClass().getPackage().getName());
        critterClasses = new ArrayList<Class<? extends Critter>>(
            reflections.getSubTypesOf(Critter.class));
    }

    /**
     * Sends the critter off in a new direction.
     */
    private void chooseNewGoal(Critter critter) {
        critter.setGoal(randLocationFor(critter.getGraphics()));
    }
    
    /**
     * Picks a random location that will approximately fit the given graphics object within the window.
     */
    private GPoint randLocationFor(GObject g) {
        return new GPoint(
            rand.nextDouble() * (getWidth()  - g.getWidth()),
            rand.nextDouble() * (getHeight() - g.getHeight()));
    }
}
