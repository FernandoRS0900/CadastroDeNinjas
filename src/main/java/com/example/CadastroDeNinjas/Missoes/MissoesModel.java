package com.example.CadastroDeNinjas.Missoes;


import com.example.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;
    private String dificuldade;

    //@OneToMany uma missao pode ter varios ninjas
    @OneToMany (mappedBy = "missoes")

    private List<NinjaModel> ninjas;

}
