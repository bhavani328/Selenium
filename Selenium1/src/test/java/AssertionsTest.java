import static org.junit.Assert.*;
import org.junit.Test;
public class AssertionsTest {

   @Test
   public void assertionsTest(){
	   String s1="Junit";					
       String s2="Junit";					
       String s3="test";					
       String s4="test";					
       String s5=null;					
       int var1=1;					
       int	var2=2;					
       int[] Array1 = { 1, 2, 3 };					
       int[] Array2 = { 1, 2, 3 };					
       		
       //Assert statements		
       assertEquals(s1,s2);					
       assertSame(s3, s4);					
       assertNotSame(s1, s3);					
       assertNotNull(s1);			
       assertNull(s5);			
       assertTrue(var1<var2);					
       assertArrayEquals(Array1,Array2);					
   }		
   }
	 
	
