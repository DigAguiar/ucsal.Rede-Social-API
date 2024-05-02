package br.ucsal.redesocialapi.repositories;

import br.ucsal.redesocialapi.entities.MunicipioRedeSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MunicipioRedeSocialRepository extends JpaRepository<MunicipioRedeSocial, UUID> {
}
