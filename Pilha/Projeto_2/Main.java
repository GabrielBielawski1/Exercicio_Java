// 1. TODO PROGRAMA JAVA É UMA CLASSE
//  public class XXXX {
//      ......
//  }
// 2. Você deve gravar o nome do programa como XXXX.JAVA

// 3. O seu programa java conterá:
//  variaveis (ATRIBUTOS)
//  funções (METODOS)

public class Pilha
{
//Atributos - "variaveis da classe"
int dados[] = new dados[10]; //conteudo da pilha
int topo; // posição do ultimo elemento da pilha
int capacidade; // qtos elementos a pilha pode ter 


//Métodos - Operações que podemos fazer com a classe
void empilha(int valor){
    topo++;
    dados[topo] = valor;
    }

int desempilha(){
    topo--;
    return dados[topo + 1];
    }
void imprime (){
    for(int i=0; i <= topo; i++){
         System.out.println(dados[i]);
        }
    }
}
