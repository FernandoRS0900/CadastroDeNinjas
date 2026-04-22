package com.example.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas")

public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
        public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //mostrar ninja por ID (read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNInjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
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
