package Calculator;

public abstract class AbsCalculator {

	protected double presentValue;
	protected double futureValue;
	protected double numberOfPayments;
	protected double paymentAmount;
	protected double interestRate;
	protected double result;
	
	public double getPresentValue() {
		return presentValue;
	}

	public void setPresentValue(double presentValue) {
		this.presentValue = presentValue;
	}

	public double getFutureValue() {
		return futureValue;
	}

	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}

	public double getNumberOfPayments() {
		return numberOfPayments;
	}

	public void setNumberOfPayments(double numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}

}
