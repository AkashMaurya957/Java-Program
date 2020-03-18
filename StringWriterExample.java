import java.io.*;  
public class StringWriterExample 
{  
 public static void main(String[] args) throws IOException 
{  
  char[] ary = new char[512];  

  StringWriter writer = new StringWriter();  

  FileInputStream input = new FileInputStream("E://akash.txt"); 
 
  BufferedReader buffer = new BufferedReader(new InputStreamReader(input));   
 
  int x;  

  while ((x = buffer.read(ary)) != -1) 

  {  

  writer.write(ary, 0, x);  

  }  

  System.out.println(writer.toString());        

  writer.close();  

  buffer.close();  

}  
}