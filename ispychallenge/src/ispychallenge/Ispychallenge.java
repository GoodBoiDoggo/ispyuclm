/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge;
/**
 *CHALLENGE 1
 * @author Meynard Khel A. Yadao
 */
public class Ispychallenge {
   
    public static void main(String[] args) {
        
        int sum = 0;
        
        for(int i = 3;i<1000;i++){
            if( i%3==0 || i%5==0){
                sum+=i;
            }
        }
        System.out.println("The sum is: " + sum);

    }
    
}
