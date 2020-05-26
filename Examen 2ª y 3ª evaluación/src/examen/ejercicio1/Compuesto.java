package examen.ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.io.IOException;


public class Compuesto {
    
    public static void main(String[] args) throws IOException {
    	
    	almacenarContenido("../Examen 2ª y 3ª evaluación/src/examen/ejercicio1/archivo.txt");
    }
    
    public static void almacenarContenido(String archivo) throws FileNotFoundException, IOException {
    	
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        
        Map <String, String> compuestos = new TreeMap<String, String>();
        
        Set <String> elementos = new HashSet<String>();
        
        while((cadena = b.readLine())!=null) {
        	
        	String[] partesArray = cadena.split(":");
        	String nombre = partesArray[0].trim();
            String composicion = partesArray[1].trim();
            
            compuestos.put(nombre,composicion);
            
            //almacenamos los elementos en una lista no repetida para despues mostrarlos
            String[] composArray = composicion.split(" ");
            for(int i=0; i<composArray.length; i++) {
            	
            	elementos.add(composArray[i]);
            }
        }
        
        
        //Forma de mostrar 1
        
        Iterator <Entry<String,String>> i = compuestos.entrySet().iterator();
        
        System.out.println("MÉTODO1");
        while(i.hasNext()) {
        	
        	Entry <String, String> e = i.next();
        	System.out.println(e.getKey() + ": " + e.getValue());
        }
        
        //Forma de mostrar 2
        
        System.out.println("--------------------------");
        System.out.println("MÉTODO2");
        for(Entry<String, String> e:compuestos.entrySet()) {
        	
        	System.out.println(e.getKey() + ": " + e.getValue());
        }
        
        //Forma de mostrar 3
        
        System.out.println("--------------------------");
        System.out.println("MÉTODO3");
        
        compuestos.forEach((k,v) -> System.out.println(k + ": " + v));
        
        
        //Mostramos los elementos
        
        System.out.println("--------------------------");
        System.out.println("ELEMENTOS");
        
        System.out.println(elementos);
        
        b.close();
        
    }
}
