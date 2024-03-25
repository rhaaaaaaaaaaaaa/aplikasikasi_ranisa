/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujikom_rhannisa;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class no2 {
     public static void main(String[] args) {
        int harga;
        double bespot,diskon,bayar;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Harga Barang : Rp.");
        harga=keyboard.nextInt();
        System.out.print("Diskon :");
        diskon=keyboard.nextInt();
        bespot=(diskon/100) * harga;
        bayar=harga-bespot;
        
        System.out.println("Harga Barang : Rp. "+ harga);
        System.out.println("Diskon : "+ diskon +"%");
        System.out.println("Diskon (Rp) : "+ bespot);
        System.out.println("Total Harga: "+ bayar);

}
}