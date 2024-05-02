package br.ucsal.redesocialapi.dto.detail;

import br.ucsal.redesocialapi.entities.Municipio;
import br.ucsal.redesocialapi.entities.RedeSocial;

import java.util.UUID;

public record MunicipioRedeSocialDetailDTO
        (UUID id,
         Municipio municipio,
         RedeSocial redeSocial,
         String url
        ) {
}
