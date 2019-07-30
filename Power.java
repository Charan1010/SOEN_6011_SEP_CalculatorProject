package function;

import java.util.Scanner;

public class Power {
	
	
	public static int iterations = 13;
	
	// This function returns the x power y where y is an int 
	public static  double pow(double x, int y) 
    { 
        if (y == 0)
        {
          return 1; 
        }
            
        else if (y % 2 == 0) 
        {
          return pow(x, y / 2) * pow(x, y / 2); 
        }
            
        else
        {
          return x * pow(x, y / 2) * pow(x, y / 2); 
        }
            
    } 
	
	
	// This function returns factorial of a number given as input 
	public static int  factorial(int number) 
	{
		int fact=1;
		
		 for(int i=1;i<=number;i++)
		 {    
		      fact=fact*i;    
		 }  
		 return fact;
	}


	// This function returns x power y where x and y are double values 
	public static double decimalExp(double power,double baseValue,double expValue)
	{
	    int iteration = iterations;
	    float result = 1; 
	    int fatorial;
	    while (iteration > 0)
	    {
	        fatorial = factorial(iteration);
	        result += pow(power, iteration) / fatorial;
	        iteration--;
	    }
	    if(baseValue<0) 
	    {
	      System.out.println("Coming here");
	      return result * pow(-1.0,(int)expValue);
	    }
	    return result;
	}

	// This function returns ln of a number given as input 
	public static double logN(double number)
	{
	    if(number<0) number=-number;
		double modNum1= number -1;
		double modNum2= number+1;
		double mix=modNum1/modNum2;
		double result=0;
		int iteration=100;
		while(iteration>0)
		{
			if(iteration%2!=0)  
			  {
			     result += pow(mix, iteration) / iteration;
			  }
		    iteration--;

		}
		//System.out.println(result*2);
		return result*2;
	}
	

	public static void main(String[] args)
	{
	  double baseValue=2.0;
	  double expValue=4.0 ;
	  
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the Base ");
	    String base=s.nextLine();
	    System.out.println("Enter the exponent");
	    String exponent=s.nextLine();
	    try 
	    {
    	    baseValue = Double.parseDouble(base);
    	    expValue = Double.parseDouble(exponent);
    	    
    	    double result = decimalExp(expValue * logN(baseValue),baseValue,expValue);
    	    
    	    System.out.println(result);
	    }
	
        catch(NumberFormatException e)
        {
            System.out.println("Exception : Entered input is not a double value ");
        }
    }
}
