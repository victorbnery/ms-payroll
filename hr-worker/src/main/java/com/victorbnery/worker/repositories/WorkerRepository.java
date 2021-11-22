package com.victorbnery.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorbnery.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
