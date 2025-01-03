package com.devteria.profile.controllers;

import org.springframework.web.bind.annotation.*;

import com.devteria.profile.dtos.request.ProfileCreationRequest;
import com.devteria.profile.dtos.response.UserProfileResponse;
import com.devteria.profile.services.UserProfileService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class InternalUserProfileController {
    UserProfileService userProfileService;

    @PostMapping("/internal/users")
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request) {
        return userProfileService.createProfile(request);
    }
}
