import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class List3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class List3 extends ListTotal
{
    /**
     * Act - do whatever the List3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static String nama;
    static int harga;
    static int jumlah;
    
    public void act() 
    {
        Tampil();
    }
    
    public void Tampil(){
        //setImage(new GreenfootImage(harga+" "+nama+" = "+jumlah,40,Color.black,null));
    }
    
    public void Nama(String input) {
        nama = input;
    }
    
    public void Harga(int input) {
        harga = input;
    }
    
    public void Jumlah(int input) {
        jumlah = input;
    }  
}
