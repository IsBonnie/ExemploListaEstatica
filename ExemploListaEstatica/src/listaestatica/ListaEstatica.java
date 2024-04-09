package listaestatica;

public class ListaEstatica {
    
    private double[] vetor;
    private int n; //contador de tamanho
    
    public ListaEstatica(){
        this.vetor = new double[1000]; //metodo construtor
        this.n = 0;       // no max 1000 posições
}
    /*public ListaEstatica(int tamanho){
        this.vetor = new double[tamanho]; //metodo construtor       problema: o tamanho pode não ser bom, ocupando 10 vagas de 900 vagas
        this.n = 0;
    } */
    public void insereN(double valor){ //inserção
        if(n >= this.vetor.length){     //aqui para colocar outro vetor com tamanho melhor
            dobraVetor();
        }
        this.vetor[n] = valor;      //insere sempre no final
        this.n++;
    }
    
    public void insereNo(double valor, int pos){
        for(int i = this.n; i > pos; i--){  //elementos dar um passo pra tras
            this.vetor[i] = this.vetor[i-1];  //inserir em qualquer posição (o ultimo cara da fila dar um passo pra tras)
        }
        this.vetor[pos] = valor;
        this.n++;
        
    }
    public boolean validaPos(int pos){  
        if((pos < 0) || (pos> n)){
        return false;
    }else{
        return true;
        }
    }
    
      public boolean insere(double valor, int pos){     ////posição negativa ou numero maior que da lista não aceita
      if(!validaPos(pos)){
          return false;
      }
        if(n >= this.vetor.length){dobraVetor();}
        
        insereNo(valor, pos);
          return true;
      
      }
      
      private void removeNo(){
          this.n--;             //deleta o ultimo da lista
      } 
      
      private void removeNo(int pos){
          for(int i = pos; i < this.n; i++){    //selecinar um cara, o de tras dele da um passo pra frente e o resto de tras tbm
              this.vetor[i] = this.vetor[i + 1];
          }
      }
      public boolean vazia(){
          return (n == 0); //saber se a lista está vazia, retorna verdadeiro ou falso ==
      }
      
      public boolean remove(){
          if(!vazia()){
              removeNo();
              return true;
          }else
              return false;
      }
      public boolean remove(int pos){
          if(validaPos(pos)){
              removeNo(pos);
              return true;
          }else
              return false;
      }
      
      public Double le(int pos){
          if (validaPos(pos)){
              return this.vetor[pos];
          }else{
              return null;
          }
      }
      
      public Integer busca(double valor){
          int aux = 0;
          
          while(aux < this.n){
              if(this.vetor[aux] == valor){
                  return aux;
              }
              aux++;
          }
          return null;
      }
      
      private void dobraVetor(){    //vai trocar o estacionamento para um mais apropriado em questão de tamanho
          double[] temporario = new double[this.vetor.length];  //criando o novo
          
          for(int i = 0; i < this.vetor.length; i++){   //se ele for menor 
              temporario[i] = this.vetor[i];
              
          }
          this.vetor = null;                            //faz uma copia, destroe a original e cria um vetor maior(o dobro)
          this.vetor = new double[2*temporario.length];
          
          for(int i = 0; i < this.vetor.length; i++){
              this.vetor[i] = temporario[i];
              
          }
      }
      
    public void imprime(){
        for(int i = 0; i < this.n; i++){
        System.out.println(this.vetor[i] + " ");
        }
        System.out.println("");
    }
   
    
}
