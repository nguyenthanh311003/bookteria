package com.devteria.api_gateway.service;

import com.devteria.api_gateway.dtos.ApiResponse;
import com.devteria.api_gateway.dtos.request.IntrospectRequest;
import com.devteria.api_gateway.dtos.response.IntrospectResponse;
import com.devteria.api_gateway.repositories.IdentityClient;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class IdentityService {
    IdentityClient identityClient;

    public Mono<ApiResponse<IntrospectResponse>> introspect(String token) {
        return identityClient.introspect(IntrospectRequest.builder().token(token).build());
    }
}
