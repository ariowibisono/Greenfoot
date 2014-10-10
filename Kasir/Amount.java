import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Amount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Amount extends Actor
{
    /**
     * Act - do whatever the Amount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int Jumlah = 0;
    
    public void act() 
    {
        setJumlah();
        setTotal();
    }
    
    public void setTotal() {
       Add add = new Add();
       add.setSuperTotal(Jumlah);
    }
    
    public void setJumlah() {
        setImage(new GreenfootImage(Jumlah+"",35,Color.black,Color.white));
    }
    
    public void Tambah() {
        Jumlah++;
    }
    
    public void Kurang() {
        if (Jumlah > 0) {
            Jumlah--;
        }
    }
    
    public void Reset(int input) {
        Jumlah = input;
    }
}