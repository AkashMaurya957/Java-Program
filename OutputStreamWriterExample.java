import java.io.*;

public class OutputStreamWriterExample 
{  
public static void main(String[] args) 
{  
 
try 
{  
 OutputStream outputStream = new FileOutputStream("output.txt");  
 Writer out = new OutputStreamWriter(outputStream);  
  
 out.write("Hello World");  
 out.close();  

} 
catch (Exception e) 
{  
 e.getMessage();  
        
}  
}  
}  