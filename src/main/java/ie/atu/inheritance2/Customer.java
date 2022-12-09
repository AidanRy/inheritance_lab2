package ie.atu.inheritance2;

public class Customer extends Person {

    private String customerNumber;

    private Boolean mailingList;

    public Customer() {
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Boolean getMailingList() {
        return mailingList;
    }

    public void setMailingList(Boolean mailingList) {
        this.mailingList = mailingList;
    }

    public Customer(String name, String address, String phone, String customerNumber, Boolean mailingList) {
        super(name, address, phone);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;


    }

    @Override
    public String toString() {
        return super.toString()+
                "customerNumber= ' " + customerNumber + '\'' +
                ", mailingList= " + mailingList +
                '\'';
    }
}
