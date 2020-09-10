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
    Nodo siguiente;
    int CPU, quantum, proceso, residuo;
    String estado;
    
    public Nodo(int proceso, int CPU, int quantum, int residuo, String estado){ //Constructor
        this.proceso = proceso;
        this.siguiente = null;
        this.CPU = CPU;
        this.estado = estado;
        this.quantum = quantum;
        this.residuo = residuo;
    }
    
    public int obtenerProceso(){
        return proceso;
    }
    
    public int obtenerCPU(){
        return CPU;
    }
    
    public int obtenerQuantum(){
        return quantum;
    }
    
    public int obtenerResiduo(){
        return residuo;
    }
    
    public String obtenerEstado(){
        return estado;
    }
    
    public int obtenerIndiceProceso(){
        return proceso;
    }
    
    public void enlazarSiguiente(Nodo nodoSig){
        siguiente = nodoSig;
    }
    
    public Nodo obtenerSiguiente(){//Obtiene el valor del nodo que fue enlazado en el método anterior
        return siguiente;
    }
}
