package servico;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class SkinatorController {
	
	@RequestMapping("/")
	public String listar() {
		return "Lista de Skins";
	}

}
