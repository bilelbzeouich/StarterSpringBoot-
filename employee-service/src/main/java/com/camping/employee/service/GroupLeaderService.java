package com.camping.employee.service;

import com.camping.employee.model.GroupLeader;
import com.camping.employee.repository.GroupLeaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupLeaderService {
    private final GroupLeaderRepository groupLeaderRepository;

    public List<GroupLeader> getAllGroupLeaders() {
        return groupLeaderRepository.findAll();
    }

    public GroupLeader getGroupLeaderById(Long id) {
        return groupLeaderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Group Leader not found"));
    }

    public List<GroupLeader> getGroupLeadersByCampingCenterId(Long campingCenterId) {
        return groupLeaderRepository.findByCampingCenterId(campingCenterId);
    }

    public GroupLeader createGroupLeader(GroupLeader groupLeader) {
        return groupLeaderRepository.save(groupLeader);
    }

    public GroupLeader updateGroupLeader(Long id, GroupLeader groupLeader) {
        GroupLeader existingGroupLeader = getGroupLeaderById(id);
        existingGroupLeader.setName(groupLeader.getName());
        existingGroupLeader.setExperienceLevel(groupLeader.getExperienceLevel());
        return groupLeaderRepository.save(existingGroupLeader);
    }

    public void deleteGroupLeader(Long id) {
        groupLeaderRepository.deleteById(id);
    }
} 