package br.ucsal.redesocialapi.controllers;

import br.ucsal.redesocialapi.dto.list.MunicipioListDTO;
import br.ucsal.redesocialapi.service.MunicipioService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RSAPI")
public class MunicipioController {

    private final MunicipioService municipioService;

    public MunicipioController(MunicipioService municipioService) {
        this.municipioService = municipioService;
    }

    @GetMapping("/")
    public ResponseEntity<Page<MunicipioListDTO>> findAllMunicipios () {
        Pageable page = PageRequest.of(0,10);
        var result = municipioService.findAll(page);

        return ResponseEntity.ok(result);

    }



}
