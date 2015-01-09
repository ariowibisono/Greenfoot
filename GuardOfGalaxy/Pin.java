import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Ikan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pin extends Actor
{
    /**
     * Act - do whatever the Ikan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int timer = 0;
    private GreenfootImage rocket = new GreenfootImage("rocket.png");
    private GreenfootImage rocket2 = new GreenfootImage("rocket2a.png");
    static GreenfootSound tembak = new GreenfootSound("bbm_tone.wav");
    static int kecepatan = 45;
    static int kelincahan = 2;

    public void act() 
    {
        // Add your action code here
        setImage(rocket);
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY()-kelincahan);
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+kelincahan);
        }
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX()+kelincahan, getY());
        }
        if (Greenfoot.isKeyDown("a")){
            setLocation(getX()-kelincahan, getY());
            setImage(rocket2);
        }

        meledak();
        tembak();
    }

    private void tembak(){
        if (timer > 0 ) {
            timer --;
        }
        if (timer == 0 && Greenfoot.isKeyDown("space")){
            getWorld().addObject(new Shot(),getX(),getY());
            timer = kecepatan;
            tembak.play();
        }
        if (!Greenfoot.isKeyDown("space")){
            tembak.stop();
        }
    }

    public void meledak(){
        if (isTouching(Enemy.class) || isTouching(Asteroid.class)){
            getWorld().removeObject(this);

            Menu menu = new Menu();  
            Greenfoot.setWorld(menu);

            Menu menu2 = new Menu();
            menu.PlayMusic(true);
            
            Main main = new Main();
            main.StopMusic(true);
        }
    }

    public void FastShot(int input){
        kecepatan = input;
    }

    public void FastMove(int input){
        kelincahan = input;
    }
}