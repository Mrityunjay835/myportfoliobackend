package com.portfolio.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.entity.Viewer;
public interface ViewerRepository extends JpaRepository<Viewer , Integer>{

}
