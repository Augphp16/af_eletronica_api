package br.com.api.af_eletronica_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "diagnostico")
@Getter
@Setter
public class Diagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String diagnostico;

    private String dataDiagnostico;

    private String procedimento;

    private String dataProcedimento;

    private String orcamento;

}
