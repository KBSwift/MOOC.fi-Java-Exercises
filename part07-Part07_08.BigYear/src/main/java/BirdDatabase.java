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

public class BirdDatabase {
    
    ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        birds.add(bird);
    }
    
    public void addObservation(String birdName) {
        birdName = birdName.toLowerCase();
        for (Bird bird : birds) {
            if (birdName.equals(bird.getName().toLowerCase())) {
                bird.setObservations();
            }
        }
    }
    
    public boolean isBirdFound(String birdName) {
        birdName = birdName.toLowerCase();
        for (Bird bird : birds) {
            if (birdName.equals(bird.getName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    
    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void printOneBird(String birdName) {
        birdName = birdName.toLowerCase();
        for (Bird bird : birds) {
            if (birdName.equals(bird.getName().toLowerCase())) {
                System.out.println(bird);
            }
        }
    }
    
}
