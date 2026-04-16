package com.example.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    //GET -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missoes listadas com sucesso";
    }

    //POST -- mandar uma requisição para criar missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso";
    }


    //PUT -- mandar uma requisição para alterar as missoes
    @PutMapping ("/alterar")
    public String alterarMissao(){
        return "Missao alterada";
    }

    //DELETE -- requisição para deletar uma missao
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }

}
