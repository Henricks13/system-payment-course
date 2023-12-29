package services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private Contract contract;
	
	public ContractService() {
		
		
	}

	public ContractService(Contract contract, Installment mouths) {
		
		this.contract = contract;
	}

	public Contract getContract() {
		return contract;
	}

	
	
	public void processContract(Contract contract ,int mouths) {
		
	}
	
	

}
