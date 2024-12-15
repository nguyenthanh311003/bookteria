package com.devteria.profile.services;

import com.devteria.profile.dtos.request.ProfileCreationRequest;
import com.devteria.profile.dtos.response.UserProfileResponse;
import com.devteria.profile.entities.UserProfile;
import com.devteria.profile.mapper.UserProfileMapper;
import com.devteria.profile.repositories.UserProfileRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserProfileService {
    UserProfileRepository userProfileRepository;
    UserProfileMapper userProfileMapper;

    public UserProfileResponse createProfile(ProfileCreationRequest request) {
        UserProfile userProfile = userProfileMapper.toUserProfile(request);
        userProfile = userProfileRepository.save(userProfile);

        return userProfileMapper.toUserProfileResponse(userProfile);
    }

    public UserProfileResponse getProfile(String id) {
        UserProfile userProfileById = userProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found !"));

        return userProfileMapper.toUserProfileResponse(userProfileById);
    }
}
