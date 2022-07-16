import org.junit.jupiter.api.Test;


public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha(){
      boolean check = false;

 
      try(FileReader reader = new FileReader("notes3.txt"))
      {
         // читаем посимвольно
          int c;
          while((c=reader.read())!=-1){
               
              System.out.print((char)c);
          } 
      }


     org.junit.jupiter.api.Assertions.assertEquals(true,check);
    
      
    }
}
