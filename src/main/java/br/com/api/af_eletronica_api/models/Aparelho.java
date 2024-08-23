package br.com.api.af_eletronica_api.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "aparelhos")
@Getter
@Setter
public class Aparelho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String aparelho;

    private String sintomas;

    private String dataEntrada;

    private String dataSaida;

    @OneToMany
    @JoinColumn(name = "codigo_aparelho")
    private List<Diagnostico> diagnosticos;

}
