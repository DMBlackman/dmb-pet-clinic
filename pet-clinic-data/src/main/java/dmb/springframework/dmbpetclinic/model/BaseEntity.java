
package dmb.springframework.dmbpetclinic.model;

import java.io.Serializable;

// @author Declan Blackman
// @date Aug 14, 2021

public class BaseEntity implements Serializable {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
