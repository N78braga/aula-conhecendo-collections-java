package organizacao_de_pessoas.teste;

import organizacao_de_pessoas.organizacao.OrdenacaoPessoas;

import java.util.Locale;

public class OrdenacaoPessoasTeste {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adionarPessoas("Nome 1", 20, 1.50);
        ordenacaoPessoas.adionarPessoas("Nome 2", 30, 1.80);
        ordenacaoPessoas.adionarPessoas("Nome 3", 25, 1.70);
        ordenacaoPessoas.adionarPessoas("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}
