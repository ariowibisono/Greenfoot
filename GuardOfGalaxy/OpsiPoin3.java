import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OpsiPoin3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpsiPoin3 extends Buttom
{
    /**
     * Act - do whatever the OpsiPoin3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int kekuatan = 2;
    static int Skor;

    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            if ((Skor >= 200) && (kekuatan > 1)) {
                Greenfoot.playSound("button.mp3");
                
                kekuatan = 1;
                Point point = new Point();
                point.Buy(200);
                
                Shot shot = new Shot();
                shot.More(kekuatan);
            }
        }
    }

    public void kekuatan (int input) {
        Skor = input;
    }
}
