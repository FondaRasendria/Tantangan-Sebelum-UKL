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
public class Nomor3 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        
        for(int i = 1;i<a;i++){
            b += i;
            System.out.print(i+" + ");
        }
        System.out.println(a);
        System.out.println("Total = "+b);
    }
}
