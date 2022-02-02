package com.dxc.learning.demoapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person, Integer>{
    
}
