package com.Rrdesh07.CarPooling.Repository;

import com.Rrdesh07.CarPooling.Models.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {
}
