package com.etidevcode.jobportal.repository;


import com.etidevcode.jobportal.entity.JobPostActivity;
import com.etidevcode.jobportal.entity.JobSeekerProfile;
import com.etidevcode.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
