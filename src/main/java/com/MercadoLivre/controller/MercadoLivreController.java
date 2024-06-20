package com.MercadoLivre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MercadoLivre.service.MercadoLivreService;

@RestController
@RequestMapping("/mercadolivre")
public class MercadoLivreController {

    private final MercadoLivreService mercadoLivreService;

    public MercadoLivreController(MercadoLivreService mercadoLivreService) {
        this.mercadoLivreService = mercadoLivreService;
    }

    @GetMapping("/produtos")
    public String buscarProdutos(
        @RequestParam String query,
        @RequestParam(required = false) String category,
        @RequestParam(required = false) String ordenar,
        @RequestParam(defaultValue = "20") int limit
    ) {
        return mercadoLivreService.buscarProdutos(query, category, ordenar, limit);
    }
}
