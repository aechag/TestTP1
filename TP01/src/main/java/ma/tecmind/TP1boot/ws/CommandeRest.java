package ma.tecmind.TP1boot.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.tecmind.TP1boot.bean.Commande;
import ma.tecmind.TP1boot.service.CommandeService;



@RestController
@RequestMapping("/api/commandes/")
@Api("Gestion de comande")
public class CommandeRest {
	@Autowired
	private CommandeService commandeService;

	@ApiOperation("find a commande by ref")
	@GetMapping("ref/{ref}")
	public Commande findByRef(@PathVariable String ref) {
		return commandeService.findByRef(ref);
	}

	@ApiOperation("save a commande if the ref is not olready saved")
	@PostMapping("save")
	public int save(@RequestBody Commande commande) {
		return commandeService.save(commande);
	}


	@ApiOperation("update a commande")
	@PutMapping("update")
	public int update(@RequestBody Commande commande) {
		return commandeService.update(commande);
	}

	@ApiOperation("find list of commande")
	@GetMapping("/")
	public List<Commande> findAll() {
		return commandeService.findAll();
	}


}
