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
import java.util.*;
public class month_9 {
    public static void main(String []args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        switch(n){
            
        case 1:
                System.out.println("january");
                break;
        case 2:
                System.out.println("february");
                break;
        case 3:
                System.out.println("march");
                break;
        case 4:
                System.out.println("April");
                break;
        case 5:
                System.out.println("May");
                break;
        case 6:
                System.out.println("june");
                break;
        case 7:
                System.out.println("july");
                break;
        case 8:
                System.out.println("August");
                break;
        case 9:
                System.out.println("September");
                break;
        case 10:
                System.out.println("october");
                break;
        case 11:
                System.out.println("novembr");
                break;
        case 12:
                System.out.println("December");
                break;
        
        default:
            System.out.println("Invalid month");
            break;
                                            
        }
    }
    
    
}
