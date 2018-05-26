/*
 * Ejemplo desarrollado por Erick Navarro
 * Blog: e-navarro.blogspot.com
 * Octubre - 2015
 */

package avlgraphviz;

import avl.ArbolAVL;

/**
 * Clase principal de la aplicación.
 * @author Erick Navarro
 */
public class AVLGraphviz {

    /**
     * Método principal de la aplicación
     * @param args los argumentos de la línea de comando.
     */
    public static void main(String[] args) {
        //Creamos un árbol cuyos nodos contendrán solamente texto
        ArbolAVL arbol_texto=new ArbolAVL();
        //Llenamos con información el árbol
        arbol_texto.insertar("Juan");
        arbol_texto.insertar("Pedro");
        arbol_texto.insertar("María");
        arbol_texto.insertar("Roberto");
        arbol_texto.insertar("Teodoro");
        arbol_texto.insertar("Manuel");
        arbol_texto.insertar("Diego");
        arbol_texto.insertar("Alejandro");
        arbol_texto.insertar("Margarita");
        arbol_texto.insertar("Luis");
        arbol_texto.insertar("Hernán");
        arbol_texto.insertar("Jaime");
        arbol_texto.insertar("Ana");
        arbol_texto.insertar("Francisco");
        arbol_texto.insertar("Andrea");
        //Graficamos el árbol generando la imagen arbol_texto.jpg
        arbol_texto.graficar("arbol_texto.jpg");
        //Imprimimos el contenido del árbol ordenado
        arbol_texto.inorden();
        
        System.out.println();
        //Creamos un árbol cuyos nodos contendrán solamente numeros
        ArbolAVL arbol_numeros=new ArbolAVL();
        //Llenamos con información el árbol
        arbol_numeros.insertar(12);
        arbol_numeros.insertar(5);
        arbol_numeros.insertar(26);
        arbol_numeros.insertar(33);
        arbol_numeros.insertar(59);
        arbol_numeros.insertar(27);
        arbol_numeros.insertar(15);      
        arbol_numeros.insertar(47);
        arbol_numeros.insertar(74);
        arbol_numeros.insertar(84);
        arbol_numeros.insertar(88);
        arbol_numeros.insertar(90);
        arbol_numeros.insertar(124);
        arbol_numeros.insertar(612);
        //Graficamos el árbol generando la imagen arbol_numeros.jpg
        arbol_numeros.graficar("arbol_numeros.jpg");
        //Imprimimos el contenido del árbol ordenado
        arbol_numeros.inorden();
    }
    
}
