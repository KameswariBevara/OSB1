package com.capg.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {


}
