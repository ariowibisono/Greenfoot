import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OpsiPoin2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpsiPoin2 extends Buttom
{
    /**
     * Act - do whatever the OpsiPoin2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int kelincahan = 2;
    static int Skor;

    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            if (Skor >= 200) {
                Greenfoot.playSound("button.mp3");
                
                kelincahan += 1;
                Point point = new Point();
                point.Buy(200);
                Pin pin = new Pin();
                pin.FastMove(kelincahan);
            }
        }
    }

    public void kelincahan (int input) {
        Skor = input;
    }
}