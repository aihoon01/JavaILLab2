package org.labexercise.demo.topDownApproach.repositories;

import org.labexercise.demo.topDownApproach.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
