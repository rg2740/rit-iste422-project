import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest{
   EdgeField testObj;

	@Before
	public void setUp() throws Exception {
		testObj = new  EdgeField("1|name");
	}
   
   @Test
   public void testGetName(){
      System.out.println("getName");
      EdgeField field = new EdgeField();
   }
}