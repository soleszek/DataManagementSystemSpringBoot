package com.oleszeksylwester.DataManagementSystemSpringBoot.repository;

import com.oleszeksylwester.DataManagementSystemSpringBoot.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

}
