/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babyjournaltest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BabyJournalTest {

    /**
     * @param args the command line arguments
     */
          
   File f = new File("PathLocator.txt");

   void storePath(String imageDir, String fileDir){
      
       try{
           FileWriter write = new FileWriter(f,true);
           PrintWriter print_line = new PrintWriter( write );
           
           print_line.print("\n"+fileDir+" "+imageDir);
           print_line.close();
       }catch(IOException e){
           System.err.println(e);
       }
 
       
   }
   
   String getImagePath(String fileDir){
      
       try{
        Scanner input = new Scanner(f);
        while(input.hasNext()){
            String fDir = input.next();
            
            String imgDir= input.next();
            System.out.println(fDir+"  "+imgDir);
            if(fDir.equalsIgnoreCase(fileDir)){
                return imgDir;
            }
            
        }
        }catch(IOException e){
            System.err.println(e);
        }
       return null;
   }

}

