import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Add here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Add extends Actor
{
    /**
     * Act - do whatever the Add wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int SuperTotal = 0;
    static String Pesan;
    static int Harga = 0;
    private int x=492;
    private int y=30;
    private int i=0;

    public void act() 
    {
        MenambahPesanan();
    }

    public void MenambahPesanan() {
        if (Greenfoot.mouseClicked(this)){
            if ((Harga != 0) && (SuperTotal != 0)){
                i++;
                if (SuperTotal > 0){
                    if (i < 2) {
                        //untuk list harga, world menu
                        ListAdd list = new ListAdd();
                        list.Daftar(Pesan);
                        ListAdd list2 = new ListAdd();
                        list2.Jumlah(SuperTotal);

                        // untuk menginputkan ke next world
                        List1();
                        //List2();
                        //List3();
                        //List4();

                        ListAdd list3 = new ListAdd();
                        list3.Harga(Harga);

                        getWorld().addObject(new ListAdd(), x, y+30);
                        y += 30;
                    }
                }
            }
        }
    }

    public void FixPesanan(String input) {
        Pesan = input;
    }

    public void setSuperTotal(int input) {
        SuperTotal = input;
    }

    public void setHarga(int input) {
        Harga = input;
    }

    public Add() {
        GreenfootImage image = getImage();
        image.scale(160, 135);
        setImage(image);
    }
    
    public void List1() {
        List1 list1nama = new List1();
        list1nama.Nama(Pesan);
        List1 list1harga = new List1();
        list1harga.Harga(SuperTotal);
    }
    
    public void List2() {
        List2 list2nama = new List2();
        list2nama.Nama(Pesan);
        List2 list2harga = new List2();
        list2harga.Harga(SuperTotal);
    }
    
    public void List3() {
        List3 list3nama = new List3();
        list3nama.Nama(Pesan);
        List3 list3harga = new List3();
        list3harga.Harga(SuperTotal);
    }
    
    public void List4() {
        List4 list4nama = new List4();
        list4nama.Nama(Pesan);
        List4 list4harga = new List4();
        list4harga.Harga(SuperTotal);
    }
}
