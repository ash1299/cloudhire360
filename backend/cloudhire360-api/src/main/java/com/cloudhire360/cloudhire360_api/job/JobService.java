package com.cloudhire360.cloudhire360_api.job;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job getJobById(Long id) {
        return jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
    }

    public Job updateJob(Long id, Job updatedJob) {
        Job existingJob = getJobById(id);

        existingJob.setCompanyName(updatedJob.getCompanyName());
        existingJob.setJobTitle(updatedJob.getJobTitle());
        existingJob.setJobUrl(updatedJob.getJobUrl());
        existingJob.setLocation(updatedJob.getLocation());
        existingJob.setEmploymentType(updatedJob.getEmploymentType());
        existingJob.setJobDescription(updatedJob.getJobDescription());
        existingJob.setRequiredSkills(updatedJob.getRequiredSkills());
        existingJob.setVisaNotes(updatedJob.getVisaNotes());
        existingJob.setStatus(updatedJob.getStatus());

        return jobRepository.save(existingJob);
    }

    public void deleteJob(Long id) {
        Job existingJob = getJobById(id);
        jobRepository.delete(existingJob);
    }
}