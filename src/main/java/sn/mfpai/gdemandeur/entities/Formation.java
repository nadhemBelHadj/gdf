package sn.mfpai.gdemandeur.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typeFormation")
public class Formation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idForm;
	private String nomFormation;
	//private String typeFormation;
	private String duree;
	private String admission;
	private String diplomeRequis;
	
	/*@OneToOne(mappedBy = "formation")
	private PriseEnCharge priseEnCharge;*/
	
	

}
