/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge2;

import java.awt.BorderLayout;
import java.io.*;

/**
 *  CHALLENGE 2
 * @author Meynard Khel A. Yadao
 */
public class Ispychallenge2 {
    
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        System.out.println("Please enter a word phrase, or sequence: ");
        String text = input.readLine().toLowerCase().trim().replace(" ","");
      
        boolean flag = true;
        int lastIndex = text.length() - 1;

        for(int i = 0, j = lastIndex; i < text.length()/2; i++, j--){
            if(text.charAt(i) != text.charAt(j)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    
}
