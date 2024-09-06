package br.edu.unisep.despesas.view;

import br.edu.unisep.despesas.model.Categoria;
import br.edu.unisep.despesas.model.Empresa;
import br.edu.unisep.despesas.model.Lancamento;
import br.edu.unisep.despesas.model.Tipo;

import javax.swing.*;
import java.util.Calendar;

public class Principal {

    public static void main(String[] args) {
        // neste momento vai ocorrer a
        // transformacao -> a lagarta vira brabuleta
        // Classe -> Objeto
        Categoria lanche = new Categoria();
        lanche.setId(1);
        lanche.setDescricao("Lanches");

        Tipo gasto = new Tipo();
        gasto.setId(1);
        gasto.setDescricao("Gastos Mensais");
        gasto.setTipo("S");

        Empresa chapao = new Empresa();
        chapao.setId(1);
        chapao.setNome("Chapao Fods");
        chapao.setCnpj("12.345.678/0002-10");
        chapao.setTelefone("(46) 3333-5421");
        chapao.setEndereco("Dois Vizinhos");

        Lancamento batata = new Lancamento();
        batata.setId(1);
        batata.setObservacao("Porcao de batata");
        batata.setValor(35.00);
        batata.setData(Calendar.getInstance());
        batata.setTipo(gasto);
        batata.setEmpresa(chapao);
        batata.setCategoria(lanche);

        System.out.println(batata);
        JOptionPane.showMessageDialog(
                null, batata);
    }

}
