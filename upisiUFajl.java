 
    import java.io.FileWriter;  
    public class upisiUFajl {  
        public static void main(String args[])
        {    
             try
             {    
               FileWriter fw=new FileWriter("Desktop\baza.txt");    
               fw.write("Welcome to javaTpoint.");    
               fw.close();    
              }catch(Exception e){System.out.println(e);}    
              System.out.println("Success...");    
         }    
    }  