import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int acak;
    //turn(acak);

    public void act()
    {
        acak = Greenfoot.getRandomNumber(2)+1;
        if (acak == 1) {
            setLocation(getX()-4, getY()+acak);
        } else
            setLocation(getX()-4, getY()-acak);
            
        if (isAtEdge()){
            //getWorld().removeObject(this);
            setLocation (600, Greenfoot.getRandomNumber(380)+20);
        }
    }    
}
