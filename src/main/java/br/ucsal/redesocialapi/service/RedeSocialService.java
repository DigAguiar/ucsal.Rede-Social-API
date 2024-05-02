package br.ucsal.redesocialapi.service;

import br.ucsal.redesocialapi.repositories.RedeSocialRepository;
import org.springframework.stereotype.Service;

@Service
public class RedeSocialService {

    private final RedeSocialRepository redeSocialRepository;

    public RedeSocialService(RedeSocialRepository redeSocialRepository) {
        this.redeSocialRepository = redeSocialRepository;
    }


}
