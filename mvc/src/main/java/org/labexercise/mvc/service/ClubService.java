package org.labexercise.mvc.service;


import org.labexercise.mvc.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
