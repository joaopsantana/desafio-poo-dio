package br.com.dio.desafio.dominio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@EqualsAndHashCode
public class Bootcamp {
    @Getter @Setter private String nome;
    @Getter @Setter private String descricao;
    @Getter private final LocalDate dataInicial = LocalDate.now(); //final - sem set
    @Getter private final LocalDate dataFinal = dataInicial.plusDays(45); //final - sem set
    @Getter @Setter private Set<Dev> devsInscritos = new HashSet<>();
    @Getter @Setter private Set<Conteudo> conteudos = new LinkedHashSet<>();
}
