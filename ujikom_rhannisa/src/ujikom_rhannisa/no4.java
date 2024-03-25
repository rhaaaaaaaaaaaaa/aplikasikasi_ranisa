/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujikom_rhannisa;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class no4 {
public static void main(String[] args){
        int nilai1,nilai2,hasil;
        nilai1=Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai 1"));
        nilai2=Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai 2"));
        hasil = nilai1 * nilai2;
        JOptionPane.showMessageDialog(null, "Nilai 1: "+nilai1+"\nNilai 2 ;"+nilai2 + "\nHasil : "+hasil);
    
}

}