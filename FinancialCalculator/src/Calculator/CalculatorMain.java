package Calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

			System.out.println("enter present value: ");
			double presentValue=sc.nextDouble();
		
			
			
			System.out.println("enter Future Value: ");
			double futureValue= sc.nextDouble();
			
			
			System.out.println("enter number of payments: ");
			double numberOfPayments= sc.nextDouble();
			
			
			
			System.out.println("enter payment amount: ");
			double paymentAmount= sc.nextDouble();
			
			
			
			System.out.println("enter interest rate, % : ");
			double interestRate= sc.nextDouble();
			

            BeginningCalculator bg1 = new BeginningCalculator();
		    EndingCalculator eg1 = new EndingCalculator();
			    
	 System.out.println("press 1 to calculate beginning or press 2 to calculate ending");
	 int choice = sc.nextInt();

			   
			       
			        System.out.println("your choice is :" + choice);
			        switch (choice) {
			            case 1: 
			            	bg1.setPresentValue(presentValue);
			            	bg1.setFutureValue(futureValue);
			            	bg1.setInterestRate(interestRate);
			            	bg1.setNumberOfPayments(numberOfPayments);
			            	bg1.setPaymentAmount(paymentAmount);
			            	
			            	System.out.println("Present Value   :" +BeginningCalculator.PresentValuePB(interestRate, numberOfPayments, futureValue, paymentAmount));
			            	System.out.println("Future Value    :" +BeginningCalculator.FutureValuePB(interestRate, numberOfPayments, futureValue, paymentAmount, presentValue));
			            	System.out.println("Number of Period:" +BeginningCalculator.NumberOfPeriodPB(interestRate, numberOfPayments, futureValue, paymentAmount, presentValue));
			            	System.out.println("Payment Amount  :" +BeginningCalculator.PaymentAmountPB(interestRate, numberOfPayments, futureValue, paymentAmount, presentValue));
			            	
			                break;
			            case 2:
			            	eg1.setPresentValue(presentValue);
			            	eg1.setFutureValue(futureValue);
			            	eg1.setInterestRate(interestRate);
			            	eg1.setNumberOfPayments(numberOfPayments);
			            	eg1.setPaymentAmount(paymentAmount);
			            	
			            	System.out.println("Present Value   :" +EndingCalculator.PresentValuePB(interestRate, numberOfPayments, futureValue, paymentAmount));
			            	System.out.println("Future Value    :" + EndingCalculator.FutureValuePB(interestRate, numberOfPayments, futureValue, paymentAmount, presentValue));
			            	System.out.println("Number of Period:" +EndingCalculator.NumberOfPeriodPB(interestRate, numberOfPayments, futureValue, paymentAmount, presentValue));
			            	System.out.println("Payment Amount  :" + EndingCalculator.PaymentAmountPB(interestRate, numberOfPayments, futureValue, paymentAmount, presentValue));
			            	break;
			       
			            default: 
			        }
			   


			
	}
}
