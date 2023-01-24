package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

public class ExemploList {

  public static void main(String[] args) {

    //listando as notas;
    System.out.println("Crie uma lista e adicione as sete notas: ");
    List<Double> notas = new ArrayList<>();
    notas.add(7.0);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5.0);
    notas.add(7.0);
    notas.add(0.0);
    notas.add(3.6);
    System.out.println(notas);

    //buscando a posição da nota;
    System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

    //inserindo uma nota na lista na posição determinada;
    System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
    notas.add(4, 8.0);
    System.out.println(notas);

    //substituindo uma nota pela outra;
    System.out.println("Substitua a nota 5.0 pela nota 6.0");
    notas.set(notas.indexOf(5.0), 6.0);
    System.out.println(notas);

    //conferindo se a nota está na lista;
    System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
    
    //exibindo uma nota em determinada posição;
    System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
    System.out.println(notas);

    //exibindo a menor nota;
    System.out.println("Exiba a menor nota: " + Collections.min(notas));

    //exibindo a maior nota;
    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    //exibindo a soma das notas presente na lista;
    Iterator<Double> iterator = notas.iterator();
    double soma = 0d;
    while(iterator.hasNext()) {
      double next = iterator.next();
      soma += next;
    }
    System.out.println("Exiba a soma dos valores: " + soma);

    //exibindo a média das notas;
    System.out.println("Exiba a média das notas: " + (soma / notas.size()));

    //removendo uma nota pelo valor do objeto;
    System.out.println("Remova a nota 0.0: ");
    notas.remove(0.0); // (0d)
    System.out.println(notas);

    //removendo a nota pela posição;
    System.out.println("Remova a nota da posição 0");
    notas.remove(0);
    System.out.println(notas);
     
    //removendo as notas menores que 7.0;
    System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
    Iterator<Double> iterator1 = notas.iterator();
    while(iterator1.hasNext()) {
      double next = iterator1.next();
      if(next < 7.0) {
        iterator1.remove();
      }
    }
    System.out.println(notas);

    //apagando a lista;
    System.out.println("Apague toda a lista: ");
    notas.clear();
    System.out.println(notas);

    //verificando se alista está vazia;
    System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

  }
  
}
