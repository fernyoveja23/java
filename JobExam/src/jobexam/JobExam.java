/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ferni
 */
public class JobExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> lista = new ArrayList<String>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.forEach((x) -> {System.out.println(x);});
        
        int []arr = {5, 8, 1, 9, 4}; 
        int aux = 0;
        for(int i =0; i <arr.length -1; i++){
            for(int j = 0; j < arr.length-1; j++){                
                if(arr[j] > arr[j+1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        
        for(int i = 1; i <=50;i++){
            for(int a = 1; a<= i;a++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    
}
