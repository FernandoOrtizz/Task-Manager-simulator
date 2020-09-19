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
public class Lista {
    public Nodo  inicioLista; //variable tipo nodo que es siempre la "cabeza" o el principio de la lista
    public int size =0;
    
    public void agregar(Nodo nodo/*int proceso, int cpu, int quantum, int prioridad, int tiempoLlegada, String estado*/){//añade un nuevo nodo al inicio de la lista
        if(inicioLista==null){//si la lista está vacía
            inicioLista = nodo;//new Nodo(/*proceso, cpu, quantum, prioridad, tiempoLlegada, estado*/);//se añade el nuevo nodo
             //inicioLista = nuevo;
        }else{
            Nodo temporal = inicioLista;//se crea un nodo temporal que tome el valor del inicio de la lista
            Nodo nuevo = nodo;//new Nodo(/*proceso, cpu, quantum, prioridad, tiempoLlegada, estado*/);//crea un nuevo nodo y se le asigna el valor que le pasamos como parámetro a la función
            
            nuevo.enlazarSiguiente(temporal);//el nodo recién creado apunta hacia el temporal
            inicioLista=nuevo;//el nuevo nodo pasa a ser el inicio de la lista
        }
        size++;
    }
    
    public Nodo obtener(int indice/*, Nodo nodo*/){//obtiene un nodo en la lista según el índice y devuelve un arreglo con sus valores
        int contador=1;
        Nodo nodo = inicioLista;//el nodo temporal toma el valor del inicio de la lista
        
        if(indice==1){
            return nodo;
        }if(indice>1){
            while(contador<indice){
            nodo=nodo.obtenerSiguiente();
            contador++;

            }
            
       }
       return nodo;
        
        /*nodo.proceso = temporal.proceso;
        nodo.CPU = temporal.CPU;
        nodo.prioridad = temporal.prioridad;
        nodo.tiempoLlegada = temporal.tiempoLlegada;
        nodo.estado = temporal.estado;*/
        
    }
    
    public void cambio(Nodo primero, Nodo segundo){
        String estado;
        int CPU, prioridad, tiempoLlegada, tiempoespera;
        int proceso;
        
        proceso = primero.proceso;
        CPU = primero.CPU;
        prioridad = primero.prioridad;
        tiempoLlegada = primero.tiempoLlegada;
        estado = primero.estado;
        tiempoespera = primero.tiempoespera;
        
        primero.proceso = segundo.proceso;
        primero.CPU = segundo.CPU;
        primero.prioridad = segundo.prioridad;
        primero.tiempoLlegada = segundo.tiempoLlegada;
        primero.estado = segundo.estado;
        primero.tiempoespera = segundo.tiempoespera;
        
        segundo.proceso = proceso;
        segundo.CPU = CPU;
        segundo.prioridad = prioridad;
        segundo.tiempoLlegada = tiempoLlegada;
        segundo.estado = estado;
        segundo.tiempoespera = tiempoespera;
        
    }
    
    public int size(){//tamaño de la lista
        return size;
    }
    
    public Nodo obtenerInicio(){
        return inicioLista;
    }
    
    public void ordenarCPU(Lista lista){
     
        boolean cambio;
        
        Nodo actual;
        Nodo siguiente = null;
        
        do{
            cambio = false;
            actual = lista.inicioLista;
            while (actual.siguiente != siguiente) {
                if (actual.CPU > actual.siguiente.CPU) {
                    cambio(actual, actual.siguiente);
                    cambio = true;
                }
                actual = actual.siguiente;
            }
        siguiente = actual;
        }while(cambio);
        
        
    }public void Prioridad(Lista lista){
        int cont =1;
        boolean cambio;
        Nodo actual;
        Nodo siguiente = null;
        
        do{
            cambio = false;
            actual = lista.inicioLista;
            while(cont<lista.size){
                while (actual.siguiente != siguiente) {
                System.out.println(actual.prioridad);
                System.out.println(actual.siguiente.prioridad);
                if (actual.prioridad > actual.siguiente.prioridad) {
                    cambio(actual, actual.siguiente);
                    System.out.println("Sí");
                    cambio = true;
                    
                }
                actual = actual.siguiente;
            }
                System.out.println("listo");
                cont++;
            }
            
        siguiente = actual;
        }while(cambio);
        
        
    }
    public void Fifo(Lista lista){
     
        boolean cambio;
        
        Nodo actual;
        Nodo siguiente = null;
        
        do{
            cambio = false;
            actual = lista.inicioLista;
            while (actual.siguiente != siguiente) {
                if (actual.prioridad == actual.siguiente.prioridad && actual.tiempoLlegada > actual.siguiente.tiempoLlegada) {
                   
                    cambio(actual, actual.siguiente);
                    cambio = true;
                    
                }
                actual = actual.siguiente;
            }
        siguiente = actual;
        }while(cambio);
        
        
    }
    
    public void FifoCPU(Lista lista){
     
        boolean cambio;
        
        Nodo actual;
        Nodo siguiente = null;
        
        do{
            cambio = false;
            actual = lista.inicioLista;
            while (actual.siguiente != siguiente) {
                if (actual.CPU == actual.siguiente.CPU && actual.tiempoLlegada > actual.siguiente.tiempoLlegada) {
                   
                    cambio(actual, actual.siguiente);
                    cambio = true;
                    
                }
                actual = actual.siguiente;
            }
        siguiente = actual;
        }while(cambio);
        
        
    }
    public void MIX(Lista lista){
     
        boolean cambio;
        
        Nodo actual;
        Nodo siguiente = null;
        
        do{
            cambio = false;
            actual = lista.inicioLista;
            while (actual.siguiente != siguiente) {
                if (actual.CPU > actual.siguiente.CPU && actual.prioridad == actual.siguiente.prioridad) {
                    cambio(actual, actual.siguiente);
                    cambio = true;
                }
                actual = actual.siguiente;
            }
        siguiente = actual;
        }while(cambio);
        
        
    }
    
}
