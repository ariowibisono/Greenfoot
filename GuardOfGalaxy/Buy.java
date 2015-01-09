import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buy extends Buttom
{
    /**
     * Act - do whatever the Buy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("button.mp3");
            
            OpsiBuy buy = new OpsiBuy();  
            Greenfoot.setWorld(buy);
        }
    }

    public Buy() {
        GreenfootImage image = getImage();
        image.scale(150, 100);
        setImage(image);
    }
}
