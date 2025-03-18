package org.example;
public Class Alfabeto (char c) {
    
    bollean isAlfabeto return True{
        return  c >= 'a' && c <= 'z';
    }
}
public class G_Pilha <T> {
    private static final int Tam_Default = 100;
    private int topoPilha;
    private T e[];
    //T is the name of generic type

    //construtor1
    public G_Pilha(int tamanho){
        this.e = (T[]) new Object[tamanho];
        this.topoPilha = -1;
    }

    public G_Pilha(){
        this(Tam_Default);
    }

    public boolean isEmpty(){
        if(this.topoPilha == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(this.topoPilha+1 == this.e.length){
            return true;
        }
        else{
            return false;
        }
    }

    public T pop() throws Exception{
        if ( ! this.isEmpty()){
            //se não for vazia
            return this.e[this.topoPilha--];
        }
        else{
            throw new Exception("Underflow -Esvaziamento de Pilha");
        }
    }

    public void push(T e) throws Exception{
        if ( ! this.isFull()){
            //se não for cheio
            this.e[++this.topoPilha] = e;
        }
        else{
            throw new Exception ("overflow -EStouro de Pilha");
        }
    }

    public T topo() throws Exception{
        if ( ! this.isFull()){
            return this.e[this.topoPilha];
        }
        else{
            throw new Exception("Underflow -esvaziamento de Pilha");
        }
    }

    public int sizeElements(){
        return this.topoPilha+1;
    }
}
