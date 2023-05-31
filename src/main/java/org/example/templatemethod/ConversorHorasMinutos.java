package org.example.templatemethod;

public class ConversorHorasMinutos extends ConversorUnidades {
    public String verificarConversao() {
        if (this.calcularConversaoMinutos() > 0.0f) {
            return "Conversão feita com sucesso!";
        }
        else {
            return "Não foi possível realizar a conversão";
        }
    }

    public String getTipo() {
        return "ConversorMinutos";
    }
}
