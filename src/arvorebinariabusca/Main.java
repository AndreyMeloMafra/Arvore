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
public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Jorge", "1", "3", 1500, 20);
        Funcionario f2 = new Funcionario("Claudio", "11", "2", 1500, 30);
        Funcionario f3 = new Funcionario("bbb", "1111", "5", 1500, 50);
        Funcionario f4 = new Funcionario("F", "1111", "8", 1500, 50);

        No n1 = new No(f1);

        ArvoreBinariaBusca tree = new ArvoreBinariaBusca(n1);
        tree.adicionar(f1);
        tree.adicionar(f2);
        tree.adicionar(f3);
        tree.adicionar(f4);
        ListaSimplesmenteLigada list = tree.getEmOrdem();
        NoLista aux = list.getInicio();
        No treeNode = tree.getRaiz();
        for (int i = 0; i < list.tam(); i++) {
            System.out.println(aux);
            aux = aux.getProx();
        }

    }
}
