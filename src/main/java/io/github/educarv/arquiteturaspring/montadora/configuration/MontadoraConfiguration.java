package io.github.educarv.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.educarv.arquiteturaspring.montadora.Motor;
import io.github.educarv.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {

    @Bean // Define um bean do tipo Motor que poderá ser injetado em outras classes do
          // Spring
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(200);
        motor.setCilindros(6);
        motor.setModelo("XPTO");
        motor.setLitragem(2.5);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }
}
