package io.github.educarv.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro {
    public HondaHRV(Color cor, Motor motor) {
        super("Honda HR-V", cor.BLACK, motor, Montadora.HONDA); // Chama o construtor da classe pai (Carro) com os parâmetros específicos do Honda HR-V
    }

}
