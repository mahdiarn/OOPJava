/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equidae;
import LandAnimal.LandAnimal;
/**
 *
 * @author Mahdiar Naufal
 */
public class Equidae extends LandAnimal{
    //Constructor tanpa parameter
    public Equidae () {
        weight = 0;
        tipe = 0;
        tamed = false;
        location_x = -1;
        location_y = -1;
    }
    
    //Constructor dengan parameter
    public Equidae (int _weight, 
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
    public Equidae (Equidae g) {
        weight = g.weight;
        tipe = g.tipe;
        tamed  = g.tamed;
        location_x = g.location_x;
        location_y = g.location_y;
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
