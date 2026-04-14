package com.jobportal.job.mapper;

import com.jobportal.job.cqrs.command.CreateJobCommand;
import com.jobportal.job.cqrs.command.UpdateJobCommand;
import com.jobportal.job.dto.JobDto;
import com.jobportal.job.model.Job;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-14T10:22:17+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class JobMapperImpl implements JobMapper {

    @Override
    public Job toEntity(CreateJobCommand command) {
        if ( command == null ) {
            return null;
        }

        Job.JobBuilder job = Job.builder();

        if ( command.getSalaryCurrency() != null ) {
            job.salaryCurrency( command.getSalaryCurrency() );
        }
        else {
            job.salaryCurrency( "USD" );
        }
        if ( command.getIsRemote() != null ) {
            job.isRemote( command.getIsRemote() );
        }
        else {
            job.isRemote( false );
        }
        job.applicationDeadline( command.getApplicationDeadline() );
        job.category( command.getCategory() );
        job.company( command.getCompany() );
        job.description( command.getDescription() );
        job.experienceLevel( command.getExperienceLevel() );
        job.jobType( command.getJobType() );
        job.location( command.getLocation() );
        job.recruiterId( command.getRecruiterId() );
        job.requirements( command.getRequirements() );
        job.responsibilities( command.getResponsibilities() );
        job.salaryMax( command.getSalaryMax() );
        job.salaryMin( command.getSalaryMin() );
        job.skills( command.getSkills() );
        job.title( command.getTitle() );

        return job.build();
    }

    @Override
    public void updateEntityFromCommand(UpdateJobCommand command, Job job) {
        if ( command == null ) {
            return;
        }

        if ( command.getApplicationDeadline() != null ) {
            job.setApplicationDeadline( command.getApplicationDeadline() );
        }
        if ( command.getCategory() != null ) {
            job.setCategory( command.getCategory() );
        }
        if ( command.getCompany() != null ) {
            job.setCompany( command.getCompany() );
        }
        if ( command.getDescription() != null ) {
            job.setDescription( command.getDescription() );
        }
        if ( command.getExperienceLevel() != null ) {
            job.setExperienceLevel( command.getExperienceLevel() );
        }
        if ( command.getIsRemote() != null ) {
            job.setIsRemote( command.getIsRemote() );
        }
        if ( command.getJobType() != null ) {
            job.setJobType( command.getJobType() );
        }
        if ( command.getLocation() != null ) {
            job.setLocation( command.getLocation() );
        }
        if ( command.getRequirements() != null ) {
            job.setRequirements( command.getRequirements() );
        }
        if ( command.getResponsibilities() != null ) {
            job.setResponsibilities( command.getResponsibilities() );
        }
        if ( command.getSalaryCurrency() != null ) {
            job.setSalaryCurrency( command.getSalaryCurrency() );
        }
        if ( command.getSalaryMax() != null ) {
            job.setSalaryMax( command.getSalaryMax() );
        }
        if ( command.getSalaryMin() != null ) {
            job.setSalaryMin( command.getSalaryMin() );
        }
        if ( command.getSkills() != null ) {
            job.setSkills( command.getSkills() );
        }
        if ( command.getStatus() != null ) {
            job.setStatus( command.getStatus() );
        }
        if ( command.getTitle() != null ) {
            job.setTitle( command.getTitle() );
        }
    }

    @Override
    public JobDto.JobResponse toResponse(Job job) {
        if ( job == null ) {
            return null;
        }

        JobDto.JobResponse.JobResponseBuilder jobResponse = JobDto.JobResponse.builder();

        jobResponse.jobType( enumToString( job.getJobType() ) );
        jobResponse.experienceLevel( enumToString( job.getExperienceLevel() ) );
        jobResponse.status( enumToString( job.getStatus() ) );
        jobResponse.createdAt( localDateTimeToString( job.getCreatedAt() ) );
        jobResponse.updatedAt( localDateTimeToString( job.getUpdatedAt() ) );
        jobResponse.applicationDeadline( job.getApplicationDeadline() );
        jobResponse.applicationsCount( job.getApplicationsCount() );
        jobResponse.category( job.getCategory() );
        jobResponse.company( job.getCompany() );
        jobResponse.description( job.getDescription() );
        jobResponse.id( job.getId() );
        jobResponse.isRemote( job.getIsRemote() );
        jobResponse.location( job.getLocation() );
        jobResponse.recruiterId( job.getRecruiterId() );
        jobResponse.requirements( job.getRequirements() );
        jobResponse.responsibilities( job.getResponsibilities() );
        jobResponse.salaryCurrency( job.getSalaryCurrency() );
        jobResponse.salaryMax( job.getSalaryMax() );
        jobResponse.salaryMin( job.getSalaryMin() );
        jobResponse.skills( job.getSkills() );
        jobResponse.title( job.getTitle() );
        jobResponse.uuid( job.getUuid() );
        jobResponse.viewsCount( job.getViewsCount() );

        return jobResponse.build();
    }

    @Override
    public CreateJobCommand toCreateCommand(JobDto.CreateJobRequest request) {
        if ( request == null ) {
            return null;
        }

        CreateJobCommand.CreateJobCommandBuilder createJobCommand = CreateJobCommand.builder();

        createJobCommand.applicationDeadline( request.getApplicationDeadline() );
        createJobCommand.category( request.getCategory() );
        createJobCommand.company( request.getCompany() );
        createJobCommand.description( request.getDescription() );
        createJobCommand.experienceLevel( request.getExperienceLevel() );
        createJobCommand.isRemote( request.getIsRemote() );
        createJobCommand.jobType( request.getJobType() );
        createJobCommand.location( request.getLocation() );
        createJobCommand.requirements( request.getRequirements() );
        createJobCommand.responsibilities( request.getResponsibilities() );
        createJobCommand.salaryCurrency( request.getSalaryCurrency() );
        createJobCommand.salaryMax( request.getSalaryMax() );
        createJobCommand.salaryMin( request.getSalaryMin() );
        createJobCommand.skills( request.getSkills() );
        createJobCommand.title( request.getTitle() );

        return createJobCommand.build();
    }

    @Override
    public UpdateJobCommand toUpdateCommand(JobDto.UpdateJobRequest request) {
        if ( request == null ) {
            return null;
        }

        UpdateJobCommand.UpdateJobCommandBuilder updateJobCommand = UpdateJobCommand.builder();

        updateJobCommand.applicationDeadline( request.getApplicationDeadline() );
        updateJobCommand.category( request.getCategory() );
        updateJobCommand.company( request.getCompany() );
        updateJobCommand.description( request.getDescription() );
        updateJobCommand.experienceLevel( request.getExperienceLevel() );
        updateJobCommand.isRemote( request.getIsRemote() );
        updateJobCommand.jobType( request.getJobType() );
        updateJobCommand.location( request.getLocation() );
        updateJobCommand.requirements( request.getRequirements() );
        updateJobCommand.responsibilities( request.getResponsibilities() );
        updateJobCommand.salaryCurrency( request.getSalaryCurrency() );
        updateJobCommand.salaryMax( request.getSalaryMax() );
        updateJobCommand.salaryMin( request.getSalaryMin() );
        updateJobCommand.skills( request.getSkills() );
        updateJobCommand.status( request.getStatus() );
        updateJobCommand.title( request.getTitle() );

        return updateJobCommand.build();
    }
}
