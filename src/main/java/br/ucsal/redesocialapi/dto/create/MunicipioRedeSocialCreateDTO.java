package br.ucsal.redesocialapi.dto.create;

import br.ucsal.redesocialapi.entities.Municipio;
import br.ucsal.redesocialapi.entities.RedeSocial;

import java.util.UUID;

public record MunicipioRedeSocialCreateDTO(Municipio municipio, RedeSocial redeSocial, String url) {
}
