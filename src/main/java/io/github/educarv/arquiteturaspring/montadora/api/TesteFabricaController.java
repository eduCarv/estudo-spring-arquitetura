package io.github.educarv.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.educarv.arquiteturaspring.montadora.Carro;
import io.github.educarv.arquiteturaspring.montadora.CarroStatus;
import io.github.educarv.arquiteturaspring.montadora.Chave;
import io.github.educarv.arquiteturaspring.montadora.Motor;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    // Injeção de dependência do Motor
    @Autowired
    // @Qualifier("motorEletrico") // ou "motorTurbo", dependendo do motor que você deseja injetar    
    @Aspirado
    private Motor motor;

    // private final Motor motor;
    // TesteFabricaController(Motor motor) {
    //     this.motor = motor;
    // }

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new Carro("Honda HR-V", null, motor, chave.getMontadora());
        return carro.darPartida(chave);

    }

}
