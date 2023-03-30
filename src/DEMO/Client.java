package DEMO;

import Menu_Storage.Order;

import java.math.BigDecimal;

public class Client {
    private String name;
    private Order clientOrder=new Order ();
    private BigDecimal tip;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(Order clientOrder) {
        this.clientOrder = clientOrder;
    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    //can order from menu
    //can tip waiter
    //name
    //tip amount (can be null)
    public void tip(){}
}
//poruchka neshta menu
