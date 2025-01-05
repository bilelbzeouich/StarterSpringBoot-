package com.camping.campingcenter.controller;

import com.camping.campingcenter.model.CampingCenter;
import com.camping.campingcenter.service.CampingCenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/camping-centers")
@RequiredArgsConstructor
public class CampingCenterController {
    private final CampingCenterService campingCenterService;

    @GetMapping
    public ResponseEntity<List<CampingCenter>> getAllCampingCenters() {
        return ResponseEntity.ok(campingCenterService.getAllCampingCenters());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CampingCenter> getCampingCenterById(@PathVariable Long id) {
        return ResponseEntity.ok(campingCenterService.getCampingCenterById(id));
    }

    @PostMapping
    public ResponseEntity<CampingCenter> createCampingCenter(@RequestBody CampingCenter campingCenter) {
        return ResponseEntity.ok(campingCenterService.createCampingCenter(campingCenter));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCampingCenter(@PathVariable Long id) {
        campingCenterService.deleteCampingCenter(id);
        return ResponseEntity.ok().build();
    }
} 