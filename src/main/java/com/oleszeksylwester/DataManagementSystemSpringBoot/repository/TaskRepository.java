package com.oleszeksylwester.DataManagementSystemSpringBoot.repository;

import com.oleszeksylwester.DataManagementSystemSpringBoot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
