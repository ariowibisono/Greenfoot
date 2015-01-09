import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Buttom
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("button.mp3");
            
            OpsiHelp help = new OpsiHelp();  
            Greenfoot.setWorld(help);
        }
    }    
    
    public Help() {
        GreenfootImage image = getImage();
        image.scale(150, 100);
        setImage(image);
    }
}
