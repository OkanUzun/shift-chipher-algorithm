/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shift_chipher;

import static java.lang.Math.abs;
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
    static String decrypted_text = "";
    static int K;
    
    public static void main(String[] args) {
        System.out.print("Şifrelenecek metni gir : ");
        text = input.nextLine().toUpperCase();
        System.out.print("K değerini gir : ");
        K = input.nextInt();
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==' '){
                continue;
            }
            
            encrpyted_text = encrpyted_text + alphabet_characters.charAt((alphabet_characters.indexOf(text.charAt(i))+K)%26);                
        }
        
        System.out.println("Şifrelenmiş hali : "+encrpyted_text);
        
        for (int i = 0; i < encrpyted_text.length(); i++) {
            int temp = alphabet_characters.indexOf(encrpyted_text.charAt(i));
            if (temp < K){
                temp = 26 - abs(temp-K);               
            }
            else{
                temp = (temp - K)%26;              
            }
            
            decrypted_text = decrypted_text + alphabet_characters.charAt(temp);
        }
        
        System.out.println("Şifresi çözülmüş hali : "+decrypted_text);
    }
    
    
    
}
