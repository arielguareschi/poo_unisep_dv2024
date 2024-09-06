package br.edu.unisep.despesas.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lancamento {
    private int id;
    private String observacao;
    private Double valor;
    private Calendar data;
    private Categoria categoria;
    private Empresa empresa;
    private Tipo tipo;

    public Lancamento() {
    }

    public Lancamento(int id, String observacao, Double valor, Calendar data, Categoria categoria, Empresa empresa, Tipo tipo) {
        this.id = id;
        this.observacao = observacao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
        this.empresa = empresa;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        // 22:04:22 23/08/2024
        return "Lancamento \n" +
                "Id: " + id + "\n" +
                "Observação: " + observacao + "\n" +
                "Valor: R$" + valor + "\n" +
                "Data: " + sdf.format(data.getTime()) + "\n" +
                "Tipo: " + tipo + "\n" +
                "Categoria: " + categoria + "\n" +
                "Empresa: " + empresa;
    }
}
