package com.camping.employee.repository;

import com.camping.employee.model.GroupLeader;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GroupLeaderRepository extends JpaRepository<GroupLeader, Long> {
    List<GroupLeader> findByCampingCenterId(Long campingCenterId);
} 