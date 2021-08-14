
package dmb.springframework.services;

import java.util.Set;

import dmb.springframework.dmbpetclinic.model.Pet;

// @author Declan Blackman
// @date Aug 14, 2021

public interface VetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();	
}
