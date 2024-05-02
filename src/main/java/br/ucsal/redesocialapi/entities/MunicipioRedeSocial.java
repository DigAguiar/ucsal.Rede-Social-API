package br.ucsal.redesocialapi.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "municipio_rede_social")
public class MunicipioRedeSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_municipio_rede_social")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "municipio_id")
    private Municipio municipio;
    @ManyToOne
    @JoinColumn(name = "rede_social_id")
    private RedeSocial redeSocial;
    @Column(name = "url")
    private String url;


    public MunicipioRedeSocial() {

    }

    public MunicipioRedeSocial(Municipio municipio, RedeSocial redeSocial, String url) {
        this.municipio = municipio;
        this.redeSocial = redeSocial;
        this.url = url;
    }

    public UUID getId() {
        return id;
    }

    private Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public RedeSocial getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(RedeSocial redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
