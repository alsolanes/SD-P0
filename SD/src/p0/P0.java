/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aleix
 */
public class P0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introdueix la opcio:\n\t1.-Read String\n"
          + "\t2.-Read Char\n"
          + "\t3.-Read String mida fixa\n"
          + "\t4.-Write All in One"
          + "Per sortir premer -1");
        Scanner sc;
        sc = new Scanner(System.in);
        int opcio = 0;
        while(opcio != -1){
            opcio = sc.nextInt();
            switch(opcio){
                case 1:
                    File file = new File("test1");
                    try {
                        file.createNewFile();
                        ComUtils cmUtils = new ComUtils(file);
                        cmUtils.writeTest();
                        System.out.println(cmUtils.readTest());
                      }
                      catch(IOException e)
                      {
                        System.out.println("Error Found during Operation:" + e.getMessage());
                        e.printStackTrace();
                      }
                    break;
                case 2:
                    File file2 = new File("test2");
                    try {
                        file2.createNewFile();
                        ComUtils cmUtils = new ComUtils(file2);
                        cmUtils.writeChar('a');
                        System.out.println(cmUtils.readChar());
                      }
                      catch(IOException e)
                      {
                        System.out.println("Error Found during Operation:" + e.getMessage());
                        e.printStackTrace();
                      }
                    break;
                case 3:
                    File file3 = new File("test3");
                    try {
                        file3.createNewFile();
                        ComUtils cmUtils = new ComUtils(file3);
                        cmUtils.write_string_variable(10, "hola");
                        System.out.println(cmUtils.read_string_variable(10));
                      }
                      catch(IOException e)
                      {
                        System.out.println("Error Found during Operation:" + e.getMessage());
                        e.printStackTrace();
                      }
                    break;
                case 4:
                    File file4 = new File("TestAll");
                    try{
                        file4.createNewFile();
                        ComUtils cmUtils = new ComUtils(file4);
                        cmUtils.writeChar('Q');
                        cmUtils.write_int32(10);
                        cmUtils.write_string("Numero");
                        cmUtils.write_string_variable(10, "hola, com va?");
                    }catch(IOException e){
                        System.out.println("Error Found during Operation:" + e.getMessage());
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    File file5 = new File("TestAll");
                    try{
                        file5.createNewFile();
                        ComUtils cmUtils = new ComUtils(file5);
                        cmUtils.readChar();
                        cmUtils.read_int32();
                        cmUtils.read_string();
                        cmUtils.read_string_variable(10);
                    }catch(IOException e){
                        System.out.println("Error Found during Operation:" + e.getMessage());
                        e.printStackTrace();
                    }
                    
                default:
                    break;
            }
        }

  }
    
}
