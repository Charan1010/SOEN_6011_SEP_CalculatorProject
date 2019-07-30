package function;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PowerTest {
	
	
	
	@Test
	public void testLog()
	{
		
	    assertEquals(Power.logN(2),0.6931471805599453);

	}
	
	@Test
    public void testdecimalExp()
    {
        Power p =new Power();
        assertEquals(Power.decimalExp(2 * Power.logN(2), 2, 2),4.0);

    }
	
	@Test
	public void testPowerLawProduct()
	{
	  double output1=Power.decimalExp(2 * Power.logN(2), 2, 2);
	  double output2=Power.decimalExp(2 * Power.logN(2), 2, 2);
	  double finalOutput=Power.decimalExp(4 * Power.logN(2), 2, 4);
	  assertEquals(output1*output2,finalOutput,0.1);
	  
	}
	
	@Test
    public void testPowerLawDivision()
    {
      double output1=Power.decimalExp(2 * Power.logN(2), 2, 2);
      double output2=Power.decimalExp(2 * Power.logN(2), 2, 2);
      double finalOutput=Power.decimalExp(0* Power.logN(2), 2, 0);
      assertEquals(output1/output2,finalOutput); 
    }
	
	
	
	
	
	
	
	
}
