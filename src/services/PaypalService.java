package services;

public class PaypalService implements OnlinePaymentService {
	
	public double paymentFee(double amount) {
		return amount * 0.2;
	} 
	
	public double interest(double amount, int months) {
		amount += 0.1 * months;
		return amount;
		
		
	}

}
