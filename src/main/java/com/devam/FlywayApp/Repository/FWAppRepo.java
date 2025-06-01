package com.devam.FlywayApp.Repository;

import com.devam.FlywayApp.Model.BasicData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FWAppRepo extends JpaRepository<BasicData,String> {
}
