package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import services.ContractService;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter contract data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();

            sc.nextLine();

            System.out.print("Date (dd/MM/yyyy): ");
            String date = sc.nextLine();

            System.out.print("Contract value: ");
            double contractValue = sc.nextDouble();
            
            System.out.print("Enter the number of installments: ");
            int installment = sc.nextInt();

            Contract obj = new Contract(number, sdf.parse(date), contractValue);
            ContractService service = new ContractService();
            System.out.println("Installments: ");
            service.processContract(obj, installment);
            sc.close();
            
            
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in the format dd/MM/yyyy.");
           
        }
    }

}
