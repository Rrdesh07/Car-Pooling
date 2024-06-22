package com.Rrdesh07.CarPooling.Repository;

import com.Rrdesh07.CarPooling.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
