//Este codigo fue creado en JAVA
//Alumno: Rosales Mendoza Jose Francisco

//LIBRERIAS NECESARIAS
import java.util.LinkedList;
import java.util.Queue;

//EJEMPLO DE USO
public class Main {
    public static void main(String[] args) throws Exception {
        CommonStreamElements ejemplo = new CommonStreamElements();
        ejemplo.accion(a, b) // Aqui se llama al metodo de la clase CommonStreamElements, mandando las dos colas a comparar
    }
}

//CLASE REQUERIDA PARA CUESTIONARIO 

public class CommonStreamElements{
    public Queue<Integer> accion( Queue<Integer> a,  Queue<Integer> b){
        Integer aux, aux2;
        Queue<Integer> colaNew = new LinkedList();
        
        for(int i=0; i<a.size() ; i++){ //Itera elementos de cola A
            aux=a.remove(); // Desencolamos el elemento correspondiente a COLA A  -- DEFINITIVAMENTE
            for(int j=0; j<b.size() ; j++){ //Itera elementos de cola B
                aux2=b.remove(); // Desencolamos el elemento correspondiente a COLA B  -- TEMPORALMENTE
                if(aux1==aux2){ // Comparamos ambos elementos si son iguales se agregan a una nueva cola
                    colaNew.add(aux1); // Se agrega a la nueva cola COLA NEW
                }
                b.add(aux2); //Vuelve a encolar el elemento de la COLA B para futuras comparaciones
            } 
        } 
        return colaNew; //Regresa la cola con los elementos en comun de ambas colas 
    }
}