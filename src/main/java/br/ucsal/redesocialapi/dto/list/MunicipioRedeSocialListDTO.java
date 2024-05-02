package br.ucsal.redesocialapi.dto.list;

import br.ucsal.redesocialapi.entities.Municipio;
import br.ucsal.redesocialapi.entities.RedeSocial;

import java.util.UUID;

public record MunicipioRedeSocialListDTO
        (UUID id,
         Municipio municipio,
         RedeSocial redeSocial,
         String url
        ) {
}
