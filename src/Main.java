import DEMO.Client;
import DEMO.Group;
import DEMO.Table;
import Menu_Storage.*;
import Personal.*;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product potato=new Product ("potato",0.2);
        Product rice=new Product ("rice",0.3);
        Product chicken=new Product("chicken",0.4);
        Product pork=new Product("pork",0.5);
        Drink cola=new Drink ("cola",250);
        Drink beer=new Drink ("beer",330);
        Map<Product,Integer> productsInStorage=new HashMap<> ();
        productsInStorage.put (potato,5);
        productsInStorage.put (chicken,10);
        productsInStorage.put (rice,15);
        productsInStorage.put (pork,20);
        Storage storage=new Storage (productsInStorage);

        Set<Meal> meals=new HashSet<> ();
        Set<Drink> drinks=new HashSet<> ();

        drinks.add (cola);
        drinks.add (beer);

        Map<Product,Integer> productsNeeded=new HashMap<> ();
        productsNeeded.put (potato,2);
        productsNeeded.put (chicken,1);
        Meal chickenPotato=new Meal ("chicken with potatoes",productsNeeded);
        meals.add (chickenPotato);
        productsNeeded=new HashMap<> ();
        //chistq mapa za da dobavq novi produkti za nov meal

        productsNeeded.put (potato,3);
        productsNeeded.put (pork,1);
        Meal porkPotato=new Meal ("pork with potatoes",productsNeeded);
        meals.add (porkPotato);
        productsNeeded=new HashMap<> ();

        productsNeeded.put (rice,2);
        productsNeeded.put (pork,1);
        Meal porkRice=new Meal ("pork with rice",productsNeeded);
        meals.add (porkRice);
        productsNeeded=new HashMap<> ();

        productsNeeded.put (rice,2);
        productsNeeded.put (chicken,1);
        Meal chickenRice=new Meal ("chicken with rice",productsNeeded);
        meals.add (chickenRice);

       Menu menu=new Menu (meals,drinks);
        System.out.println (menu);
////////////////////////////////////////////////////////////////////////////
        Client mitko=new Client ("mitko");
        Client ivo=new Client ("ivo");
        Client pepi=new Client ("pepi");

        Table table1=new Table (4);
        //arrlist moga da vkaram 2 puti mitko i t.n
        ArrayList<Client> clients=new ArrayList<> ();
        clients.add (mitko);
        clients.add (ivo);
        clients.add (pepi);
        Group group=new Group (clients);
        //mitko.getClientOrder ().orderFromMenu (menu);
        //ivo.getClientOrder ().orderFromMenu (menu);
        //pepi.getClientOrder ().orderFromMenu (menu);
        Queue<Meal> meals1=new LinkedList<> ();
        meals1.add (chickenRice);
        meals1.add (chickenPotato);
        Queue<Drink> drinks1=new LinkedList<> ();
        drinks1.add (cola);
        Order orderMitko=new Order (meals1,drinks1,table1.getTableId ());
        mitko.setClientOrder (orderMitko);

        Queue<Meal> meals2=new LinkedList<> ();
        meals2.add (porkRice);
        meals2.add (chickenPotato);
        Queue<Drink> drinks2=new LinkedList<> ();
        drinks2.add (beer);
        Order orderPepi=new Order (meals2,drinks2,table1.getTableId ());
        pepi.setClientOrder (orderPepi);

        Queue<Meal> meals3=new LinkedList<> ();
        meals3.add (porkRice);
        meals3.add (porkPotato);
        Queue<Drink> drinks3=new LinkedList<> ();
        drinks3.add (beer);
        drinks3.add (beer);
        Order orderIvo=new Order (meals3,drinks3,table1.getTableId ());
        ivo.setClientOrder (orderIvo);

        Waiter waiter=new Waiter ("gosho","waiter",new BigDecimal (1200));
        waiter.getOrderFromTable (table1);
        Chef chef1=new Chef ("ivan","chef",new BigDecimal (1500));
        waiter.getOrdersToChef (chef1);
        Barman barman1=new Barman ("dragan","barman",new BigDecimal (1300));
        waiter.getOrdersToBarman (barman1);
        Washer washer1=new Washer ("iliqn","washer",new BigDecimal (1000));
        Stack<Dish> cleanDishes=new Stack<> ();
        for (int i = 0; i < 10; i++) {
            cleanDishes.add (new Dish (true));
        }
        Stack<Glass> cleanGlass=new Stack<> ();
        for (int i = 0; i < 10; i++) {
            cleanGlass.add (new Glass (true));
        }

    }
}
