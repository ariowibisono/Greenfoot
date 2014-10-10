import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Umpan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Umpan extends Actor
{
    /**
     * Act - do whatever the Umpan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        if (isAtEdge()) {
            turn(300);
            if (getRotation()==180)
            {
                naik();
            }else{
                turun();
            }
        }else{
            if (getRotation()==0)
            {
                turun();
            }else{
                naik();
            }
        }
    }
    
    private void naik()
    {
        setLocation(getX(),getY()-(Greenfoot.getRandomNumber(12)));
    }

    private void turun()
    {
        setLocation(getX(), getY()+(Greenfoot.getRandomNumber(12)));
    }    
}
