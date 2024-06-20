package com.MercadoLivre.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@Service
public class MercadoLivreService {

    private final RestTemplate restTemplate;

    public MercadoLivreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String buscarProdutos(String query, String category, String ordenar, int limit) {
        String url = String.format(
            "https://api.mercadolibre.com/sites/MLB/search?q=%s&category=%s&sort=%s&limit=%d",
            query, category, ordenar, limit
        );
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}
