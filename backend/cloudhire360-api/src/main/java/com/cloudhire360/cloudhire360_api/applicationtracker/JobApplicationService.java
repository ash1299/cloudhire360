package com.cloudhire360.cloudhire360_api.applicationtracker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public JobApplication createApplication(JobApplication application) {
        return jobApplicationRepository.save(application);
    }

    public List<JobApplication> getAllApplications() {
        return jobApplicationRepository.findAll();
    }

    public JobApplication getApplicationById(Long id) {
        return jobApplicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found with id: " + id));
    }

    public JobApplication updateApplication(Long id, JobApplication updatedApplication) {
        JobApplication existingApplication = getApplicationById(id);

        existingApplication.setCompanyName(updatedApplication.getCompanyName());
        existingApplication.setJobTitle(updatedApplication.getJobTitle());
        existingApplication.setJobUrl(updatedApplication.getJobUrl());
        existingApplication.setLocation(updatedApplication.getLocation());
        existingApplication.setStatus(updatedApplication.getStatus());
        existingApplication.setAppliedDate(updatedApplication.getAppliedDate());
        existingApplication.setFollowUpDate(updatedApplication.getFollowUpDate());
        existingApplication.setContactPerson(updatedApplication.getContactPerson());
        existingApplication.setContactEmail(updatedApplication.getContactEmail());
        existingApplication.setResumeVersion(updatedApplication.getResumeVersion());
        existingApplication.setNotes(updatedApplication.getNotes());

        return jobApplicationRepository.save(existingApplication);
    }

    public void deleteApplication(Long id) {
        JobApplication existingApplication = getApplicationById(id);
        jobApplicationRepository.delete(existingApplication);
    }
}