import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends PilihanMenu
{
    /**
     * Act - do whatever the Burger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()   
    {  
        Memesan();
    }

    public void Memesan() {
        if (Greenfoot.mouseClicked(this)) {
            Item cek = new Item();
            cek.cekItem();
            
            Item item = new Item();
            item.setPesan("Burger Rp 10.000");
            
            Add add = new Add();
            add.FixPesanan("Burger");
            
            Add add2 = new Add();
            add2.setHarga(10000);
        }
    }
    
    public Burger() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
}
