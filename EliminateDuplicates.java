/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminateduplicates;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sa
 */
public class EliminateDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        int[] original = new int[10];
        int[] arr ;
        
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            original[i]=scan.nextInt();
            
        }
        arr = eliminateDuplicates(original);
        System.out.println("The new array is "+ Arrays.toString(arr));
        
    }
    public static int[] eliminateDuplicates(int[] list){
        
        int[] dupli = new int[10];
        
        for (int i = 0; i < list.length; i++) {
            int j;
            for (j=1 ; j < list.length-1; j++) {
                
                if(list[i]==list[j]){
                    break;
                }
                
            }
            if(i == j){
                dupli[i]=list[i];
            }
            
            
        }
        return dupli;
    }
    
}
