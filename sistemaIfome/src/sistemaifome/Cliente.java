/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaifome;

/**
 *
 * @author vitor
 */
public class Cliente {
    private String nome;
    private String rua;
    private String complemento;
    private int telefone;
    private int cep;
    private int numero; 

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}
