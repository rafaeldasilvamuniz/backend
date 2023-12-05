package br.com.rpires.reflections.anotacao.cadastro.domain;

import br.com.rpires.reflections.anotacao.cadastro.anotacao.TipoChave;

/**
 * @author rodrigo.pires
 *
 * Classe que representa os dados de produto
 */
public class Produto implements Persistente{

    @TipoChave("getCodigo")
    private Long codigo;

    private String nome;

    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                "endereco=" + endereco + '\''
                '}';
    }
}
