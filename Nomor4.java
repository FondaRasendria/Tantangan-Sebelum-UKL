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
public class Nomor4 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int n = 5;
        int[] Array = new int[n];
        for(int i=0;i<n;i++){
            Array[i] = rand.nextInt(10);
            System.out.print(" "+Array[i]);
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            if(Array[i]%2 == 0){
                System.out.print("Genap ");
            }
            else{
                System.out.print("Ganjil ");
            }
        }
    }
}
