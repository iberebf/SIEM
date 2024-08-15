/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemae;

import java.util.HashMap;
import java.util.Random;



public class HashTable<T> extends AspiranteCRUD<T> {
    
    private final HashMap<Integer, T> table;
        private Random random;

    public HashTable() {
        this.table = new HashMap<>();
        this.random = new Random();
    }
    public int generateRandomKey() {
        int key;
        do {
            key = random.nextInt(20); // Genera un número aleatorio entre 0 y 9999
        } while (table.containsKey(key)); // Asegura que la clave sea única
        return key;
    }
    @Override
    public void create(int key, T item) {
        if (table.containsKey(key)) {
            System.out.println("Error: Ya existe un aspirante con el ID " + key);
        } else {
            table.put(key, item);
            System.out.println("Aspirante creado con ID: " + key);
        } 
    }

    @Override
    public  T read(int key) {
        T item = table.get(key);
        if (item != null) {
            System.out.println("Aspirante con ID " + key + ": " + item);
        } else {
            System.out.println("No se encontró ningún aspirante con el ID " + key);
        }
        return item;
    }
    @Override
    public void update(int key, T newItem) {
        if (table.containsKey(key)) {
            table.put(key, newItem);
            System.out.println("Aspirante actualizado con ID: " + key);
        } else {
            System.out.println("El registro no existe.");
        }
    }

    @Override
    public void delete(int key) {
        T removedItem = table.remove(key);
        if (removedItem != null) {
            System.out.println("Aspirante con ID " + key + " ha sido eliminado.");
        } else {
            System.out.println("Error: No se encontró ningún aspirante con el ID " + key);
        }
    }
    
    public void listAll() {
        if (table.isEmpty()) {
            System.out.println("No hay aspirantes en la lista.");
        } else {
            for (int key : table.keySet()) {
                System.out.println(key + ": " + table.get(key));
            }
        }
    }
   
}

