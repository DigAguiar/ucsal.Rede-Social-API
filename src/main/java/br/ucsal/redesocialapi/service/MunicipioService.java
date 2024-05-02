package br.ucsal.redesocialapi.service;

import br.ucsal.redesocialapi.dto.create.MunicipioCreateDTO;
import br.ucsal.redesocialapi.dto.detail.MunicipioDetailDTO;
import br.ucsal.redesocialapi.dto.edit.MunicipioEditDTO;
import br.ucsal.redesocialapi.dto.list.MunicipioListDTO;
import br.ucsal.redesocialapi.entities.Municipio;
import br.ucsal.redesocialapi.entities.MunicipioRedeSocial;
import br.ucsal.redesocialapi.repositories.MunicipioRepository;
import br.ucsal.redesocialapi.repositories.RedeSocialRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
public class MunicipioService {

    private final MunicipioRepository municipioRepository;
    private final RedeSocialRepository redeSocialRepository;

    public MunicipioService(MunicipioRepository municipioRepository, RedeSocialRepository redeSocialRepository) {
        this.municipioRepository = municipioRepository;
        this.redeSocialRepository = redeSocialRepository;
    }

    @Transactional(readOnly = true)
    public Optional<MunicipioDetailDTO> findById(final UUID id) {
        var municipio = municipioRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Não foi possível achar o município. ")
        );

        return Optional.of(new MunicipioDetailDTO(municipio));
    }

    @Transactional(readOnly = true)
    public Page<MunicipioListDTO> findAll(Pageable pageable) {
        return municipioRepository.findAll(pageable)
                .map(MunicipioListDTO::new);
    }

    @Transactional
    public MunicipioDetailDTO create(MunicipioCreateDTO municipioCreateDTO) {
        var createdMunicipio = municipioRepository.save(new Municipio(municipioCreateDTO.nome()));
        return new MunicipioDetailDTO(createdMunicipio);
    }

    @Transactional
    public MunicipioDetailDTO update(MunicipioEditDTO municipioEditDTO) {
        var municipio = municipioRepository.findById(municipioEditDTO.id()).orElseThrow(
                () -> new EntityNotFoundException("Não foi possível achar o município. ")
        );
        municipio.setNome(municipioEditDTO.nome());
        return new MunicipioDetailDTO(municipio);
    }

    @Transactional
    public void delete(UUID id) {
        var municipio = municipioRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Não foi possível achar o município.")
        );
        municipioRepository.deleteById(municipio.getId());
    }

    @Transactional
    public void addNewUrl(UUID id, String url, Long id_redeSocial) {
        var municipio = municipioRepository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("Não foi possivel achar o municipio")
        );
        var redeSocial = redeSocialRepository.findById(id_redeSocial).orElseThrow(()
                -> new EntityNotFoundException("Não foi possivel achar a rede social")
        );

        municipio.getMunicipioRedeSocials().add(new MunicipioRedeSocial(municipio,redeSocial,url));

    }


}


