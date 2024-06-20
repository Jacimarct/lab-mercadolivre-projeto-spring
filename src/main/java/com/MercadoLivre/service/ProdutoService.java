package com.MercadoLivre.service;

import com.MercadoLivre.model.Produto;

import java.util.List;

public interface ProdutoService {
    List<Produto> listarTodos();
    Produto buscarPorId(Long id);
    Produto criar(Produto produto);
    Produto atualizar(Long id, Produto produto);
    void deletar(Long id);
}
