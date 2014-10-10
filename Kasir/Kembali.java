import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kembali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kembali extends Actor
{
    /**
     * Act - do whatever the Kembali wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int ResetAngka = 0;
    static String ResetHuruf = " - ";
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Amount amount = new Amount();
            amount.Reset(ResetAngka);
            
            ListAdd listadd = new ListAdd();
            listadd.ResetKata(ResetHuruf);
            
            ListAdd listadd2 = new ListAdd();
            listadd2.ResetAngka(ResetAngka);
            
            Menu menu = new Menu();
            Greenfoot.setWorld(menu);
        }
    }
}