package pe.undc.microservicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PruebaController {

    @GetMapping("/prueba")
    public Map<String, String> prueba() {
        return Map.of(
            "id", "20601477956",
            "institucion", "Universidad Privada San Juan Bautista",
            "correo", "mesadepartes@upsjb.edu.pe"
        );
    }
}
