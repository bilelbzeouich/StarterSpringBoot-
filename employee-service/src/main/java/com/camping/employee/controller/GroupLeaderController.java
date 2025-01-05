package com.camping.employee.controller;

import com.camping.employee.model.GroupLeader;
import com.camping.employee.service.GroupLeaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/group-leaders")
@RequiredArgsConstructor
public class GroupLeaderController {
    private final GroupLeaderService groupLeaderService;

    @GetMapping
    public ResponseEntity<List<GroupLeader>> getAllGroupLeaders() {
        return ResponseEntity.ok(groupLeaderService.getAllGroupLeaders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroupLeader> getGroupLeaderById(@PathVariable Long id) {
        return ResponseEntity.ok(groupLeaderService.getGroupLeaderById(id));
    }

    @GetMapping("/camping-center/{campingCenterId}")
    public ResponseEntity<List<GroupLeader>> getGroupLeadersByCampingCenterId(@PathVariable Long campingCenterId) {
        return ResponseEntity.ok(groupLeaderService.getGroupLeadersByCampingCenterId(campingCenterId));
    }

    @PostMapping
    public ResponseEntity<GroupLeader> createGroupLeader(@RequestBody GroupLeader groupLeader) {
        return ResponseEntity.ok(groupLeaderService.createGroupLeader(groupLeader));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroupLeader> updateGroupLeader(@PathVariable Long id, @RequestBody GroupLeader groupLeader) {
        return ResponseEntity.ok(groupLeaderService.updateGroupLeader(id, groupLeader));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroupLeader(@PathVariable Long id) {
        groupLeaderService.deleteGroupLeader(id);
        return ResponseEntity.ok().build();
    }
} 