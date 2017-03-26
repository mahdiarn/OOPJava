/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Rizky Faramita <13515055 @ std.stei.itb.ac.id>
 * @version 1.1 (current version number of program)
 * @since 1.1 (the version of the package this class was first added to)
 */
public class Cages {
    /**
     * array of Cage dengan id yang sama
     */
    private Cage[] array_id;
    
    /**
     * ukuran array of Cage
     */
    private int neff;
    
    /**
     * ctor tanpa parameter
     */
    public Cages() {
       neff = 0;
       array_id = new Cage[neff]; 
    }
    
    /**
     * ctor dengan parameter
     * @param _neff masukan untuk ukuran array
     */
    public Cages(int _neff) {
        neff = _neff;
        array_id = new Cage[neff];
    }
    
    /**
     * cctor
     * @param c c objek cages yang ingin di-assign 
     */
    public Cages(final Cages c) {
        neff = c.neff;
        array_id = new Cage[neff];
    }
    
    /**
     * getter elemen array
     * @return mengembalikan sebuah array of cage dengan id yang sama
     */
    public Cage[] GetArrayCage(){
        return array_id;
    }
    
    /**
     * getter ukuran array
     * @return neff (ukuran array)
     */
    public int GetNeff(){
        return neff;
    }
    
    /**
     * meng-assign seluruh elemen array dengan suatu cage dengan id yang sama
     * @param _cage cage yang diassign ke dalam array of cage
     */
    public void SetIdx(Cage _cage){
       for (int i = 0; i < neff; i ++){
           array_id[i] = _cage;
       } 
    }
}
