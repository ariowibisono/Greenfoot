import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OpsiBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpsiBack extends Buttom
{
    /**
     * Act - do whatever the OpsiBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("button.mp3");
            
            Menu menu = new Menu();  
            Greenfoot.setWorld(menu);
        }
    }
}
