import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class ListAdd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListAdd extends Actor
{
    /**
     * Act - do whatever the ListAdd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int ListTotal = 0;
    static int Harga = 0;
    static int Jumlah = 0;
    static int JumlahTotal = 0;
    static String daftar;
    static int i = 1;
    
    public void act()
    {
        List();
        //Harga = 0;
        //Jumlah = 0; //nanti ini diganti
    }
    
    public void List(){
        setImage(new GreenfootImage(daftar+" : "+Harga+" x "+ListTotal,20,Color.black,Color.white));
    }
    
    public void Daftar(String input) {
        daftar = input;
    }
    
    public void Jumlah(int input) {
        ListTotal = input;
    }
    
    public void Harga(int input) {
        Harga = input;
        Jumlah = Harga*ListTotal;
        JumlahTotal += Jumlah;
        if (i==1) {
            List1 list1 = new List1();
            list1.Jumlah(Jumlah);
        } else if (i==2) {
            List2 list2 = new List2();
            list2.Jumlah(Jumlah);
        } else if (i==3) {
            List3 list3 = new List3();
            list3.Jumlah(Jumlah);
        } else if (i==4) {
            List4 list4 = new List4();
            list4.Jumlah(Jumlah);
        }
        
    }
    
    public void ResetKata(String input) {
        daftar = input;
    }
    public void ResetAngka(int input) {
        Harga = input;
        ListTotal = input;
    }
}
