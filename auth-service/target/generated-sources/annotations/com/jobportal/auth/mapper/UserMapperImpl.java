package com.jobportal.auth.mapper;

import com.jobportal.auth.dto.AuthDto;
import com.jobportal.auth.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-14T10:22:08+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public AuthDto.UserResponse toUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        AuthDto.UserResponse.UserResponseBuilder userResponse = AuthDto.UserResponse.builder();

        userResponse.role( roleToString( user.getRole() ) );
        userResponse.createdAt( localDateTimeToString( user.getCreatedAt() ) );
        userResponse.updatedAt( localDateTimeToString( user.getUpdatedAt() ) );
        userResponse.bio( user.getBio() );
        userResponse.companyName( user.getCompanyName() );
        userResponse.email( user.getEmail() );
        userResponse.fullName( user.getFullName() );
        userResponse.id( user.getId() );
        userResponse.isActive( user.getIsActive() );
        userResponse.location( user.getLocation() );
        userResponse.phoneNumber( user.getPhoneNumber() );
        userResponse.profileImageUrl( user.getProfileImageUrl() );
        userResponse.username( user.getUsername() );
        userResponse.uuid( user.getUuid() );

        return userResponse.build();
    }

    @Override
    public User toEntity(AuthDto.RegisterRequest request) {
        if ( request == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.companyName( request.getCompanyName() );
        user.email( request.getEmail() );
        user.fullName( request.getFullName() );
        user.phoneNumber( request.getPhoneNumber() );
        user.role( request.getRole() );
        user.username( request.getUsername() );

        return user.build();
    }

    @Override
    public void updateFromRequest(AuthDto.UpdateProfileRequest request, User user) {
        if ( request == null ) {
            return;
        }

        if ( request.getBio() != null ) {
            user.setBio( request.getBio() );
        }
        if ( request.getCompanyName() != null ) {
            user.setCompanyName( request.getCompanyName() );
        }
        if ( request.getFullName() != null ) {
            user.setFullName( request.getFullName() );
        }
        if ( request.getLocation() != null ) {
            user.setLocation( request.getLocation() );
        }
        if ( request.getPhoneNumber() != null ) {
            user.setPhoneNumber( request.getPhoneNumber() );
        }
    }
}
