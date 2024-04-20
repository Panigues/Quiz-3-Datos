
import org.example.BinarySearchTree;
import org.example.LinkedList;

import java.util.Random;
import java.util.Date;

public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10000];
    for (int i = 0; i < 10000; i++) {
        numbers[i] = random.nextInt(100000);
    }

    LinkedList linkedList = new LinkedList();
    BinarySearchTree bst = new BinarySearchTree();

    long tiempoInicial = new Date().getTime();
    for (int number : numbers) {
        linkedList.insert(number);
    }
    long TiempoFinal = new Date().getTime();
    System.out.println("Linked list tiempo de insercion: " + (TiempoFinal - tiempoInicial) + " ms");

    tiempoInicial = new Date().getTime();
    for (int number : numbers) {
        bst.insert(number);
    }
    TiempoFinal = new Date().getTime();
    System.out.println("BST tiempo de insercion: " + (TiempoFinal - tiempoInicial) + " ms");

    tiempoInicial = new Date().getTime();
    for (int number : numbers) {
        linkedList.search(number);
    }
    TiempoFinal = new Date().getTime();
    System.out.println("Linked list tiempo de busqueda: " + (TiempoFinal - tiempoInicial) + " ms");

    tiempoInicial = new Date().getTime();
    for (int number : numbers) {
        bst.search(number);
    }
    TiempoFinal = new Date().getTime();
    System.out.println("BST tiempo de busqueda: " + (TiempoFinal - tiempoInicial) + " ms");
}