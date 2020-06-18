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
public class ArvoreBinariaBusca<T extends Comparable<T>> {

    private No<T> raiz;
    ListaSimplesmenteLigada getPreOrdem;

    public ArvoreBinariaBusca(No<T> raiz) {
        this.raiz = raiz;
    }

    public void adicionar(T valor) {
        this.raiz = adicionarP(this.raiz, valor);
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }

    public No<T> adicionarP(No<T> raiz, T valor) {
        if (raiz == null) {
            return new No<T>(valor);
        }

        int temp = raiz.compareTo(valor);
        if (temp > 0) {
            raiz.setEsq((adicionarP(raiz.getEsq(), valor)));
        } else if (temp < 0) {
            raiz.setDir((adicionarP(raiz.getDir(), valor)));
        } else {
            raiz.setValor(valor);
        }

        return raiz;
    }

    public ListaSimplesmenteLigada<T> getPreOrdem() {
        ListaSimplesmenteLigada list = new ListaSimplesmenteLigada();
        No<T> inicial = this.raiz;
        No<T> aux = inicial;

        //Esquerda
        while (aux != null) {
            list.addFim(aux.getValor());

            aux = aux.getEsq();
        }

        aux = inicial.getDir();

        //Direita
        while (aux != null) {
            list.addFim(aux);
            aux = aux.getDir();
        }

        return list;
    }

    public ListaSimplesmenteLigada<T> getPosOrdem() {
        ListaSimplesmenteLigada list = new ListaSimplesmenteLigada();
        No<T> inicial = this.raiz;
        No<T> aux = inicial.getEsq();

        //Esquerda
        while (aux != null) {
            list.addFim(aux.getValor());

            aux = aux.getEsq();
        }

        aux = inicial.getDir();

        //Direita
        while (aux != null) {
            list.addFim(aux);
            aux = aux.getDir();
        }

        list.addFim(inicial);
        return list;
    }

    public ListaSimplesmenteLigada<T> getEmOrdem() {
        ListaSimplesmenteLigada list = new ListaSimplesmenteLigada();
        No<T> inicial = this.raiz;
        No<T> aux = inicial.getEsq();

        //Esquerda
        while (aux != null) {
            list.addFim(aux.getValor());

            aux = aux.getEsq();
        }

        aux = inicial.getDir();
        list.addFim(inicial);

        //Direita
        while (aux != null) {
            list.addFim(aux);
            aux = aux.getDir();
        }

        return list;
    }

    public T localizar(T valor) {
        return localizarP(raiz, valor);
    }

    private T localizarP(No<T> raiz, T valor) {
        if (raiz == null) {
            return null;
        }

        int temp = raiz.compareTo(valor);

        if (temp > 0) {
            return localizarP(raiz.getEsq(), valor);
        } else if (temp < 0) {
            return localizarP(raiz.getDir(), valor);
        } else {
            return raiz.getValor();
        }

    }

//    private ListaSimplesmenteLigada<T> getPosOrdem() {
//        ListaSimplesmenteLigada list = new ListaSimplesmenteLigada();
//        No<T> inicial = this.raiz;
//        No<T> aux = inicial;
//
//        //Esquerda
//        while (aux != null) {
//            list.addFim(aux.getValor());
//
//            aux = aux.getEsq();
//        }
//
//        aux = inicial.getDir();
//
//        while (aux != null) {
//            list.addFim(aux);
//            aux = aux.getDir();
//        }
//
//        return list;
//    }
}
