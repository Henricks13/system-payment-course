package services;

public class PaypalService implements OnlinePaymentService {
	
	public double paymentFee(double amount) {
		return amount * 0.2;
	} 
	
	public double interest(double amount, int months) {
		double fees =  amount * 0.01 * months  ;
		double tax =  (amount + fees) * 0.02;
		amount += fees + tax; 
		return amount;
		
		
	}

}
