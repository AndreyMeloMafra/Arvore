/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinariabusca;

/**
 *
 * @author Acer
 */
public class ListaSimplesmenteLigada<T> {

    private NoLista<T> inicio;
    private NoLista<T> fim;
    private int tam;

    public ListaSimplesmenteLigada() {
        this.inicio = null;
        this.fim = null;
        tam = 0;
    }

    public NoLista<T> getInicio() {
        return inicio;
    }

    public NoLista<T> getFim() {
        return fim;
    }

    //Add functions
    public void addInicio(T data) {
        NoLista<T> no = new NoLista<>(data);
        no.setProx(inicio);
        inicio = no;

        if (fim == null) {
            fim = no;
        }

        tam++;
    }

    public void addFim(T data) {
        NoLista<T> no = new NoLista<>(data);
        if (inicio == null) {
            inicio = no;
        } else {
            fim.setProx(no);
        }
        fim = no;
        tam++;
    }

    public void addPos(T data, int pos) {
        NoLista<T> no = new NoLista<>(data);
        try {
            if (pos < 0 || pos > this.tam) {
                System.out.print("Posição inválida");
            }

            if (pos == 0) {
                no.setProx(this.inicio);
                inicio = no;
            } else {
                NoLista<T> iterador = inicio;
                for (int i = 0; i < (pos - 1); i++) {
                    iterador = iterador.getProx();
                }
                no.setProx(iterador.getProx());
                iterador.setProx(no);
            }
            tam++;
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    //Remove function
    public void remover(NoLista<T> no) {
        int pos = search(no);
        NoLista<T> anterior = elementoEm(pos - 1);
        NoLista<T> proximo = elementoEm(pos + 1);
        anterior.setProx(proximo);
    }

    //Search function
    public int search(NoLista<T> data) {
        NoLista<T> aux = this.inicio;
        int count = 0;

        while (aux.getProx() != null) {
            if (data.equals(aux)) {
                return count;
            }
            aux = aux.getProx();
            count++;
        }

        return -1;
    }

    public int tam() {
        return this.tam;
    }

    public NoLista<T> elementoEm(int i) {
        boolean next = true;
        int count = 0;
        NoLista<T> aux = this.inicio;

        while (next) {
            if (count < i) {
                if (aux.getProx() != null) {
                    count++;
                    aux = aux.getProx();
                } else {
                    next = false;
                }
            } else if (count == i) {
                return aux;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> aux = this.inicio;
        
        while(aux != null) {
            sb.append(aux);
        }

        return sb.toString();
    }
}
