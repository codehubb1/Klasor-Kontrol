/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Klasor_Kontrol;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CheckEmptyDirectoryExample
{
    String[] str = {
			"C:\\test\\test1",
			"C:\\test\\test2"
                      
        };
    
    /*public  String[] readArray(String file){
        
              
         int ctr=0;
        try{
            
            Scanner s1=new Scanner(new File (file));
            while (s1.hasNextLine()){
                ctr=ctr+1;
            }
            String[] words=new String[ctr];
            
            Scanner s2=new Scanner(new File(file));
            for (int i=0;i<ctr;i=i+1){
           words[i]=s2.next();
           }
            return words;
            
        }
        
            catch(FileNotFoundException e){
        }
        return null;
       
        
}*/
    
    //String[] str= readArray("Dizinler.txt");
    //int i=0;
   //for (int i=0;i<str.length;i=i+1){
    //System.out.println(str);
//}
    
    
   
 public String[] checkFolders() {
     
           //String[] str= readArray("Dizinler.txt");
           
                String[] result = new String[str.length];
		String response;
		for (int i=0; i<str.length;i++)
		{
			File file = new File(str[i]);         
			if(file.isDirectory()){
				if(file.list().length>0){
					
					response = " Dizin Boş DEĞİL!     " + file.getPath() ;
				}else{
					
                                        response =  " DİZİN BOŞ!     " + file.getPath() ;
					
				}
			}else{
				response = "DİZİN DEĞİL!";
			}
			System.out.println(response);
			result[i] = response;
		}
		return result;
	}   
      
	
	public static void main(String[] args)
	{
            
            new CheckEmptyDirectoryExample().checkFolders();;
     //new CheckEmptyDirectoryExample().readArray();;
        }

      
     
   
}         

   
	


