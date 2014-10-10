import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hotdog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hotdog extends PilihanMenu
{
    /**
     * Act - do whatever the Hotdog wants to do. This method is called whenever
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
            item.setPesan("Hotdog Rp 7.000");
            
            Add add = new Add();
            add.FixPesanan("Hotdog");
            
            Add add2 = new Add();
            add2.setHarga(7000);
        }
    }
    
    public Hotdog() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
}
