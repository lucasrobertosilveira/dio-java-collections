package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Quando utilizamos a interface Set não conseguimos acessar o indice e não temos elemntos com duplicidade. */

public class ExemploSet {
  
  public static void main(String[] args) {
    
    //criando um conjunto e adicionando notas:
    System.out.println("Crie um conjunto e adicione as notas: ");
    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notas);

    //conferindo se a nota está no conjunto:
    System.out.println("Confira se a nota 5d está no conjunto: " + notas.contains(5d));

    //exibindo a menor nota presente no conjunto:
    System.out.println("Exiba a menor nota: " + Collections.min(notas));

    //exibindo a maior nota presente no conjunto: 
    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    //exibindo a soma dos valores presente no conjunto de notas: 
    Iterator<Double> iterator = notas.iterator();
    double soma = 0d;
    while(iterator.hasNext()) {
      double next = iterator.next();
      soma += next;
    }
    System.out.println("Exiba a soma dos valores: " + soma);

    //exibindo a média das notas do conjunto:
    System.out.println("Exiba a média das notas: " + (soma/notas.size()));

    //removendo a nota 0d do conjunto:
    System.out.println("Remova a nota 0d: ");
    notas.remove(0d);
    System.out.println(notas);

    //removendo notas menores que 7d presente na lista:
    Iterator<Double> iterator1 = notas.iterator();
    while(iterator1.hasNext()) {
      double next = iterator1.next();
      if(next < 7) {
        iterator1.remove();
      }
    }
    System.out.println(notas);

    //exiba as notas na ordem conforme foi informada:
    System.out.println("Exiba todas as notas na ordem que foram informada: ");
    Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notas2);

    //exibindo as notas na ordem natural (crescente):
    System.out.println("Exiba as notas em ordem crescente: ");
    Set<Double> notas3 = new TreeSet<>(notas2);
    System.out.println(notas3);

    //apagando todo o conjunto de notas:
    System.out.println("Apague todo o conjunto: ");
    notas.clear();

    //Conferindo se o conjunto de notas esta vazio:
    System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
    System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

  }
}
