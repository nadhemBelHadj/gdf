package sn.mfpai.gdemandeur;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sn.mfpai.gdemandeur.entities.Formation;
import sn.mfpai.gdemandeur.repos.FormationRepository;

@SpringBootTest
class GdfApplicationTests {


	@Autowired
	private FormationRepository formationRepository;

	/*@Test
	public void testCreateFormation() {
	Formation form1 = new Formation("CAP Menuiserie bois","initiale","3 ans",
			"concours","bac", null, null);
	formationRepository.save(form1);
	}*/
	
	@Test
	public void testFindFormation()
	{
		Formation f = formationRepository.findById(1L).get(); 
	System.out.println(f);
	}
	
	@Test
	public void testUpdateFormation()
	{
	Formation f = formationRepository.findById(1L).get();
	f.setNomFormation("CAP COUTURE");
	formationRepository.save(f);
	System.out.println(f);
	}
	
	@Test
	public void testDeleteFormation()
	{
		formationRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllFormations()
	{
		List<Formation> forms = formationRepository.findAll();
		
		for(Formation f:forms)
			System.out.println(f);
	}
	
	

	
	
}
