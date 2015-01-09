import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Buttom
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("button.mp3");
            
            Main main = new Main();  
            Greenfoot.setWorld(main);

            Menu menu = new Menu();
            menu.StopMusic(true);
            
            Main PlayMusikMain = new Main();
            PlayMusikMain.PlayMusic(true);
        }
    }

    public Play() {
        GreenfootImage image = getImage();
        image.scale(150, 100);
        setImage(image);
    }

}
