package com.camping.campingcenter.service;

import com.camping.campingcenter.model.CampingCenter;
import com.camping.campingcenter.repository.CampingCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CampingCenterService {
    private final CampingCenterRepository campingCenterRepository;

    public List<CampingCenter> getAllCampingCenters() {
        return campingCenterRepository.findAll();
    }

    public CampingCenter getCampingCenterById(Long id) {
        return campingCenterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Camping center not found"));
    }

    public CampingCenter createCampingCenter(CampingCenter campingCenter) {
        return campingCenterRepository.save(campingCenter);
    }

    public void deleteCampingCenter(Long id) {
        campingCenterRepository.deleteById(id);
    }
} 