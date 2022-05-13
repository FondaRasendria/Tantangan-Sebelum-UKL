/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoalukl;

/**
 *
 * @author Fonda
 */
public class Nomor8 {
    public static void main(String[] args) {
        String[] buah = {"Durian","Apel","Mangga","Jeruk","Pepaya"};
        int[] jumlah = {10,10,20,30,10};
        int x = 0;
        int y = 0;
        
        for(int i=0;i<buah.length;i++){
            if(x<jumlah[i]){
                x = jumlah[i];
                y = i;
            }
        }
        System.out.println(buah[y]);
    }
}
