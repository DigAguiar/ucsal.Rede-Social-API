package br.ucsal.redesocialapi.dto.list;

import br.ucsal.redesocialapi.entities.Municipio;
import br.ucsal.redesocialapi.entities.MunicipioRedeSocial;

import java.util.List;
import java.util.UUID;

public record MunicipioListDTO(UUID id, String nome, List<MunicipioRedeSocial> municipioRedeSocials) {

    public MunicipioListDTO(Municipio municipio){
        this(municipio.getId(), municipio.getNome(),municipio.getMunicipioRedeSocials());
    }

}
