package com.jobportal.application.mapper;

import com.jobportal.application.cqrs.command.ApplyJobCommand;
import com.jobportal.application.dto.ApplicationDto;
import com.jobportal.application.model.JobApplication;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-14T10:21:56+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class ApplicationMapperImpl implements ApplicationMapper {

    @Override
    public JobApplication toEntity(ApplyJobCommand command) {
        if ( command == null ) {
            return null;
        }

        JobApplication.JobApplicationBuilder jobApplication = JobApplication.builder();

        jobApplication.coverLetter( command.getCoverLetter() );
        jobApplication.jobId( command.getJobId() );
        jobApplication.resumePublicId( command.getResumePublicId() );
        jobApplication.resumeUrl( command.getResumeUrl() );
        jobApplication.userId( command.getUserId() );

        return jobApplication.build();
    }

    @Override
    public ApplyJobCommand toApplyCommand(ApplicationDto.ApplyRequest request) {
        if ( request == null ) {
            return null;
        }

        ApplyJobCommand.ApplyJobCommandBuilder applyJobCommand = ApplyJobCommand.builder();

        applyJobCommand.coverLetter( request.getCoverLetter() );
        applyJobCommand.resumePublicId( request.getResumePublicId() );
        applyJobCommand.resumeUrl( request.getResumeUrl() );

        return applyJobCommand.build();
    }

    @Override
    public ApplicationDto.ApplicationResponse toResponse(JobApplication application) {
        if ( application == null ) {
            return null;
        }

        ApplicationDto.ApplicationResponse.ApplicationResponseBuilder applicationResponse = ApplicationDto.ApplicationResponse.builder();

        applicationResponse.status( enumToString( application.getStatus() ) );
        applicationResponse.appliedAt( localDateTimeToString( application.getAppliedAt() ) );
        applicationResponse.updatedAt( localDateTimeToString( application.getUpdatedAt() ) );
        applicationResponse.applicantEmail( application.getApplicantEmail() );
        applicationResponse.applicantName( application.getApplicantName() );
        applicationResponse.applicantPhone( application.getApplicantPhone() );
        applicationResponse.companyName( application.getCompanyName() );
        applicationResponse.coverLetter( application.getCoverLetter() );
        applicationResponse.id( application.getId() );
        applicationResponse.jobId( application.getJobId() );
        applicationResponse.jobTitle( application.getJobTitle() );
        applicationResponse.recruiterId( application.getRecruiterId() );
        applicationResponse.resumeUrl( application.getResumeUrl() );
        applicationResponse.statusNote( application.getStatusNote() );
        applicationResponse.userId( application.getUserId() );
        applicationResponse.uuid( application.getUuid() );

        return applicationResponse.build();
    }
}
