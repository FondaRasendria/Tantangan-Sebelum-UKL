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
import java.util.Random;
public class Nomor7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 5;
        int[] Array = new int[n];
        int check = 0;
        
        for(int i=0;i<n;i++){
            Array[i] = rand.nextInt(10);
            System.out.print(" "+Array[i]);
        }
        System.out.println("");
        for(int x=0;x<n;x++){
            for(int y=0;y<x;y++){
                if(Array[x]==Array[y]){
                    check = 1;
                }
            }
        }
        if(check==1){
            System.out.println(" Ada"); 
        }
        else if(check==0){
            System.out.println(" Tidak Ada");
        }
    }
}
