package com.cloudhire360.cloudhire360_api.job;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    List<Job> findByCompanyNameContainingIgnoreCase(String companyName);

    List<Job> findByStatus(JobStatus status);
}