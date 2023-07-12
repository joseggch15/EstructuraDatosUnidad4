import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unidad4 {
    public static void main(String[] args) throws Exception {
        // Crear objetos de la clase Persona
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("María", 30);
        Persona persona3 = new Persona("Pedro", 35);
        Persona persona4 = new Persona("Laura", 28);
        Persona persona5 = new Persona("Carlos", 32);

        // Trabajar con List
        List<Persona> listaPersonas = new ArrayList<>();

        // Agregar objetos a la lista
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);

        // Buscar objetos en la lista por índice
        Persona personaEnIndice2 = listaPersonas.get(2);
        System.out.println("Objeto encontrado en la lista (por índice): " + personaEnIndice2);

        // Insertar objeto en la lista
        Persona nuevaPersona = new Persona("Ana", 27);
        listaPersonas.add(1, nuevaPersona);
        System.out.println("Lista después de insertar un objeto: " + listaPersonas);

        // Eliminar objeto de la lista
        listaPersonas.remove(persona3);
        System.out.println("Lista después de eliminar un objeto: " + listaPersonas);

        // Verificar si un objeto existe en la lista
        boolean existePersona = listaPersonas.contains(persona5);
        System.out.println("¿Existe la persona en la lista? " + existePersona);

        // Trabajar con Set
        Set<Persona> conjuntoPersonas = new HashSet<>();

        // Agregar objetos al conjunto
        conjuntoPersonas.add(persona1);
        conjuntoPersonas.add(persona2);
        conjuntoPersonas.add(persona3);
        conjuntoPersonas.add(persona4);
        conjuntoPersonas.add(persona5);

        // Buscar objetos en el conjunto
        boolean existePersonaEnConjunto = conjuntoPersonas.contains(persona3);
        System.out.println("¿Existe la persona en el conjunto? " + existePersonaEnConjunto);

        // Trabajar con Map
        Map<String, Persona> mapaPersonas = new HashMap<>();

        // Agregar objetos al mapa
        mapaPersonas.put("Persona1", persona1);
        mapaPersonas.put("Persona2", persona2);
        mapaPersonas.put("Persona3", persona3);
        mapaPersonas.put("Persona4", persona4);
        mapaPersonas.put("Persona5", persona5);

        // Buscar objeto en el mapa por clave
        Persona personaEnClave = mapaPersonas.get("Persona3");
        System.out.println("Objeto encontrado en el mapa (por clave): " + personaEnClave);

        // Eliminar objeto del mapa por clave
        mapaPersonas.remove("Persona4");
        System.out.println("Mapa después de eliminar un objeto: " + mapaPersonas);

        // Trabajar con Stack (pila)
        Stack<Persona> pilaPersonas = new Stack<>();

        // Agregar objetos a la pila
        pilaPersonas.push(persona1);
        pilaPersonas.push(persona2);
        pilaPersonas.push(persona3);

        // Eliminar objeto de la pila
        Persona objetoEliminado = pilaPersonas.pop();
        System.out.println("Objeto eliminado de la pila: " + objetoEliminado);

        // Trabajar con Queue (cola)
        Queue<Persona> colaPersonas = new LinkedList<>();

        // Agregar objetos a la cola
        colaPersonas.add(persona1);
        colaPersonas.add(persona2);
        colaPersonas.add(persona3);

        // Eliminar objeto de la cola
        Persona objetoRemovido = colaPersonas.remove();
        System.out.println("Objeto removido de la cola: " + objetoRemovido);

        List<String> lista = Arrays.asList("A", "B", "C", "D");

        // For tradicional
        System.out.println("Recorrido con for tradicional:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Foreach
        System.out.println("Recorrido con foreach:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // While
        System.out.println("Recorrido con while:");
        int i = 0;
        while (i < lista.size()) {
            System.out.println(lista.get(i));
            i++;
        }

        // Do/while
        System.out.println("Recorrido con do/while:");
        int j = 0;
        do {
            System.out.println(lista.get(j));
            j++;
        } while (j < lista.size());

        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 3);

        // Orden ascendente
        Collections.sort(numeros);
        System.out.println("Lista ordenada en forma ascendente: " + numeros);

        // Orden descendente
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Lista ordenada en forma descendente: " + numeros);

        Set<String> conjunto = new HashSet<>(Arrays.asList("A", "B", "C", "D"));

        // For tradicional (no se garantiza un orden específico en un HashSet)
        System.out.println("Recorrido con for tradicional:");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }

        // Foreach
        System.out.println("Recorrido con foreach:");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }

        // While (no se garantiza un orden específico en un HashSet)
        System.out.println("Recorrido con while:");
        Iterator<String> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Do/while (no se garantiza un orden específico en un HashSet)
        System.out.println("Recorrido con do/while:");
        Iterator<String> iterator2 = conjunto.iterator();
        do {
            System.out.println(iterator2.next());
        } while (iterator2.hasNext());

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);
        mapa.put("D", 4);

        // For tradicional
        System.out.println("Recorrido con for tradicional:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Foreach
        System.out.println("Recorrido con foreach:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // While
        System.out.println("Recorrido con while:");
        Iterator<Map.Entry<String, Integer>> iterator3 = mapa.entrySet().iterator();
        while (iterator3.hasNext()) {
            Map.Entry<String, Integer> entry = iterator3.next();
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Do/while
        System.out.println("Recorrido con do/while:");
        Iterator<Map.Entry<String, Integer>> iterator4 = mapa.entrySet().iterator();
        do {
            Map.Entry<String, Integer> entry = iterator4.next();
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        } while (iterator4.hasNext());

        List<String> lista2 = Arrays.asList("A", "B", "C", "D");

        // Stream
        System.out.println("Recorrido con Stream:");
        lista2.stream().forEach(elemento -> System.out.println(elemento));

        Set<String> conjunto2 = new HashSet<>(Arrays.asList("A", "B", "C", "D"));

        // Stream
        System.out.println("Recorrido con Stream:");
        conjunto2.stream().forEach(elemento -> System.out.println(elemento));

        Map<String, Integer> mapa2 = new HashMap<>();
        mapa2.put("A", 1);
        mapa2.put("B", 2);
        mapa2.put("C", 3);
        mapa2.put("D", 4);

        // Stream
        System.out.println("Recorrido con Stream:");
        mapa2.entrySet().stream()
                .forEach(entry -> System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue()));

        List<String> lista3 = Arrays.asList("A", "B", "C", "D");

        // Función flecha o lambda
        System.out.println("Recorrido con función flecha o lambda:");
        lista3.forEach(elemento -> System.out.println(elemento));

        Set<String> conjunto3 = new HashSet<>(Arrays.asList("A", "B", "C", "D"));

        // Función flecha o lambda
        System.out.println("Recorrido con función flecha o lambda:");
        conjunto3.forEach(elemento -> System.out.println(elemento));

        Map<String, Integer> mapa3 = new HashMap<>();
        mapa3.put("A", 1);
        mapa3.put("B", 2);
        mapa3.put("C", 3);
        mapa3.put("D", 4);

        // Función flecha o lambda
        System.out.println("Recorrido con función flecha o lambda:");
        mapa3.forEach((clave, valor) -> System.out.println("Clave: " + clave + ", Valor: " + valor));

        String[] array = { "A", "B", "C", "D" };

        // Conversión de array a List
        List<String> lista4 = Arrays.asList(array);
        System.out.println(lista4.toString());

        List<String> lista5 = Arrays.asList("A", "B", "C", "D");
        System.out.println(lista5.toString());

        List<String> lista6 = Arrays.asList("A", "B", "C", "D");

        // Conversión de List a array
        String[] array2 = lista6.toArray(new String[lista.size()]);
        for (String string : array2) {
            System.out.print(string + ", ");
        }

        System.out.println();

        List<String> lista7 = Arrays.asList("A", "B", "C");
        List<String> lista8 = Arrays.asList("D", "E", "F");

        // Forma 1: Utilizando el método addAll()
        List<String> listaUnion1 = new ArrayList<>(lista7);
        listaUnion1.addAll(lista7);
        System.out.println("Lista unida (forma 1): " + listaUnion1);

        // Forma 2: Utilizando el operador de Stream "concat()"
        List<String> listaUnion2 = Stream.concat(lista8.stream(), lista2.stream())
                .collect(Collectors.toList());
        System.out.println("Lista unida (forma 2): " + listaUnion2);

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5);

        // Desordenar la lista
        Collections.shuffle(numeros2);
        System.out.println("Lista desordenada: " + numeros2);

    }
}
