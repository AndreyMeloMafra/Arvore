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
public class No<T extends Comparable<T>> {

    private T valor;
    private No<T> esq;
    private No<T> dir;

    public No(T valor) {
        this.valor = valor;
        this.esq = null;
        this.dir = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getEsq() {
        return esq;
    }

    public void setEsq(No<T> esq) {
        this.esq = esq;
    }

    public No<T> getDir() {
        return dir;
    }

    public void setDir(No<T> dir) {
        this.dir = dir;
    }

    public int compareTo(T valor) {
        return this.valor.compareTo(valor);
    }

    @Override
    public String toString() {
        return valor.toString();
    }

}
