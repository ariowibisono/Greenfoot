import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awal extends Actor
{
    /**
     * Act - do whatever the Awal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.delay(100);
        getWorld().removeObject(this);
        Greenfoot.delay(0);
    }    
}
