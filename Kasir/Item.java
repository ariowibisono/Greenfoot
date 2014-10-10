import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends Actor
{
    /**
     * Act - do whatever the Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static String pesanan = " - ";
    
    public void act() 
    {
        setPesanan();
    }  
    
    public void setPesanan() {
        setImage(new GreenfootImage(pesanan+"",60,Color.black,null));
    }
    
    public void setPesan(String input){
        if (pesanan.equals(" - ")){
            pesanan = input;
        } else {
            pesanan += input;
            
            Add add = new Add();
            add.FixPesanan(pesanan);
        }
        setPesanan();
    }
    
    public void cekItem(){
        pesanan = " - ";
    }
}
