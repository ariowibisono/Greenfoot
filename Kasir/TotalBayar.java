import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TotalBayar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TotalBayar extends World
{

    /**
     * Constructor for objects of class TotalBayar.
     * 
     */
    public TotalBayar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        List list = new List();
        addObject(list, 300, 60);
        
        List1 list1 = new List1();
        addObject(list1, 300, 120);
        
        /*List2 list2 = new List2();
        addObject(list2, 300, 170);
        
        List3 list3 = new List3();
        addObject(list3, 300, 220);
        
        List4 list4 = new List4();
        addObject(list4, 300, 270);
        */
       Kembali kembali = new Kembali();
       addObject(kembali, 300, 350);
    }
}
