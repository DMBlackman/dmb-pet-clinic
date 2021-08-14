
package dmb.springframework.dmbpetclinic.model;

// @author Declan Blackman
// @date Aug 12, 2021
public class PetType extends BaseEntity{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
