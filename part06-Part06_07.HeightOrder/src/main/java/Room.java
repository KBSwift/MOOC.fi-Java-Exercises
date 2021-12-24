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

public class Room {
    ArrayList<Person> persons;
    
    public Room() {
        persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person shortest = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person shortestTaken = this.shortest();
        persons.remove(shortestTaken);
        
        return shortestTaken;
    }
}
