/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.operativos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author LuisM
 */
public class Productor extends Thread{
    //Almacenint o vec de int???
    
    private Almacen a;
    private Semaphore SP;
    private Semaphore SC;
    private Semaphore SE;
    
    public Productor(Almacen al,Semaphore Sp, Semaphore Sc,){
        this.a=al;
    }
}
