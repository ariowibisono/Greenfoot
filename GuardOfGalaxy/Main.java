import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{

    /**
     * Constructor for objects of class Main.
     * 
     */
    static GreenfootSound backgroundMusic = new GreenfootSound("starbit-festival.mp3");
    public int Skor = 0;
    boolean i = false;

    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        ObjekGerak();

    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Pin pin = new Pin();
        addObject(pin, 89, 212);

        Point point = new Point();
        addObject(point, 300, 15);
    }

    public void ObjekGerak() {
        if (Greenfoot.getRandomNumber(2) < 4) {
            Enemy enemy = new Enemy();
            addObject(enemy,600, Greenfoot.getRandomNumber(190)+10);

            Asteroid ast = new Asteroid();
            addObject(ast,600, Greenfoot.getRandomNumber(190)+10);
        }
    }

    public void StopMusic(boolean input){
        if (i = true){
            backgroundMusic.stop();
        }
    }

    public void PlayMusic(boolean input){
        if (i = true){
            backgroundMusic.play();
        }
    }
}