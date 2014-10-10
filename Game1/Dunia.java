import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{

    /**
     * Constructor for objects of class Dunia.
     * 
     */
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Turtle turtle = new Turtle();
        addObject(turtle, 380, 53);
        
        Ikan ikan = new Ikan();
        addObject(ikan, 46, 220);
        
        /*Umpan umpan = new Umpan();
        addObject(umpan, 142, 105);
        Umpan umpan2 = new Umpan();
        addObject(umpan2, 316, 68);
        Umpan umpan3 = new Umpan();
        addObject(umpan3, 468, 71);
        */
        addObject(new Umpan(), Greenfoot.getRandomNumber(600)+50, 3);
        
        addObject(cntr, 35, 42);
    }
    
    counter cntr=new counter();
    public counter getcounter(){
        return cntr;
    }
    
    public static boolean MULAI = false;
    public void started(){
        MULAI=true;
        Awal awal=new Awal();
        addObject(awal,300,200);
        for(int i=0;i<1000;i++);
    }
    
    public void stopped(){
        Akhir akhir=new Akhir();
        addObject(akhir,300,200);
        for(int i=0;i<1000;i++);
    }
}
