package peaksoft.appplaza.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import peaksoft.appplaza.mapper.ApplicationMapper;
import peaksoft.appplaza.repository.ApplicationRepository;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApplicationService {


    final ApplicationMapper mapper;
    final ApplicationRepository repository;



}
