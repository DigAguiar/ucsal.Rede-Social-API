package br.ucsal.redesocialapi.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "municipio")
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_municipio", nullable = false)
    private UUID id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @OneToMany(mappedBy = "municipio")
    private List<MunicipioRedeSocial> municipioRedeSocials;

    public Municipio() {

    }

    public Municipio(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<MunicipioRedeSocial> getMunicipioRedeSocials() {
        return municipioRedeSocials;
    }

    public void setMunicipioRedeSocials(List<MunicipioRedeSocial> municipioRedeSocials) {
        this.municipioRedeSocials = municipioRedeSocials;
    }
}
