import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    static GreenfootSound backgroundMusic = new GreenfootSound("into-the-galaxy.mp3");
    boolean i = false;
    public Menu()
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
        Play play = new Play();
        addObject(play, 120, 337);
        Buy buy = new Buy();
        addObject(buy, 300, 337);
        Help help = new Help();
        addObject(help, 480, 337);
        Judul judul = new Judul();
        addObject(judul, 303, 145);
        
        Enemy enemy = new Enemy();
        addObject(enemy,600, Greenfoot.getRandomNumber(190)+10);

        Asteroid ast = new Asteroid();
        addObject(ast,600, Greenfoot.getRandomNumber(190)+10);
        
        if (i = false){
            removeObject(enemy);
            removeObject(ast);
        }
    }

    public void started(){
        backgroundMusic.play();
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
