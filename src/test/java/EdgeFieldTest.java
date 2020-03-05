import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
	EdgeField testObj;
   
   @Before
	public void setUp() throws Exception {
		testObj = new EdgeField("1|Rob");
	}
   @Test
   public void testGetName(){
      System.out.println("Hello");
   }
}