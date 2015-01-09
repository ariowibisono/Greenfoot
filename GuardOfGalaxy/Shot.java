import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    /**
     * Act - do whatever the Shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int i = 0;
    static int kekuatan = 2;
    
    public void act() 
    {
        move(5);
        
        if (isTouching(Enemy.class) || isAtEdge() || isTouching(Asteroid.class)){
            if (isTouching(Enemy.class)){
                i++;
                if (i>=kekuatan) {
                    Point point = new Point();
                    point.PointSkor(15);

                    removeTouching(Enemy.class);
                    getWorld().addObject(new Enemy(),600,Greenfoot.getRandomNumber(190)+10);
                    
                    i=0;
                }
            }
            if (isTouching(Asteroid.class)){
                
            }
            getWorld().removeObject(this);
        }
    }
    
    public void More (int input) {
        kekuatan = input;
    }
} 