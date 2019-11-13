/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesji.model;

import javax.swing.JOptionPane;


public class Model {
    private String colaCircular[];
    public String productoEntrada;
    public int frente;
    public int fin;
    private byte capacidad=5;
    public Model(){
        colaCircular=new String [capacidad];
        //Creamos la cola dentro del constructor simulando la clase crearCola
        //ya que aqui tiene los valores iniciales para los objetos
        this.frente = 0;
        this.fin = capacidad-1;
    }
    public void insertar(){
        if(!llena()){
            fin = siguiente(fin);
            colaCircular[fin]=productoEntrada;
        }else{
            JOptionPane.showMessageDialog(null,"Cola llena!! :(");
        }
    }
    public void quitar(){
        if(!vacia()){
            colaCircular[frente]=venderproducto();//elimina el producto o proceso
            frente = siguiente(frente);
        }
    }
    public void verColaCompleta(){
        if(!vacia()){
            String colaCircularDatos = "";
            for (int i = frente; i < fin; i++) {
                if(i==capacidad){
                    i = 0;
                }
                colaCircularDatos +="cola ["+i+"]="+colaCircular[i]+"\n";
            }
            JOptionPane.showMessageDialog(null,colaCircularDatos);
        }else{
            JOptionPane.showMessageDialog(null,"No hay elementos agregados al almacen");
        }
    }
    public void verPrimerElemento(){
        if(!vacia()){
            JOptionPane.showMessageDialog(null,"El siguienyte dato en salir es: "+colaCircular[frente]);
        }else{
            JOptionPane.showMessageDialog(null,"No hay elementos agregados al almacen");
        }
    }
    private String venderproducto(){
        return null;
    }
    private boolean vacia(){
        return frente == siguiente(fin);
    }
    private boolean llena(){
        return frente==siguiente(siguiente(fin));
    }
    private int  siguiente (int num){
        return (num+1)%capacidad;
    }
}
