package com.brillio.example.firstRestServices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkDAO extends JpaRepository<MarkDTO,String> {
}
