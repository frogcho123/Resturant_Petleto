package DEMO;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Group {
    ArrayList<Client> clients;
    BigDecimal groupTip;

    public Group(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public BigDecimal getGroupTip() {
        return groupTip;
    }

    public void setGroupTip() {

        for (Client client:clients){
            groupTip.add (client.getTip ());
        }
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public int getCount(){
        return clients.size ();
    }

    @Override
    public String toString() {
        return "Group{" +
                "clients=" + clients +
                '}';
    }
}
