package com.cloudhire360.cloudhire360_api.dashboard;

import com.cloudhire360.cloudhire360_api.applicationtracker.ApplicationStatus;
import com.cloudhire360.cloudhire360_api.applicationtracker.JobApplicationRepository;
import com.cloudhire360.cloudhire360_api.job.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    private final JobRepository jobRepository;
    private final JobApplicationRepository jobApplicationRepository;

    public DashboardService(JobRepository jobRepository, JobApplicationRepository jobApplicationRepository) {
        this.jobRepository = jobRepository;
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public DashboardSummary getDashboardSummary() {
        long totalJobs = jobRepository.count();
        long totalApplications = jobApplicationRepository.count();

        long savedApplications = jobApplicationRepository.findByStatus(ApplicationStatus.SAVED).size();
        long appliedApplications = jobApplicationRepository.findByStatus(ApplicationStatus.APPLIED).size();
        long assessmentApplications = jobApplicationRepository.findByStatus(ApplicationStatus.ASSESSMENT).size();
        long interviewApplications = jobApplicationRepository.findByStatus(ApplicationStatus.INTERVIEW).size();
        long offerApplications = jobApplicationRepository.findByStatus(ApplicationStatus.OFFER).size();
        long rejectedApplications = jobApplicationRepository.findByStatus(ApplicationStatus.REJECTED).size();
        long ghostedApplications = jobApplicationRepository.findByStatus(ApplicationStatus.GHOSTED).size();

        return new DashboardSummary(
                totalJobs,
                totalApplications,
                savedApplications,
                appliedApplications,
                assessmentApplications,
                interviewApplications,
                offerApplications,
                rejectedApplications,
                ghostedApplications
        );
    }
}