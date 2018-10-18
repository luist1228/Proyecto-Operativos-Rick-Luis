/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.operativos;

/**
 *
 * @author LuisM
 */
public class Almacen {
    int [] p;
    int x;
    
    public Almacen(int tam){
       this.x=tam;
       this.p= new int [x];
    }

    public int[] getP() {
        return p;
    }

    public void setP(int[] p) {
        this.p = p;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    
    
    
}
