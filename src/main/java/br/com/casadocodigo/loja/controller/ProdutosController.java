package br.com.casadocodigo.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.controller.model.Produto;
import br.com.casadocodigo.loja.dao.ProdutoDAO;

@Controller
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDao;
	
	@RequestMapping("/produtos/form")
	public String form() {
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
		System.out.println(produto);
		produtoDao.gravar(produto);
		return "produtos/ok";
	}
}
