package org.labexercise.mvc.service.impl;

import org.labexercise.mvc.dto.ClubDto;
import org.labexercise.mvc.models.Club;
import org.labexercise.mvc.repository.ClubRepository;
import org.labexercise.mvc.service.ClubService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map(club -> mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .content(club.getContent())
                .build();
        return clubDto;
    }
}
