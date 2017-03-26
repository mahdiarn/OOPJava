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
public class Zoo {
    /**
     * height dari matriks
     */
    public final int nbaris;
    
    /**
     * width dari matriks
     */
    public final int nkolom;
    
    /**
     * matriks untuk menyimpan map Zoo 
     */
    private Cell[][] matriks_sel;
    
    /**
     * ctor tanpa parameter
     */
    public Zoo(){
        this.nbaris = 1;
        this.nkolom = 1;
        matriks_sel = new Cell[][1];
        matriks_sel[1] = new Cell[1];
        Cell matriks[1][1];
    }
    
    /**
     * ctor dengan dua parameter
    * @param nbaris Description inisialisasi untuk public final nbaris
     * @param nkolom Description inisialisasi untuk public final nkolom
     * @param nbrs Description masukan untuk nbaris
     * @param nkol Description masukan untuk nkolom
     */
    public Zoo(int nbrs, int nkol){
        this.nbaris = nbrs;
        this.nkolom = nkol;        
        matriks_sel = new Cell[][nbaris];
        for (int i = 0; i < nbaris; i++) {
            matriks_sel[i] = new Cell[nkolom];
        }
        for (int i = 0; i < nbaris; i++) {
            for (int j = 0; j < nkolom; j++) {
                Cell matriks[i][j];
            }
        }
    }
    
    /**
     * cctor
     * @param z objek zoo yang akan di-assign 
     */
    public Zoo(final Zoo z){
        this.nbaris = z.nbaris;
        this.nkolom = z.nkolom;
        
        matriks_sel = new Cell[][nbaris];
        for (int i = 0; i < nbaris; i++) {
            matriks_sel[i] = new Cell[nkolom];
        }
        for (int i = 0; i < nbaris; i++) {
            for (int j = 0; j < nkolom; j++) {
                matriks_sel[i][j] = z.matriks_sel[i][j];
            }
        }
    }
    
    /**
     * getter
     * @param x Description absis
     * @param y Description ordinat
     * @return Description -5 <= output <= 3 
     */
    public int GetElementZoo(int x, int y){
        return matriks_sel[x][y].GetNilaiCell();
    }
    
    /**
     * mencetak map ke layar
     * @param nbrs Description masukan untuk baris
     * @param nkol Description masukan untuk kolom
     */
    public void PrintZoo(int nbrs, int nkol){
        LandHabitat land_habitat = new LandHabitat();
        WaiterHabitat water_habitat = new WaterHabitat();
        AirHabitat air_habitat = new AirHabitat();
        Road road = new Road();
        Park park = new Park();
        Restaurant restaurant = new Restaurant();
        Entrance entrance = new Entrance();
        Exit exit = new Exit();
        for (int i = 0; i < nbrs; i++) {
            for (int j = 0; j < nkolom; j++) {
                switch (GetElementZoo(i,j)) {
                    case 1:
                        land_habitat.Render();
                        break;
                    case 2:
                        water_habitat.Render();
                        break;
                    case 3:
                        air_habitat.Render();
                        break;
                    case -1:
                        road.Render();
                        break;
                    case -2:
                        park.Render();
                        break;
                    case -3:
                        restaurant.Render();
                        break;
                    case -4:
                        entrance.Render();
                        break;
                    case -5:
                        exit.Render();
                        break;
                    default:
                        break;
                }
            }
            System.out.println("");
        }
        System.out.println("Legenda; ");
        System.out.println("+ = Land Habitat" + "" + "# = Road");
        System.out.println("@ = Air Habitat" + "" + "~ = Park");
        System.out.println("$ = Water Habitat" + "" + "& = Restaurant");
    }
    
    /**
     * setter elemen Zoo
     * @param x Description absis
     * @param y Description ordinat
     * @param k Description elemen zoo, -5 <= k <= 3
     */
    public void SetElementZoo(int x, int y, int k){
        LandHabitat land_habitat = new LandHabitat();
        WaterHabitat water_habitat = new WaterHabitat();
        AirHabitat air_habitat = new AirHabitat();
        Road road = new Road();
        Park park = new Park();
        Restaurant restaurant = new Restaurant();
        Entrance entrance = new Entrance();
        Exit exit = new Exit();

        switch (k) {
            case 1:
                matriks_sel[x][y] = land_habitat;
                break;
            case 2:
                matriks_sel[x][y] = water_habitat;
                break;
            case 3:
                matriks_sel[x][y] = air_habitat;
                break;
            case -1:
                matriks_sel[x][y] = road;
                break;
            case -2:
                matriks_sel[x][y] = park;
                break;
            case -3:
                matriks_sel[x][y] = restaurant;
                break;
            case -4:
                matriks_sel[x][y] = entrance;
                break;
            case -5:
                matriks_sel[x][y] = exit;
                break;
            default:
                break;
        }
    }
}
