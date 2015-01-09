import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Judul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Judul extends Buttom
{
    /**
     * Act - do whatever the Judul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long startTime = System.currentTimeMillis();  
    long currentTime = System.currentTimeMillis();
    
    int durationMillis = (int)(currentTime - startTime);  
    int durationSecs = durationMillis / 1000; 

    public void act() 
    {
        // Add your action code here.
    }    

    public Judul() {
        GreenfootImage image = getImage();
        image.scale(500, 100);
        setImage(image);
        /*
        if (durationSecs > 5) {
            image.scale(600, 200);
        }
        */
    }
}
