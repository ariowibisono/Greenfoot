import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() {
        move(5);
        randomTurn();
        turnAtEdge();
    }

    public void randomTurn() {
        if (Greenfoot.getRandomNumber(100) < 20) {
            turn(Greenfoot.getRandomNumber(40) - 20 );
        }
    }

    public void turnAtEdge() {
        if (atWorldEdge()){
            turn(7);
        }
    }
    //coba
    public boolean atWorldEdge() {
        if (getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if (getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }

    public boolean canSee(Class clss) {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }

    public void eat(Class clss) {
        //removeTouching(Cerry.class);
    }
}
