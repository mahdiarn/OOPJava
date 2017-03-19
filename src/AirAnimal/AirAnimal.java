/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirAnimal;
import Animal.Animal;
/**
 *
 * @author user
 */
public class AirAnimal extends Animal {
    //Constructor tanpa parameter
    AirAnimal() {
        weight = 0;
        tipe = 0;
        tamed = false;
        location_x = -1;
        location_y = -1;
    }
    //Constructor dengan parameter
    AirAnimal(int _weight,
            int _tipe,
            boolean _tamed,
            int _x,
            int _y) {
        weight = _weight;
        tipe = _tipe;
        tamed = _tamed;
        location_x = _x;
        location_y = _y;
    }
    
    //Copy Constructor
    AirAnimal (AirAnimal a) {
        weight = a.weight;
        tipe = a.tipe;
        tamed = a.tamed;
        location_x = a.location_x;
        location_y = a.location_y;
    }
            
    @Override
    public void Eat() {
        System.out.println("\"Nyam\" *then fly");
    }

    @Override
    public void Interact() {
        System.out.println("\"oi!\"");
    }
}
