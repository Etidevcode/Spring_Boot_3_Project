package com.etidevcode.jobportal.services;

import com.etidevcode.jobportal.entity.UsersType;
import com.etidevcode.jobportal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

	private final UsersTypeRepository usersTypeRepository;

	public UsersTypeService(UsersTypeRepository usersTypeRepository) {
		this.usersTypeRepository = usersTypeRepository;
	}

	public List<UsersType> getAll(){
		return usersTypeRepository.findAll();
	}
}
