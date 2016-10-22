/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shift_chipher;

import java.util.Scanner;

/**
 *
 * @author Okan
 */
public class Main_Class {
    static Scanner input = new Scanner(System.in);
    static String alphabet_characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String text;
    static String encrpyted_text = "";
    static int K;
    
    public static void main(String[] args) {
        System.out.print("Şifrelenecek metni gir : ");
        text = input.nextLine();
        System.out.print("K değerini gir : ");
        K = input.nextInt();
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==' '){
                continue;
            }            
            encrpyted_text = encrpyted_text + alphabet_characters.charAt((i+K)%26);                
        }
        
        System.out.println("Şifrelenmiş hali : "+encrpyted_text);
    }
    
    
    
}
