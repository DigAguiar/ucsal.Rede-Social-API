package br.ucsal.redesocialapi.dto.detail;

import br.ucsal.redesocialapi.entities.Municipio;

import java.util.UUID;

public record MunicipioDetailDTO(UUID id, String nome) {

    public MunicipioDetailDTO(Municipio municipio) {
        this(municipio.getId(),municipio.getNome());
    }

}
