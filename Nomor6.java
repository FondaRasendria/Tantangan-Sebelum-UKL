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
import java.util.ArrayList;
public class Nomor6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 5;
        int k = 10;
        int total = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int[] Array = new int[n];
        
        for(int i=0;i<n;i++){
            Array[i] = rand.nextInt(10);
            System.out.print(" "+Array[i]);
        }
        System.out.println("");
        for(int x=0;x<n;x++){
            for(int y=0;y<x;y++){
                total = Array[x]+Array[y];
                temp.add(total);
            }
        }
        System.out.println("");
        if(temp.contains(k)){
            System.out.println(" Bisa");
        }
        else if(!temp.contains(k)){
            System.out.println(" Tidak Bisa");
        }
    }
}
