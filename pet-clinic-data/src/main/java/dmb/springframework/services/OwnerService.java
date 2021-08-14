package dmb.springframework.services;

import java.util.Set;

import dmb.springframework.dmbpetclinic.model.Owner;

// @author Declan Blackman
// @date Aug 14, 2021

public interface OwnerService {
	
	Owner findByLastName (String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
