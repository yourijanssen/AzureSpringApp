package com.azureDemo.azureDemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
      // This interface will automatically provide CRUD operations for the User entity

}
