package com.example.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping

public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem essa rota";
    }

    //adicionar ninjas (create)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }
    //mostrar todos os ninjas (read)
    @GetMapping("/todos")
        public String mostraTodosOsNinjas(){
            return "Ninja criado";
        }

    //mostrar ninja por ID (read)
    @GetMapping("/todosID")
    public String mostraTodosOsNinjasPorID(){
        return "Mostrar ninja por ID";
    }


    //alterar dados dos ninjas (update)
    @PutMapping("/alterar")
    public String alterarNinjaPorID(){
        return "ALterar ninja por ID";
    }

    //deletar ninjas (delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninja deletado por ID";
    }






}
