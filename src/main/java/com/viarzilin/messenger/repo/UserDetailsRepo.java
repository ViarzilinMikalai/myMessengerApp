package com.viarzilin.messenger.repo;

import com.viarzilin.messenger.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
