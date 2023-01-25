package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Dado os modelos dos carros e seus respectivos consumos na estrada, faça: 
 modelo = golfGTI - consumo = 12,2 km/l
 modelo = jettaTSI - consumo = 12,5 km/l
 modelo = audiA1 - consumo = 15,2 km/l
 modelo = Tiguan - consumo = 9 km/l
 modelo = fuscaTSI - consumo = 10,7 km/l

 modelo (keys) - consumo (value)
 */

public class ExemploMap {
  
  public static void main(String[] args) {

    //criando um dicionário que relaciona os modelos dos carros e seus consumos na estrada:
    Map<String, Double> meusCarros = new HashMap<>() {{
      put("golf", 12.2);
      put("jetta", 12.5);
      put("audi A1", 15.2);
      put("tiguan", 9d);
      put("fusca TSI", 10.7);
    }};
    System.out.println(meusCarros);
    
    //substituindo o consumo de um carro:
    System.out.println("Substitua o consumo do golf por 13,4 km/l: ");
    meusCarros.put("golf", 13.4);
    System.out.println(meusCarros);

    //conferindo se um modelo de carro está presente no dicionário:
    System.out.println("Confira se o modelo GLE 400 está no dicionário: " + meusCarros.containsKey("GLE 400"));

    //exibindo o consumo de um modelo:
    System.out.println("Exiba o consumo da Audi A1: " + meusCarros.get("audi A1"));

    //exibindo os modelos:
    System.out.println("Exiba os modelos: ");
    Set<String> modelos = meusCarros.keySet();
    System.out.println(modelos);

    //exibindo os consumos:
    System.out.println("Exiba o consumo dos veículos: ");
    Collection<Double> consumos = meusCarros.values();
    System.out.println(consumos);

    //exibindo o modelo mais economico e seu respectivo consumo:
    Double consumoMaisEficiente = Collections.max(meusCarros.values());
    Set<Map.Entry<String, Double>> entries = meusCarros.entrySet();
    String modeloMaisEficiente = " ";
    for (Map.Entry<String,Double> entry : entries) {
      if(entry.getValue().equals(consumoMaisEficiente)) {
        modeloMaisEficiente = entry.getKey();
        System.out.println("Modelo mais econômico e seu respectivo consumo: " + modeloMaisEficiente + 
        " - " + consumoMaisEficiente);
      }
    }

    //exibindo o modelo menos economico e seu respectivo consumo: 
    Double consumoMenosEficiente = Collections.min(meusCarros.values());
    String modeloMenosEficiente = " ";
    for (Map.Entry<String,Double> entry : entries) {
      if(entry.getValue().equals(consumoMenosEficiente)){
        modeloMenosEficiente = entry.getKey();
        System.out.println("Modelo menos econômico e seu respectivo consumo: " + modeloMenosEficiente + 
        " - " + consumoMenosEficiente);
      }
    }

    //fazendo a soma do consumo dos modelos: 
    Iterator<Double> iterator = meusCarros.values().iterator();
    double soma = 0d;
    while(iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("Exiba a soma dos consumos: " + soma);

    //fazendo a média dos consumos deste dicionário de carros: 
    System.out.println("Exiba a mádia dos consumos dos carros: " + (soma/meusCarros.size()));

    //removendo modelos de carros inferiores aos consumos desejados:
    System.out.println("Remova os modelos com consumo igual a 9,0 km/l: ");
    Iterator<Double> iterator1 = meusCarros.values().iterator();
    while(iterator.hasNext()) {
      if(iterator1.next().equals(9.0)) {
        iterator1.remove();
      }
    }
    System.out.println(meusCarros);

    //apagndo o dicionario de carros:
    System.out.println("Apague o dicionário de carros: ");
    meusCarros.clear();

    //conferindo se o dicionario está vazio:
    System.out.println("Confira se o dicionário está vazio: ");
    meusCarros.isEmpty();

  }
}
