package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dada as seguinte informações sobre minhas séries favoritas,
  crie uma conjunto e ordene-o exibindo:
  (nome - genero - tempo de episódio);
  
  Serie1= nome: Prison Break, genero: criminal, tempoEpisodio: 50
  Serie1= nome: La Casa de Papel, genero: criminal, tempoEpisodio: 45
  Serie1= nome: Dois homens e meio, genero: comedia, tempoEpisodio: 25
 */

public class ExemploOrdenacaoSet {
  
  public static void main(String[] args) {

    //criando o conjunto de séries por meio do 'HashSet':
    System.out.println("--\tOrdem aleatoria\t--");
    Set<Serie> minhasSeries = new HashSet<>() {{
      add(new Serie("Prison Break", "Criminal", 50));
      add(new Serie("La Casa de Papel", "Criminal", 45));
      add(new Serie("Dois homens e meio", "Comédia", 25));
    }};
    for (Serie serie : minhasSeries) {
      System.out.println(serie.getNome() + " - "
      + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

    //fazendo pela ordem de inderção por meio do 'LinkedHashSet':
    System.out.println("--\tOrdem de inserção\t--");
    Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
      add(new Serie("Prison Break", "Criminal", 50));
      add(new Serie("La Casa de Papel", "Criminal", 45));
      add(new Serie("Dois homens e meio", "Comédia", 25));
    }};
    for (Serie serie : minhasSeries) {
      System.out.println(serie.getNome() + " - "
      + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

    //fazendo pela ordem natural por meio do 'TreeSet':
    System.out.println("--\tOrdem natural\t--"); 
    Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
    for (Serie serie : minhasSeries2) {
      System.out.println(serie.getNome() + " - "
      + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

  }
}

class Serie implements Comparable<Serie>{
  private String nome;
  private String genero;
  private int tempoEpisodio;
  
  public Serie(String nome, String genero, int tempoEpisodio) {
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getNome() {
    return nome;
  }

  public String getGenero() {
    return genero;
  }

  public int getTempoEpisodio() {
    return tempoEpisodio;
  }

  @Override
  public String toString() {
    return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((genero == null) ? 0 : genero.hashCode());
    result = prime * result + tempoEpisodio;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Serie other = (Serie) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (genero == null) {
      if (other.genero != null)
        return false;
    } else if (!genero.equals(other.genero))
      return false;
    if (tempoEpisodio != other.tempoEpisodio)
      return false;
    return true;
  }

  @Override
  public int compareTo(Serie serie) {
    // TODO Auto-generated method stub
    int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    if(tempoEpisodio != 0) {
      return tempoEpisodio;
    } else {
      return this.getGenero().compareTo(serie.getGenero());
    }

  }

}
