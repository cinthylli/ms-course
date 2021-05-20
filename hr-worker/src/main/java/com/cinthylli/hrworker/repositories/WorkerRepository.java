package com.cinthylli.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinthylli.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
