package Code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class Nodo {
    public Nodo siguiente = null;
    public int CPU, proceso, prioridad, tiempoLlegada, tiempoespera;
    public String estado;
    
    public Nodo(int proceso, int CPU, int prioridad, int tiempoLlegada, String estado, int tiempoespera){ //Constructor
        this.proceso = proceso;
        this.siguiente = null;
        this.CPU = CPU;
        this.estado = estado;
        //this.quantum = quantum;
        this.prioridad = prioridad;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoespera = tiempoespera;
        
    }
    
    public int obtenerProceso(){
        return proceso;
    }
    
    public int obtenerCPU(){
        return CPU;
    }
    
    /*public int obtenerQuantum(){
        return quantum;
    }*/
    
    public int obtenerPrioridad(){
        return prioridad;
    }
    
    public String obtenerEstado(){
        return estado;
    }
    
    public int obtenerIndiceProceso(){
        return proceso;
    }
    
    public int obtenerTiempollegada(){
        return tiempoLlegada;
    }
    
    public void enlazarSiguiente(Nodo nodoSig){
        siguiente = nodoSig;
    }
    
    public Nodo obtenerSiguiente(){//Obtiene el valor del nodo que fue enlazado en el método anterior
        return siguiente;
    }
}
