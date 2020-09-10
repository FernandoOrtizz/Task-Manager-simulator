/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class Lista {
    Nodo  inicioLista; //variable tipo nodo que es siempre la "cabeza" o el principio de la lista
    int size;
    public Lista(){//constructor
        inicioLista = null;
        size = 0;
    }
    
    public void agregar(int proceso, int cpu, int quantum, int residuo, String estado){//añade un nuevo nodo al inicio de la lista
        if(inicioLista==null){//si la lista está vacía
            inicioLista = new Nodo(proceso, cpu, quantum, residuo, estado);//se añade el nuevo nodo
        }else{
            Nodo temporal = inicioLista;//se crea un nodo temporal que tome el valor del inicio de la lista
            Nodo nuevo = new Nodo(proceso, cpu, quantum, residuo, estado);//crea un nuevo nodo y se le asigna el valor que le pasamos como parámetro a la función
            
            nuevo.enlazarSiguiente(temporal);//el nodo recién creado apunta hacia el temporal
            inicioLista=nuevo;//el nuevo nodo pasa a ser el inicio de la lista
        }
        size++;
    }
    
    public void obtener(int indice, String arreglo[]){//obtiene un nodo en la lista según el índice y devuelve un arreglo con sus valores
        int contador=0;
        Nodo temporal = inicioLista;//el nodo temporal toma el valor del inicio de la lista
        
        while(contador<indice){
            temporal=temporal.obtenerSiguiente();
            contador++;
        }
        arreglo[0] = String.valueOf(temporal.obtenerProceso());
        arreglo[1] = String.valueOf(temporal.obtenerCPU());
        arreglo[2] = String.valueOf(temporal.obtenerQuantum());
        arreglo[3] = String.valueOf(temporal.obtenerResiduo());
        arreglo[4] = String.valueOf(temporal.obtenerEstado());

    }
    
    public int size(){//tamaño de la lista
        return size;
    }
    
    public boolean listaVacía(){//muestra si la lista está vacía
        return (inicioLista==null)?true:false;
    }
}
