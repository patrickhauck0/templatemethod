package org.example.templatemethod;

public class ConversorQuilometrosMilhas extends ConversorUnidades {
    public String verificarConversao() {
        if (this.calcularConversaoMilhas() > 0.0f) {
            return "Conversão feita com sucesso!";
        }
        else {
            return "Não foi possível realizar a conversão";
        }
    }

    @Override
    public String getTipo() {
        return "ConversorMilhas";
    }
}
