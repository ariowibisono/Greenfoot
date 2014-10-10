import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Akhir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Akhir extends Actor
{
    /**
     * Act - do whatever the Akhir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getWorld().removeObject(this);
    }    
}
