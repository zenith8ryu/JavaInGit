package linren;

import java.util.ArrayList;

public class FirstableArrayList<T> {

    private final ArrayList<T> list;

    public FirstableArrayList(ArrayList<T> list) {
        this.list = list;
    }

    /**
     * use get as a normal arraylist
     *
     * @param i
     * @return
     */
    public T get(int i) {
        return list.get(i);
    }

    /**
     * add a new method
     *
     * @return
     */
    public T getFirst() {
        return list.get(0);
    }


    /**
     * "add" method with log output
     *
     * @param elem
     */
    public void add(T elem) {
        System.out.println("element added!");
        list.add(elem);
    }


    /**
     * to make list usable
     *
     * @return
     */
    public ArrayList<T> getList() {
        return list;
    }

    /**
     * to get list size
     *
     * @return
     */
    public int size() {
        return list.size();
    }
}