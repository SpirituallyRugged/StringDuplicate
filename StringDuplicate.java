/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmvalidity;

/**
 *
 * @author Arazi williams
 */
public class StringDuplicate {
    
    public static void main(String[] args) {
    
        String array [] = {"boy","bod","ppy","bod","xyz","boy","ppp","xxy"};
        for (int i = 0; i<array.length; i++) {
        
            for (int j = i + 1; j<array.length; j++) {
                if (array[i]==array[j] && (i != j)) {
                    System.out.println ("Duplicate Element is : "+ array[j]);
                }
            }
        }
    }
}
