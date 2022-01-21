/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kavin
 */
public class SaveableDictionary {
    
    private Map<String, String> dictionary;
    private Map<String, String> reverseDictionary;
    private String file;
    
    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
        this.reverseDictionary = new HashMap<>();
    }
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.reverseDictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, translation);
        reverseDictionary.putIfAbsent(translation, word);
    }
    
    public String translate(String word) {
        if (dictionary.get(word) != null) {
            return dictionary.get(word);
        } else {
            return reverseDictionary.get(word);
        }
    }
    
    public void delete(String word) {
            if (dictionary.containsKey(word)) {
                String translation = dictionary.get(word);
                dictionary.remove(word);
                reverseDictionary.remove(translation);
            } else if (reverseDictionary.containsKey(word)) {
                String translation = reverseDictionary.get(word);
                reverseDictionary.remove(word);
                dictionary.remove(translation);
            }
    }
    
    public boolean load() {
        try (Scanner fileLines = new Scanner(Paths.get(file))) {
            while (fileLines.hasNextLine()) {
                String row = fileLines.nextLine();
                String[] parts = row.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (String word : dictionary.keySet()) {
                String translation = dictionary.get(word);
                writer.println(word + ":" + translation);
            }
            writer.close();
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
}
