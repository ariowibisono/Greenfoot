import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OpsiPoin1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpsiPoin1 extends Buttom
{
    /**
     * Act - do whatever the OpsiPoin1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int kecepatan = 45;
    static int Skor;
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            if (Skor >= 200) {
                Greenfoot.playSound("button.mp3");
                
                kecepatan -= 5;
                Point point = new Point();
                point.Buy(200);
                Pin pin = new Pin();
                pin.FastShot(kecepatan);
            }
        }
    }
    
    public void kecepatan (int input) {
        Skor = input;
    }
}
