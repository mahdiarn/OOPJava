/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Octopodiae;
import WaterAnimal.WaterAnimal;
/**
 *
 * @author Mahdiar Naufal
 */
public class Octopodiae extends WaterAnimal{
    //Constructor tanpa parameter
    public Octopodiae () {
        weight = 0;
        tipe = 0;
        tamed = false;
        location_x = -1;
        location_y = -1;
    }
    
    //Constructor dengan parameter
    public Octopodiae (int _weight, 
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
    public Octopodiae (Octopodiae s) {
        weight = s.weight;
        tipe = s.tipe;
        tamed  = s.tamed;
        location_x = s.location_x;
        location_y = s.location_y;
    }

    @Override
    public void Eat() {
        System.out.println("\"Nyam\""); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Interact() {
        System.out.println("\"Hewan : oi!\""); //To change body of generated methods, choose Tools | Templates.
    }
}
