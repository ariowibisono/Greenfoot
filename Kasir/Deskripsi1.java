import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Deskripsi1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deskripsi1 extends Judul
{
    /**
     * Act - do whatever the Deskripsi1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Menu();
    }
    
    public void Menu() {
        setImage(new GreenfootImage("(Klik icon untuk memesan)",15,Color.black,null));
    }  
}
