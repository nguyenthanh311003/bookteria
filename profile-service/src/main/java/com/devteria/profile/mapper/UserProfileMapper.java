package com.devteria.profile.mapper;

import com.devteria.profile.dtos.request.ProfileCreationRequest;
import com.devteria.profile.dtos.response.UserProfileResponse;
import com.devteria.profile.entities.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);
    UserProfileResponse toUserProfileResponse(UserProfile entity);
}
