package org.example.templatemethod;

public abstract class ConversorUnidades {

    protected String nome;
    private float valor1;
    private float valor2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float calcularConversaoMilhas() {
        return this.valor1 * this.valor2;
    }

    public float calcularConversaoMinutos() {
        return this.valor1 * 60;
    }

    public abstract String verificarConversao();

    public String getTipo() {
        return "Conversor";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarConversao() +
                '}';
    }
}
