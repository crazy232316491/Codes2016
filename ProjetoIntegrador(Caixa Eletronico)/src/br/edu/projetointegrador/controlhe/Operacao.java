/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.controlhe;

import br.edu.projetointegrador.ferramenta.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CrasyFox
 */
public class Operacao extends Statement {

    private int cdOpercao;
    private ContaCliente contaFavorecida = new ContaCliente();
    private ContaCliente conta = new ContaCliente();
    private TipoOperacao tipoOperacao = new TipoOperacao();
    private Agencia agencia = new Agencia();
    private String dtOperacao;
    private String hrOperacao;
    private double vlOperacao;
    
    public void cadastrar() {
        super.registrar("OPERACAO", new Object[]{
            super.autoIncrem("OPERACAO", "CD_OPERACAO"),
            getContaFavorecida().getCdConta(),
            getConta().getCdConta(),
            tipoOperacao.getCdTipoOperacao(),
            agencia.getBanco().getCdBanco(),
            agencia.getCdAgencia(),
            "22/03/2015",
            "06/05/16 01:33:03,000000000",
            getVlOperacao(),
        }
        );
    }

    public int getCdOpercao() {
        return cdOpercao;
    }

    public void setCdOpercao(int cdOpercao) {
        this.cdOpercao = cdOpercao;
    }

    public ContaCliente getContaFavorecida() {
        return contaFavorecida;
    }

    public void setContaFavorecida(ContaCliente contaFavorecida) {
        this.contaFavorecida = contaFavorecida;
    }

    public ContaCliente getConta() {
        return conta;
    }

    public void setConta(ContaCliente conta) {
        this.conta = conta;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getDtOperacao() {
        return dtOperacao;
    }

    public void setDtOperacao(String dtOperacao) {
        this.dtOperacao = dtOperacao;
    }

    public String getHrOperacao() {
        return hrOperacao;
    }

    public void setHrOperacao(String hrOperacao) {
        this.hrOperacao = hrOperacao;
    }

    public double getVlOperacao() {
        return vlOperacao;
    }

    public void setVlOperacao(double vlOperacao) {
        this.vlOperacao = vlOperacao;
    }

}
