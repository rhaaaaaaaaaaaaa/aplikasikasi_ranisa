/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujikom_rhannisa;
import javax.swing.JOptionPane;
/**
/**
 *
 * @author User
 */
public class no3 {
   public static void main(String[] args){
        int nilai1,nilai2,nilai3;
        double rata;
        String hasil;
        nilai1=Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai 1"));
        nilai2=Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai 2"));
        nilai3=Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai 3"));
        rata =( nilai1+nilai2+nilai3)/3;
        if (rata>60){
            hasil = "LULUS";
        }else{
            hasil = "GAGAL";
        }
        JOptionPane.showMessageDialog(null, "Nilai 1: "+nilai1+"\nNilai 2 :"+nilai2 + "\nNilai3 : "
                +nilai3 +"\nRata-Rata : "+rata +"\nKeterangan : "+hasil);  
}

}