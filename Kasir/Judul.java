import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Judul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Judul extends Actor
{
    /**
     * Act - do whatever the Judul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Menu();
    }
    
    public void Menu() {
        setImage(new GreenfootImage(" Menu Cafe de Hihe\' ",30,Color.magenta,Color.black));
    }
}
