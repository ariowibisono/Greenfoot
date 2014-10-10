import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mineral here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mineral extends PilihanMenu
{
    /**
     * Act - do whatever the Mineral wants to do. This method is called whenever
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
            item.setPesan("Mineral Rp 3.000");
            
            Add add = new Add();
            add.FixPesanan("Mineral");
            
            Add add2 = new Add();
            add2.setHarga(3000);
        }
    }

    public Mineral() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
}
