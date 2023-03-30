package DEMO;

import Menu_Storage.Order;

import java.math.BigDecimal;
import java.util.*;

public class Table {
    private int tableId;
    private int capacity;
    private Group group;

    private Queue<Order> tableOrder=new LinkedList<> ();

    private int counter = 0;

    public Table(int capacity) {
        this.tableId = counter;
        this.capacity = capacity;
        counter++;
        this.tableOrder=new Queue<Order> () {
            @Override
            public boolean add(Order order) {
                return false;
            }

            @Override
            public boolean offer(Order order) {
                return false;
            }

            @Override
            public Order remove() {
                return null;
            }

            @Override
            public Order poll() {
                return null;
            }

            @Override
            public Order element() {
                return null;
            }

            @Override
            public Order peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Order> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Order> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public BigDecimal getTotalTip() {
        return group.getGroupTip ();
    }


    public void addGroupToTable(Group group){
        if (capacity>group.getCount ()){
            setGroup(group);
        }else System.out.println ("not enough space on table please sit on another table");
    }
}
