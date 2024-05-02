package br.ucsal.redesocialapi.dto.edit;


import br.ucsal.redesocialapi.entities.Municipio;

import java.util.UUID;

public record MunicipioEditDTO(UUID id, String nome) {

    public MunicipioEditDTO(Municipio municipio){
        this(municipio.getId(), municipio.getNome());
    }
}
