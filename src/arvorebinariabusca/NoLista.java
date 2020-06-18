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
public class NoLista<T> {

    private T valor;
    private NoLista prox;

    public NoLista(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NoLista getProx() {
        return prox;
    }

    public void setProx(NoLista<T> prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return this.valor.toString();
    }

    @Override
    public NoLista<T> clone() {
        NoLista<T> novo = new NoLista<>(valor);
        return novo;
    }
}
