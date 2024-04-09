package ex;

import listaestatica.ListaEstatica;

public class ExListaEstatica {
    public static void main(String[] args) {
        ListaEstatica le = new ListaEstatica();
        
        le.insereN(56);
        le.insereN(45);
        le.insereN(77);
        le.insereN(07);
        le.insereN(58);
        le.insere(5, 0);
      
        le.insere(1000, 2);
        le.imprime();
        // Lista estática -> algo continuo, sem espaços vazios
        System.out.println("--------------------");
        
        le.remove(0); // ainda está em algum lugar da memória(mas não na nossa "visão")
        le.remove(1);
        le.imprime();
        System.out.println(le.le(2));
        System.out.println(le.busca(56));
       
        
        
        
    }
    
}
