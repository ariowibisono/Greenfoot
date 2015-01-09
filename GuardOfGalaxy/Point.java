import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point extends Actor
{
    /**
     * Act - do whatever the Point wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int Skor = 100;

    public void act() 
    {
        setImage (new GreenfootImage("Point : "+Skor, 20, Color.black, Color.white));

        OpsiPoin1 poin1 = new OpsiPoin1();
        poin1.kecepatan(Skor);
        OpsiPoin2 poin2 = new OpsiPoin2();
        poin2.kelincahan(Skor);
        OpsiPoin3 poin3 = new OpsiPoin3();
        poin3.kekuatan(Skor);
    }

    public void PointSkor (int input){
        Skor += input;
    }

    public void Buy (int input) {
        Skor -= input;
    }
}
