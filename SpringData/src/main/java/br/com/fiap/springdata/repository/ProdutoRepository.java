package br.com.fiap.springdata.repository;

import br.com.fiap.springdata.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
