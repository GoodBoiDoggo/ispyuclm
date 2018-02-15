/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge3;

/**
 *  CHALLENGE 3
 * @author Meynard Khel A Yadao
 */
public class Ispychallenge3 {
    
    static int count = 0;
    
    
    
    public static void main(String[] args) {
        
        final int TARGET = 200,
                  P1 = 1,
                  P2 = 2,
                  P5 = 5,
                  P10 = 10,
                  P20 = 20,
                  P50 = 50,
                  POUND1 = 100,
                  POUND2 = 200;
        
        int i, j, sum = 0, count = 0;
        int repeat;
        
        for(i = 0;i<8;i++){
            System.out.println("ITERATION " + i);

                if(i==0){
                    for(j = 0; j < TARGET/POUND2; j++){
                        sum+=POUND2;
                        System.out.println(sum);
                        if(sum == TARGET){
                            count++;
                            sum = 0;
                            break;
                        }
                        if(sum > TARGET){
                            sum = 0;
                            break;
                        }
                    }
                    
                }
                
                if(i==1){
                    for(j = 0; j < TARGET/POUND1; j++){
                        sum+=POUND1;       
                        System.out.println(sum);
                        if(sum == TARGET){
                            sum = 0;
                            count++;
                            break;
                        }
                        else if(sum > TARGET){
                            sum = 0;
                            break;
                        }
                    }
                    
                }
                
                if(i==2){
                    for(j = 0; j < TARGET/P50; j++){
                        sum+=P50;
                        System.out.println(sum);
                        if(sum == TARGET){
                            count++;
                            sum= 0;
                            break;
                        }
                        if(sum > TARGET){
                            sum = 0;
                            break;
                        }
                    }
                    
                }
                    
                if(i==3){
                    for(j = 0; j < TARGET/P20; j++){
                        sum+=P20;
                        System.out.println(sum);
                        if(sum == TARGET){
                            count++;
                            sum= 0;
                            break;
                        }
                        if(sum > TARGET){
                            sum = 0;
                            break;
                        }
                    }
                    
                }
                if(i==4){
                    for(j = 0; j < TARGET/P10; j++){
                        sum+=P20;
                        System.out.println(sum);
                        if(sum == TARGET){
                            count++;
                            sum= 0;
                            break;
                        }
                        if(sum > TARGET){
                            sum = 0;
                            break;
                        }
                    }
                    
                }
                if(i==5){
                    for(j = 0; j < TARGET/P5; j++){
                        sum+=P5;
                        System.out.println(sum);
                        if(sum == TARGET){
                            count++;
                            sum= 0;
                            break;
                        }
                        if(sum > TARGET){
                            sum = 0;
                            break;
                        }
                    }
                    
                }
                if(i==6){
                    for(j = 0; j < TARGET/P2; j++){
                        sum+=P2;
                        System.out.println(sum);
                        if(sum == TARGET){
                            count++;
                            sum= 0;
                            break;
                        }
                        if(sum > TARGET){
                            sum = 0;
                            break;
                        }
                    }
                    
                }
                if(i==6){
                    for(j = 0; j < TARGET/P1; j++){
                        sum+=P1;
                        if(sum == TARGET){
                            count++;
                            sum= 0;
                            break;
                        }
                        if(sum > TARGET){
                            sum = 0;
                            break;
                        }
                    }
                    
                }
                
                //SECOND STAGE
                
                if(i==0){
                    if(POUND2%POUND1==0){
                        count++;
                    }
                    if(POUND2%P50==0){
                        count++;
                    }
                    if(POUND2%P20==0){
                        count++;
                    }
                    if(POUND2%P10==0){
                        count++;
                    }
                    if(POUND2%P5==0){
                        count++;
                    }
                    if(POUND2%P2==0){
                        count++;
                    }
                    if(POUND2%P1==0){
                        count++;
                    }
                }
                if(i==1){
                    if(POUND1%P50==0){
                        count++;
                    }
                    if(POUND1%P20==0){
                        count++;
                    }
                    if(POUND1%P10==0){
                        count++;
                    }
                    if(POUND1%P5==0){
                        count++;
                    }
                    if(POUND1%P2==0){
                        count++;
                    }
                    if(POUND1%P1==0){
                        count++;
                    }
                }
                
                
            
        }
        
        
        System.out.println("There are " + count + " different ways 2 pounds can be made.");
        
        
    }
 
    
}
