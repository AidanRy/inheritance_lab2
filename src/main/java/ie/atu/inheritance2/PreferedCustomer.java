package ie.atu.inheritance2;

public class PreferedCustomer extends Customer{
    private float discount;

    private float spendTotal;

    public PreferedCustomer() {
    }

    public PreferedCustomer(String name, String address, String phone, String customerNumber, Boolean mailingList, float discount, float spendTotal) {
        super(name, address, phone, customerNumber, mailingList);
        this.discount = discount;
        this.spendTotal = spendTotal;
    }

    public float DiscountCalc(float spendTotal){
        if(spendTotal>= 500&&spendTotal<=999){
            discount = 5;
        }
        else if(spendTotal>=1000&&spendTotal<=1499){
            discount = 6;
        }
        else if(spendTotal>=1500&&spendTotal<=1999){
            discount = 7;
        }
        else if(spendTotal>=2000){
            discount = 10;
        }
        else{
            discount = 0;
        }
        return discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getSpendTotal() {
        return spendTotal;
    }

    public void setSpendTotal(float spendTotal) {
        this.spendTotal = spendTotal;
    }

    @Override
    public String toString() {
        return super.toString()+
                "discount= " + discount +
                ", spendTotal= " + spendTotal +
                '\'';
    }
}

