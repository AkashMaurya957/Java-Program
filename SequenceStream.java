  
  
import java.io.*;    
class SequenceStream
{    
  public static void main(String args[])throws Exception
{    
   FileInputStream fin1=new FileInputStream("E:\\akash1.txt");    
   FileInputStream fin2=new FileInputStream("E:\\akash3.txt");    
   FileOutputStream fout=new FileOutputStream("E:\\testout.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i);        
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}    