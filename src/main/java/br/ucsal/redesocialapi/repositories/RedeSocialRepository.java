package br.ucsal.redesocialapi.repositories;

import br.ucsal.redesocialapi.entities.RedeSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedeSocialRepository extends JpaRepository<RedeSocial,Long> {
}
