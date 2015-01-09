import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OpsiBuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpsiBuy extends World
{

    /**
     * Constructor for objects of class OpsiBuy.
     * 
     */
    public OpsiBuy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        Point point = new Point();
        addObject(point, 300, 15);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        OpsiPoin1 opsipoin1 = new OpsiPoin1();
        addObject(opsipoin1, 180, 140);
        OpsiPoin2 opsipoin2 = new OpsiPoin2();
        addObject(opsipoin2, 430, 140);
        OpsiPoin3 opsipoin3 = new OpsiPoin3();
        addObject(opsipoin3, 180, 307);
        OpsiBack opsiback = new OpsiBack();
        addObject(opsiback, 430, 300);
    }
}
