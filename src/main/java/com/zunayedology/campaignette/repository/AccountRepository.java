package com.zunayedology.campaignette.repository;

import com.zunayedology.campaignette.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
