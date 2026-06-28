package io.github.educarv.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.educarv.arquiteturaspring.montadora.Motor;
import io.github.educarv.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {

    @Bean(name ="motorAspirado") // Define um bean do tipo Motor que poderá ser injetado em outras classes do
          // Spring
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO");
        motor.setLitragem(1.8);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name ="motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(0);
        motor.setModelo("BYDX");
        motor.setLitragem(0.0);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name ="motorHibrido")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(250);
        motor.setCilindros(6);
        motor.setModelo("XPTO-TURBO");
        motor.setLitragem(2.5);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }
}
