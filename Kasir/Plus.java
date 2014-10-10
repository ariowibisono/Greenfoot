import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plus extends Amount
{
    /**
     * Act - do whatever the Plus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Tambah();
    }
    
    public void Tambah() {
        if (Greenfoot.mouseClicked(this)) {
            Amount tambah = new Amount();
            tambah.Tambah();
        }
    }
    
    public Plus() {
        GreenfootImage image = getImage();
        image.scale(60, 60);
        setImage(image);
    }
}
