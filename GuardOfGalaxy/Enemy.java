import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() {
        setLocation(getX()-5, getY());
        if (isAtEdge()){
            //getWorld().removeObject(this);
            setLocation (600, Greenfoot.getRandomNumber(380)+20);
        }
    }    
}
