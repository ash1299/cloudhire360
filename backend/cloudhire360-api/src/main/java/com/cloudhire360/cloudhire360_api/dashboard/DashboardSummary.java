package com.cloudhire360.cloudhire360_api.dashboard;

public class DashboardSummary {

    private long totalJobs;
    private long totalApplications;
    private long savedApplications;
    private long appliedApplications;
    private long assessmentApplications;
    private long interviewApplications;
    private long offerApplications;
    private long rejectedApplications;
    private long ghostedApplications;

    public DashboardSummary() {
    }

    public DashboardSummary(long totalJobs, long totalApplications, long savedApplications,
                            long appliedApplications, long assessmentApplications,
                            long interviewApplications, long offerApplications,
                            long rejectedApplications, long ghostedApplications) {
        this.totalJobs = totalJobs;
        this.totalApplications = totalApplications;
        this.savedApplications = savedApplications;
        this.appliedApplications = appliedApplications;
        this.assessmentApplications = assessmentApplications;
        this.interviewApplications = interviewApplications;
        this.offerApplications = offerApplications;
        this.rejectedApplications = rejectedApplications;
        this.ghostedApplications = ghostedApplications;
    }

    public long getTotalJobs() {
        return totalJobs;
    }

    public void setTotalJobs(long totalJobs) {
        this.totalJobs = totalJobs;
    }

    public long getTotalApplications() {
        return totalApplications;
    }

    public void setTotalApplications(long totalApplications) {
        this.totalApplications = totalApplications;
    }

    public long getSavedApplications() {
        return savedApplications;
    }

    public void setSavedApplications(long savedApplications) {
        this.savedApplications = savedApplications;
    }

    public long getAppliedApplications() {
        return appliedApplications;
    }

    public void setAppliedApplications(long appliedApplications) {
        this.appliedApplications = appliedApplications;
    }

    public long getAssessmentApplications() {
        return assessmentApplications;
    }

    public void setAssessmentApplications(long assessmentApplications) {
        this.assessmentApplications = assessmentApplications;
    }

    public long getInterviewApplications() {
        return interviewApplications;
    }

    public void setInterviewApplications(long interviewApplications) {
        this.interviewApplications = interviewApplications;
    }

    public long getOfferApplications() {
        return offerApplications;
    }

    public void setOfferApplications(long offerApplications) {
        this.offerApplications = offerApplications;
    }

    public long getRejectedApplications() {
        return rejectedApplications;
    }

    public void setRejectedApplications(long rejectedApplications) {
        this.rejectedApplications = rejectedApplications;
    }

    public long getGhostedApplications() {
        return ghostedApplications;
    }

    public void setGhostedApplications(long ghostedApplications) {
        this.ghostedApplications = ghostedApplications;
    }
}