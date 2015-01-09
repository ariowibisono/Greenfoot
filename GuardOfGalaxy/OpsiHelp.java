import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class OpsiHelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpsiHelp extends World
{
    /**
     * Constructor for objects of class OpsiHelp.
     * 
     */
    public OpsiHelp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //
        TombolHelp tombolhelp = new TombolHelp();
        addObject(tombolhelp, 300, 200);
    }
}
