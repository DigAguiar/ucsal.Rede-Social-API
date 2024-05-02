package br.ucsal.redesocialapi.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "rede_social")
public class RedeSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rede_social", nullable = false)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @OneToMany(mappedBy = "redeSocial")
    private List<MunicipioRedeSocial> municipioRedeSocials;

    public RedeSocial() {

    }

    public RedeSocial(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    private List<MunicipioRedeSocial> getMunicipioRedeSocials() {
        return municipioRedeSocials;
    }

    public void setMunicipioRedeSocials(List<MunicipioRedeSocial> municipioRedeSocials) {
        this.municipioRedeSocials = municipioRedeSocials;
    }
}
