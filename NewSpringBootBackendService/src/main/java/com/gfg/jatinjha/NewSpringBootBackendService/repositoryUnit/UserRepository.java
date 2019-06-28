package com.gfg.jatinjha.NewSpringBootBackendService.repositoryUnit;

import com.gfg.jatinjha.NewSpringBootBackendService.modelUnit.Model;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Model,Long> {

}
