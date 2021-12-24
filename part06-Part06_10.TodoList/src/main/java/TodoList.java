/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        for (String item : list) {
            System.out.println((list.indexOf(item) + 1) + ": " + item);
        }
    }

    public void remove(int number) {
        if (number == 1) {
            list.remove(0);
        } else {
            list.remove(number - 1);
        }
    }

}
