package br.com.springboot.api_tabela_unificada_sigtap.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.api_tabela_unificada_sigtap.model.Procedimento;
import br.com.springboot.api_tabela_unificada_sigtap.repository.ProcedimentoRepository;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
	
	@Autowired
	private ProcedimentoRepository procedimentoRepository;
	
	 /**
     *
     * @param name the name to greet
     * @return greeting text
     */ 
	
    //@RequestMapping(value = "/{name}", method = RequestMethod.GET)
    //@ResponseStatus(HttpStatus.OK)
    //public String greetingText(@PathVariable String name) {
    //	
    //    return "Hello " + name + "!";
    //}
    
    
    
    @GetMapping(value="listarprocedimentos")
    @ResponseBody
    public ResponseEntity <List<Procedimento>> listaProcedimentos(){
    	
    	List<Procedimento> procedimentos = procedimentoRepository.findAll();
    	
    	return new ResponseEntity<List<Procedimento>>(procedimentos,HttpStatus.OK);
    }
    
    
    
    @PostMapping(value="salvar")
    @ResponseBody
    public ResponseEntity<Procedimento> salvar (@RequestBody Procedimento procedimento){
    	
    	Procedimento proc = procedimentoRepository.save(procedimento);
    	
    	return new ResponseEntity<Procedimento> (proc,HttpStatus.CREATED);
    }
    
    
    
    @DeleteMapping(value="delete")
    @ResponseBody
    public ResponseEntity<String> delete (@RequestParam Long id){
    	
    	procedimentoRepository.deleteById(id);
    	
    	return new ResponseEntity<String> ("Procedimento Deletado", HttpStatus.OK);
    }
    
    
    
    @GetMapping(value="buscarIdProc")
    @ResponseBody
    public ResponseEntity<Procedimento> buscarIdProc (@RequestParam (name = "id") Long id){
    	
    	
    	Procedimento procedimento = procedimentoRepository.findById(id).get();
    	
    	return new ResponseEntity<Procedimento> (procedimento, HttpStatus.OK);
    }
    
    
    
    @PutMapping(value="atualizarProc")
    @ResponseBody
    public ResponseEntity<?> atualizarProc (@RequestBody Procedimento procedimento){
    	
    	if (procedimento.getId()==null) {
    		return new ResponseEntity<String>("Id não informado para atualização",HttpStatus.OK);
    	}
    	
    	Procedimento proced = procedimentoRepository.saveAndFlush(procedimento);
    	
    	return new ResponseEntity<Procedimento> (proced, HttpStatus.OK);
    }
    
    
    @GetMapping(value="buscarPorNome")
    @ResponseBody
    public ResponseEntity<List<Procedimento>> buscarPorNome (@RequestParam (name = "name") String name){
    	
    	List<Procedimento> procedimento = procedimentoRepository.buscarPorNome(name.trim().toUpperCase());
    	
    	return new ResponseEntity<List<Procedimento>> (procedimento, HttpStatus.OK);
    }
    
    
}
