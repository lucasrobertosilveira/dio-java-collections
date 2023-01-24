package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Dada as seguintes informações sobre meus carros, crie uma lista e ordene-a exibindo:
  (modelo - ano - cor);

  Carro1 = modelo : Golf GTI, ano : 2017, cor : Cinza
  Carro2 = modelo : Mercedez GLA 250, ano : 2015, cor : Azul
  Carro3 = modelo : Porsche 911, ano : 2021, cor : Vermelha
 */

public class ExemploOrdenacaoList {

  public static void main(String[] args) {

    //criando a lista de carros:
    List<Carro> meusCarros = new ArrayList<>() {{
      add(new Carro("Golf GTI", 2017, "Cinza"));
      add(new Carro("Mercedez GLA 250", 2015, "Azul"));
      add(new Carro("Porsche 911", 2021, "Vermelho"));
    }};

    //mostrando a lista pela ordem de inserção:
    System.out.println("--\tOrdem de inserção\t--");
    System.out.println(meusCarros);

    //mostrando a lista de forma aleatória
    System.out.println("--\tOrdem aleatória\t--");
    Collections.shuffle(meusCarros);
    System.out.println(meusCarros);
    
  }
  
}

class Carro {
  private String modelo;
  private int ano;
  private String cor;
  
  public Carro(String modelo, int ano, String cor) {
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAno() {
    return ano;
  }

  public String getCor() {
    return cor;
  }

  @Override
  public String toString() {
    return "Carro [modelo = " + modelo + ", ano = " + ano + ", cor = " + cor + "]";
  }
  
  
}
