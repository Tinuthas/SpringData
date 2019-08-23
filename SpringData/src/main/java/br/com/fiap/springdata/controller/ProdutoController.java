package br.com.fiap.springdata.controller;

import br.com.fiap.springdata.entity.Produto;
import br.com.fiap.springdata.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/produto/cadastrar")
    public String exibirHome(){
        return "produto/home";
    }

    @PostMapping("/produto/cadastrar")
    public String cadastrar(Produto produto, Model model){
        repository.save(produto);
        model.addAttribute("prod",produto);
        System.out.println(produto.getNome() + " " + produto.getPreco());
        return "produto/sucesso";
    }

    @GetMapping("/produto/buscar")
    public String exibirBusca(){
        return "produto/produto-buscar";
    }

    @PostMapping("/produto/buscar")
    public String cadastrar(Integer id, Model model){
        Optional<Produto> produto = repository.findById(id);
        Produto p = new Produto();
        if(produto.isPresent())
            p = produto.get();
        model.addAttribute("prod", p);
        System.out.println(p.getNome() + " " + p.getPreco());
        return "produto/produto-buscar";
    }


}
