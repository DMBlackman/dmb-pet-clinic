
package dmb.springframework.dmbpetclinic.model;

import java.time.LocalDate;


// @author Declan Blackman
// @date Aug 12, 2021
public class Pet extends BaseEntity{

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

	
	public PetType getPetType() {
		return petType;
	}


	public void setPetType(PetType petType) {
		this.petType = petType;
	}


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	public Pet() {
		// TODO Auto-generated constructor stub
	}

}
