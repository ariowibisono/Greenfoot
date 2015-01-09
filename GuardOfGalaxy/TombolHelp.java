import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TombolHelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolHelp extends Buttom
{
    /**
     * Act - do whatever the TombolHelp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage help = new GreenfootImage("TombolHelp.png");
    private GreenfootImage spasi = new GreenfootImage("TombolHelp2.png");
    private GreenfootImage w = new GreenfootImage("TombolHelp3.png");
    private GreenfootImage a = new GreenfootImage("TombolHelp4.png");
    private GreenfootImage s = new GreenfootImage("TombolHelp5.png");
    private GreenfootImage d = new GreenfootImage("TombolHelp6.png");
    private GreenfootImage enter = new GreenfootImage("TombolHit.png");
    private GreenfootImage enter1 = new GreenfootImage("8.png");
    
    static int i = 0;

    public void act() 
    {
        if (i == 0) {
            setImage(help);
            if (Greenfoot.isKeyDown("w")) {
                setImage(w);
            }
            if (Greenfoot.isKeyDown("s")){
                setImage(s);
            }
            if (Greenfoot.isKeyDown("d")){
                setImage(d);
            }
            if (Greenfoot.isKeyDown("a")){
                setImage(a);
            }
            if (Greenfoot.isKeyDown("space")){
                setImage(spasi);
            }
            if (Greenfoot.isKeyDown("escape")){
                Menu menu = new Menu();  
                Greenfoot.setWorld(menu);
            }
            if (Greenfoot.isKeyDown("enter")){
                i = 1;
            }
        }
        if (i == 1){
            setImage(enter);
            if (Greenfoot.isKeyDown("c")){
                i = 2;
            }
        }
        if (i == 2){
            setImage(enter1);
            if (Greenfoot.isKeyDown("escape")){
                i = 0;
                Menu menu = new Menu();  
                Greenfoot.setWorld(menu);
            }
        }
    }    
}
