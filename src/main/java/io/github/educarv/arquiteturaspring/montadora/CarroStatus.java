package io.github.educarv.arquiteturaspring.montadora;

//Uma classe record é uma forma concisa de criar classes imutáveis em Java. Ela foi introduzida no Java 14 como uma prévia e se tornou uma funcionalidade oficial no Java 16. 
// As classes record são projetadas para representar dados de forma simples, sem a necessidade de escrever código boilerplate, como getters, setters, equals, hashCode e toString.
public record CarroStatus(String mensagem) {

}
