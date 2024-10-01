package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Formation;
import sn.mfpai.gdemandeur.service.FormationService;

@RestController
@RequestMapping("/formation")
@CrossOrigin
public class FormationRESTController {

	@Autowired
	FormationService formationService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Formation> getAllFormations() {
		return formationService.getAllFormations();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Formation getFormationById(@PathVariable("id") Long id) {
		return formationService.getFormation(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Formation createFormation(@RequestBody Formation formation) 
	{
		return formationService.saveFormation(formation);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Formation updateFormation(@RequestBody Formation formation) 
	{
		return formationService.updateFormation(formation);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteFormation(@PathVariable("id") Long id)
	{
		formationService.deleteFormationById(id);
	}
		
	
	
}
