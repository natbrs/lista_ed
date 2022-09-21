/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_simples;

/**
 *
 * @author Natan
 */

public class Lista {
     No head = null;
     Integer tam = 0;
     No tail = null;
    
    public void add(No no){
        if (tam == 0){
            tail = no;
            head = no;
        }else{
            no.setProx(head);
            head = no;
        }
        tam++;
    }
    
    public void addElemento(No no){
        if(tam == 0){
            head.setProx(no);
        }else{
        tail.setProx(no);
        tail = no;  
        } 
        tam++;
    }

    private boolean posOcupada(int pos){
        return pos >= 0 && pos < tam;
    }
    
    private No pegaPos(int pos){
        if(!this.posOcupada(pos)){
            throw new IllegalArgumentException("Posição não reconhecida!");
        }
        No atual = head;
        for(int i = 0; i < pos-1; i++){
            atual = atual.getProx();
        }return atual;
    }
    
    public void remHead(){
        if(!this.posOcupada(0)){
            throw new IllegalArgumentException("Posição não reconhecida!");
        }
        head = head.getProx();
        tam--;
        if(this.tam ==0){
            this.tail = null;
        }
    }
    
    public String toString(){
        if(tam == 0){
          return "[]";  
        }
        StringBuilder builder = new StringBuilder("[");
        No atual = head;
        for(int i = 1; i < tam; i++){
            builder.append(atual.getValor());
            builder.append(", ");
            atual = atual.getProx();
        }
        builder.append(atual.getValor());
        builder.append("]");
        return builder.toString();
    }
    
    public boolean Have(String valor){
        if(valor.equalsIgnoreCase("Natan")){
            return true;
        }else {
	    return false;
        }
    }
    
    
 
    //public void Rem(Integer pos) {
    //    for (int i=1; i < pos-1; i++){
    //	    pos = pos.getProx();
    //	}
    //       pos.setProx(pos.getProx().getProx());
    //}
    
    //public void tailRem() {
    //    if(!this.Occupied(0)) {
    //        throw new IllegalArgumentException("Position does not exist");
    //    }
    //    tail = tail.getPrev();
    //    tam--;
    //    if(this.tam == 0) {
    //	    this.head=null;
    //    }
    //}

    public static void main(String[] args) throws Exception{
        Lista lista = new Lista();
        
        //lista.add();
        //lista.add();
        //lista.add();
        //lista.add();
        
        lista.toString();
        
        
    }
}

