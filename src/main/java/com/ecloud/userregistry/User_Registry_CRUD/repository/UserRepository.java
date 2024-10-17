package com.ecloud.userregistry.User_Registry_CRUD.repository;

import com.ecloud.userregistry.User_Registry_CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
