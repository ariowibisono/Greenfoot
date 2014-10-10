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
        Burger burger = new Burger();
        addObject(burger, 80, 220);

        Hotdog hotdog = new Hotdog();
        addObject(hotdog, 220, 220);

        Kebab kebab = new Kebab();
        addObject(kebab, 355, 220);

        Kentang kentang = new Kentang();
        addObject(kentang, 80, 330);

        Soda soda = new Soda();
        addObject(soda, 220, 330);

        Mineral mineral = new Mineral();
        addObject(mineral, 355, 330);

        Pay pay = new Pay();
        addObject(pay, 504, 340);

        Add add = new Add();
        addObject(add, 503, 228);

        Item item = new Item();
        addObject(item, 215, 90);

        Jumlah jumlah = new Jumlah();
        addObject(jumlah, 100, 137);

        Judul judul = new Judul();
        addObject(judul, 202, 22);

        Deskripsi1 deskripsi1 = new Deskripsi1();
        addObject(deskripsi1, 202, 44);

        Amount amount = new Amount();
        addObject(amount, 285, 138);

        Plus plus = new Plus();
        addObject(plus, 333, 145);
        Min min = new Min();
        addObject(min, 236, 145);
        
        Deskripsi2 deskripsi2 = new Deskripsi2();
        addObject(deskripsi2, 492, 24);
    }
}
