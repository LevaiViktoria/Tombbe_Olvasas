package beolvasas;

import java.io.*;
public class Beolvasas {

    public static void main(String[] args) {
        
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[19];
        
        
        try{
           
           raf=new RandomAccessFile("113C.txt", "r");
           
           
           
           int db=0;
           sor=raf.readLine();
           
           while(sor != null){
               nevek[db]=sor;
               db++;
               sor=raf.readLine();
           }
           raf.close();
        }
        catch(IOException e){
            System.out.println("Hiba");
        }
        for (String str : nevek) {
            System.out.println(str);
        }
    }
    
}
