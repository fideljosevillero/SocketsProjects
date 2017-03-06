/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socketsprojects;

import java.util.Scanner;

/**
 *
 * @author fidel.villero
 */
public class Core {
 
    public Core(){
        System.out.println("1. Server, 2. Client");
        Scanner scan = new Scanner(System.in);
        Integer i = (Integer)scan.nextInt();
        if(i!=null){
            if(i.equals(1)){
                Server s = new Server();
            }else if(i.equals(2)){
                Client c = new Client(); 
           }
        }
    }
    
}
