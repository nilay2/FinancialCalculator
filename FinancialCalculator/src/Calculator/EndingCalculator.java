package Calculator;

public class EndingCalculator extends AbsCalculator {


		public static double PresentValuePB(double interestRate, double numberOfPayments, double futureValue, double paymentAmount)

		{
		double result=((Math.pow((interestRate+1),-numberOfPayments)
				*((futureValue*interestRate)
						-(interestRate+1))
						*((Math.pow((interestRate+1),numberOfPayments)-1)
								*paymentAmount))/interestRate);
		return result;
	    }
		
		
		
		public static double FutureValuePB(double interestRate, double numberOfPayments, double futureValue, double paymentAmount, double presentValue)
	    {
		 double result= (double) (((interestRate+1)
				 *paymentAmount-(Math.pow((interestRate+1),numberOfPayments))
				 *(interestRate*paymentAmount+paymentAmount+interestRate*presentValue))
				 /interestRate);
		 
		return result;
	    }
		
		
		
		public static double NumberOfPeriodPB(double interestRate, double numberOfPayments, double futureValue, double paymentAmount,double presentValue)
		{ 
		  
		double result= Math.log(((-futureValue*interestRate)+(paymentAmount*interestRate)+paymentAmount)
				  /(interestRate*paymentAmount)
				  +paymentAmount+(interestRate*presentValue))
				  / Math.log(interestRate+1);
		
		return result; 
		}
		
		
		
		public static double PaymentAmountPB(double interestRate, double numberOfPayments, double futureValue, double paymentAmount,double presentValue)

		{ 
		 double result=(interestRate*((presentValue*(Math.pow((interestRate+1),numberOfPayments))+futureValue))
				  /(interestRate+1)
				  *(Math.pow((interestRate+1),numberOfPayments))-1);
		return result;

		}



	}




