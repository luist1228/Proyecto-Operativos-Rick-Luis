/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.operativos;


import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author LuisM
 */
public class App {

    private double time;
    private int des;
    private int maxC;
    private int maxB;
    private int maxP;
    private int PiC;
    private int PiB;
    private int PiP;
    private int PmaxC;
    private int PmaxB;
    private int PmaxP;
    private int Ei;
    private int Emax; 
    
    private Almacen Ac;
    private Almacen Ab;
    private Almacen Ap;
    private int Afinal;
    
    private Productor Pc[];
    private Productor Pb[];
    private Productor Pp[];
    
    
    
    
    
public void Leer() throws FileNotFoundException {

    Scanner s = new Scanner(new File("C:\\Users\\luism\\Desktop\\Proyecto-Operativos\\src\\proyecto\\operativos\\Datos Iniciales.txt"));
    String line=s.nextLine();
    
    this.time= parseDouble(line.substring(27, 31).trim());
    System.out.println(this.time);
    
    line=s.nextLine();
    this.des= parseInt(line.substring(27, 31).trim());
    System.out.println(this.des);
    
    line=s.nextLine();
    this.maxC= parseInt(line.substring(27, 31).trim());
    System.out.println(this.maxC);
    
    line=s.nextLine();
    this.maxB= parseInt(line.substring(27, 31).trim());
    System.out.println(this.maxB);
    
    line=s.nextLine();
    this.maxP= parseInt(line.substring(27, 31).trim());
    System.out.println(this.maxP);
    
    line=s.nextLine();
    this.PiC= parseInt(line.substring(27, 31).trim());
    System.out.println(this.PiC);
    
    line=s.nextLine();
    this.PiB= parseInt(line.substring(27, 31).trim());
    System.out.println(this.PiB);
    
    line=s.nextLine();
    this.PiP= parseInt(line.substring(27, 31).trim());
    System.out.println(this.PiP);
    
    line=s.nextLine();
    this.PmaxC= parseInt(line.substring(27, 31).trim());
    System.out.println(this.PmaxC);
    
    line=s.nextLine();
    this.PmaxB= parseInt(line.substring(27, 31).trim());
    System.out.println(this.PmaxB);
    
    line=s.nextLine();
    this.PmaxP= parseInt(line.substring(27, 31).trim());
    System.out.println(this.PmaxP);
    
    line=s.nextLine();
    this.Ei= parseInt(line.substring(27, 31).trim());
    System.out.println(this.Ei);
    
    line=s.nextLine();
    this.Emax= parseInt(line.substring(27, 31).trim());
    System.out.println(this.Emax);    
}

public void crearAlmacenes(){
    this.Ac= new Almacen(this.maxC);
    this.Ab= new Almacen(this.maxB);
    this.Ap= new Almacen(this.maxP);
    
}

public void crearProductores(){
    this.Pc=new Productor [this.PmaxC];
    for (int i =0; i<this.PmaxC; i++){
        this.Pc[i]=new Productor();
    }
    
    this.Pb=new Productor [this.PmaxB];
    for(int i=0; i<this.maxB;i++){
        this.Pb[i]=new Productor();
    }
    
    this.Pp=new Productor [this.PmaxP];
    for(int i=0; i<this.maxP; i++){
        this.Pp[i]=new Productor ();
    }
    
}



}


