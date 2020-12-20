package sistema_de_estoque.builder;

import sistema_de_estoque.modelo.Solicitante;

public class SolicitanteBuilder {
    private Solicitante solicitante;

    private SolicitanteBuilder() {
    }

    public static SolicitanteBuilder umSolicitante() {
        SolicitanteBuilder builder = new SolicitanteBuilder();

        builder.solicitante = new Solicitante();

        builder.solicitante.setNome("Patrick Viegas");
        builder.solicitante.setCpf("99999999999");
        builder.solicitante.setTelefone("9899999999");
        return builder;
    }

    public SolicitanteBuilder comNome(String nome) {
        this.solicitante.setNome(nome);
        return this;
    }

    public SolicitanteBuilder comCpf(String cpf) {
        this.solicitante.setCpf(cpf);
        return this;
    }

    public SolicitanteBuilder comTelefone(String telefone) {
        this.solicitante.setTelefone(telefone);
        return this;
    }

    public Solicitante constroi() {
        return this.solicitante;
    }
}