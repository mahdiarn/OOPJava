/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WaterAnimal;
import Animal.Animal;
/**
 *
 * @author Mahdiar Naufal
 */
public class WaterAnimal extends Animal {
    //Constructor tanpa parameter
    WaterAnimal () {
        weight = 0;
        tipe = 0;
        tamed = false;
        location_x = -1;
        location_y = -1;
    }
    
    //Constructor dengan parameter
    WaterAnimal (int _weight, 
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
    WaterAnimal (WaterAnimal w) {
        weight = w.weight;
        tipe = w.tipe;
        tamed = w.tamed;
        location_x = w.location_x;
        location_y = w.location_y;   
    }
    //Abstract method implementation
    @Override
    public void Eat() {
        System.out.println("\"Nyam\" *splash");
    }

    @Override
    public void Interact() {
        System.out.println("\"oi!\"");
    }
    
}
