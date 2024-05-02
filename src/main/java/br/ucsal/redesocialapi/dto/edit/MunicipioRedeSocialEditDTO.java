package br.ucsal.redesocialapi.dto.edit;

import br.ucsal.redesocialapi.entities.Municipio;
import br.ucsal.redesocialapi.entities.RedeSocial;

import java.util.UUID;

public record MunicipioRedeSocialEditDTO(UUID id, Municipio municipio, RedeSocial redeSocial, String url) {
}
