import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Ikan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ikan extends Actor
{
    /**
     * Act - do whatever the Ikan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int nyawa=0;
    
    public void act() 
    {
        // Add your action code here.
        makan();
        
        move(4);
        
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")){
            turn(3);
        }
        /*if (isAtEdge())
        {
            turn(180);
            if (getRotation()==180)
            {
                left();
            }else{
                right();
            }
        }else{
            if (getRotation()==0)
            {
                right();
            }else{
                left();
            }
        }*/
        
        if (isTouching(Turtle.class)) {
            nyawa++;
            setLocation (Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(300));
            if (nyawa>2){
                Greenfoot.stop();
            }
        }
    }

    private void left()
    {
        setLocation(getX()-4, getY());
    }

    private void right()
    {
        setLocation(getX()+4, getY());
    }
    
    public void makan(){
        if(isTouching(Umpan.class)){
            removeTouching(Umpan.class);
            getWorld().addObject(new Umpan(), Greenfoot.getRandomNumber(600)+50, Greenfoot.getRandomNumber(200)+3);
            World myWorld = getWorld();
            Dunia dn = (Dunia)myWorld;
            counter cntr = dn.getcounter();
            cntr.addscore();
        }
    }
}
