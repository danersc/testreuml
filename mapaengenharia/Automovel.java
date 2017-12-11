/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaengenharia;

/**
 *
 * @author danerdosreis
 */
public class Automovel {
    
    private String placa;
    private String cor;
    private String ano;
    private String tipoCombustivel;
    private int numeroPortas;
    private double quilometragem;
    private String renavam;
    private String chassi;
    private double valorLocacao;
    private Modelo modelo;
    private boolean estaLocado;
    
    public void incluir(){
        
    }
    
    public void excluir(){
        
    }
        
    public void editar(){
        
    }
    
    public boolean statusCarro(){
        return estaLocado;
    }
    
    public void setEstaLocado(boolean status){
        this.estaLocado = status;
    }
    
}
