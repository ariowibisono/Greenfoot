import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kentang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kentang extends PilihanMenu
{
    /**
     * Act - do whatever the Kentang wants to do. This method is called whenever
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
            item.setPesan("Kentang Rp 5.000");
            
            Add add = new Add();
            add.FixPesanan("Kentang");
            
            Add add2 = new Add();
            add2.setHarga(5000);
        }
    }
    
    public Kentang() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
}
