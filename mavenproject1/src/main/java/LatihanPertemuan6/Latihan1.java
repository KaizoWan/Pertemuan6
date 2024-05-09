/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanPertemuan6;

import java.util.Scanner;

/**
 *
 * @author ridwan
 */
public class Latihan1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        System.out.println("You are: ");
        if (age < 13) {
            System.out.println("\tTerlalu Mudah untuk membuat Facebook");
        }
        if (age < 16) {
            System.out.println("\tTerlalu mudah untuk mendapatkan sim");
        }
        if (age <= 18) {
            System.out.println("\tTerlalu mudah untuk menikah");
        }

        if (age < 35) {
            System.out.println("\tTerlalu muda untuk menikah");
        }
        
        if (age >= 50) {
            System.out.println("\"Anda sudah setengah baya, hati-hati dengan kulineran");
        }
    }
}
