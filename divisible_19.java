/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode.Flow_Control_Statements;

/**
 *
 * @author haris
 */
public class divisible_19 {
    public static void main(String args[]){
        int c=0,i=0;
        while(c!=5){
            i++;
        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
            System.out.println(i);
            c++;
        }
        
    }
}
}