package services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private Contract contract;
	OnlinePaymentService service = new PaypalService();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	public ContractService() {
		
	}

	public ContractService(Contract contract, Installment mouths) {
		this.contract = contract;
	}

	public Contract getContract() {
		return contract;
	}

	public void processContract(Contract contract, int months) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(contract.getDate());

		for (int i = 1; i <= months; i++) {
			calendar.add(Calendar.MONTH, 1);
			Date dateInstall = calendar.getTime();
			
			double result = service.interest(200, i);
			
			
			
			System.out.println(sdf.format(dateInstall) + " - " + result);
		}
	}
}
