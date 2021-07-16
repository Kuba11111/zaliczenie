package zal;

import java.util.Date;

public class Transaction {
    public Human seller;
    public Human buyer;
    private double price;
    private Date date;

    public Transaction(Human seller, Human buyer, double price, Date date)
    {
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
