package ie.atu.inheritance2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        PreferedCustomer customer1 = new PreferedCustomer();
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter customer name: ");
        String name = input.nextLine();
        customer1.setName(name);
        System.out.println("Please Enter customer address: ");
        String address = input.nextLine();
        customer1.setAddress(address);
        System.out.println("Please Enter customer phone number: ");
        String phone = input.nextLine();
        customer1.setPhone(phone);
        System.out.println("Please Enter customer number: ");
        String customerNumber = input.nextLine();
        customer1.setCustomerNumber(customerNumber);
        Boolean mailingList = true;
        char repeat = 'y';
        while(repeat == 'y'){
            try{
                System.out.println("Please Enter mailing list preference: ");
                mailingList = input.nextBoolean();
                customer1.setMailingList(mailingList);
                repeat = 'n';
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a bool expression of true or false");
                input.next();
            }
        }
        System.out.println("Please Enter spend total: ");
        float spendTotal = input.nextFloat();
        customer1.setSpendTotal(spendTotal);

        float discount = customer1.DiscountCalc(spendTotal);
        customer1.setDiscount(discount);

        System.out.println(customer1);
    }
}
