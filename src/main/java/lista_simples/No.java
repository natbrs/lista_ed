/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_simples;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class No {
    private String valor;
    private No prox;
    private No tail;
    private No prev;
    
    public String getValor(){
        return valor;
    }
    
    public void setValor(String valor){
        this.valor = valor;
    }
    
    public No getProx(){
        return prox;
    }
    
    public void setProx(No prox){
        this.prox = prox;
    }
    
    public No getTail(){
        return tail;
    }
    
    public void setTail(No tail){
        this.tail = tail;
    }
     
    public No getPrev(){
        return tail;
    }
    
    public void setPrev(No prev){
        this.prev = prev;
    }
}
