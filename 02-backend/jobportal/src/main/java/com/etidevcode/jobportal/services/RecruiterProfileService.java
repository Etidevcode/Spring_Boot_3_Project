package com.etidevcode.jobportal.services;

import com.etidevcode.jobportal.entity.RecruiterProfile;
import com.etidevcode.jobportal.repository.RecruiterProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecruiterProfileService {

	private final RecruiterProfileRepository recruiterRepository;

	@Autowired
	public RecruiterProfileService(RecruiterProfileRepository recruiterRepository) {
		this.recruiterRepository = recruiterRepository;
	}

	public Optional<RecruiterProfile> getOne(Integer id){
		return recruiterRepository.findById(id);
	}

	public RecruiterProfile addNew(RecruiterProfile recruiterProfile) {
		return recruiterRepository.save(recruiterProfile);
	}
}