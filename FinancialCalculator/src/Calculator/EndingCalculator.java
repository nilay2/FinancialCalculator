package Calculator;

public class EndingCalculator extends AbsCalculator {



	public static double PresentValuePB(double interestRate, double numberOfPayments, double futureValue, double paymentAmount)

    {
	double result=((Math.pow((interestRate+1),-numberOfPayments)
			*((-paymentAmount*(Math.pow((interestRate+1),numberOfPayments)))
					-(futureValue*interestRate))
					+(paymentAmount)/interestRate));
	return result;
    }
	
	
            
            
            
            
	
	public static double FutureValuePB(double interestRate, double numberOfPayments, double futureValue, double paymentAmount, double presentValue)
    {
	 double result= (double) (paymentAmount-(Math.pow((interestRate+1),numberOfPayments))
                     *(paymentAmount+(interestRate*presentValue))
			 /interestRate);
	 
	return result;
    }
	
            
            
            
	
	
	public static double NumberOfPeriodPB(double interestRate, double numberOfPayments, double futureValue, double paymentAmount,double presentValue)
	{ 
	  
	double result= Math.log((paymentAmount-(futureValue*interestRate))
			  /(paymentAmount+(interestRate*presentValue)))
			  
			  / Math.log(interestRate+1);
	
	return result; 
	}
	
	
            
            
            
	
	public static double PaymentAmountPB(double interestRate, double numberOfPayments, double futureValue, double paymentAmount,double presentValue)

	{ 
	 double result=(interestRate*((presentValue*(Math.pow((interestRate+1),numberOfPayments))+futureValue))
			  /(Math.pow((interestRate+1),numberOfPayments))-1);
	return result;

	}



}
	




