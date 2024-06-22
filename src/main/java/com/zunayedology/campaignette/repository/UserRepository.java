package com.zunayedology.campaignette.repository;

import com.zunayedology.campaignette.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
