import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Jumlah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumlah extends Item
{
    /**
     * Act - do whatever the Jumlah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setBanyak();
    }
    
    public void setBanyak() {
        setImage(new GreenfootImage("Banyaknya :",35,Color.black,null));
    }
}
