/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2_pbo;

/**
 *
 * @author MOKLET1
 */
public class Praktikum2_pbo {

    //Variabel intence 
    
    //Atribut celcius (c) dengan tipe data integer
    int c = 78;
    //Atribut farenheit (f) dengan tipe data integer
    int f = 32;
    //Atribut kelvin (k) dengan tipe data integer
    int k = 273;
    //Atribut reamur (r) dengan tipe data double (karena menggunakan desimal)
    double r = 0.8;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objek
        Praktikum2_pbo suhu = new Praktikum2_pbo();
        
        System.out.println("Konversi Suhu");
        System.out.println("=============");
        
        //Menampilkan atribut c dengan cara memanggil menggunakan objek
        System.out.println("Suhu dalam satuan Celcius = "+suhu.c+"°C");
        
        //Menghitung dan menampilkan hasil perhitungan atribut c dan atribut f
        System.out.println("Suhu "+suhu.c+" °C dalam satuan Farenheit = "+((suhu.c*9/5) + suhu.f)+"°F");
        
        //Menghitung dan menampilkan hasil perhitungan atribut c dan atribut k
        System.out.println("Suhu "+suhu.c+" °C dalam satuan Kelvin = "+(suhu.c+suhu.k)+"°K");
        
        //Menghitung dan menampilkan hasil perhitungan atribut c dan atribut r
        System.out.println("Suhu "+suhu.c+" °C dalam satuan Reamur = "+(suhu.c*suhu.r)+"°R");
        
        
    }
    
}
