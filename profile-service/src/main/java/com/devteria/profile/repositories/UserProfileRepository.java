package com.devteria.profile.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.devteria.profile.entities.UserProfile;

@Repository
public interface UserProfileRepository extends Neo4jRepository<UserProfile, String> {}
