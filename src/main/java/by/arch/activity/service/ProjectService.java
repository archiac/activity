package by.arch.activity.service;

import by.arch.activity.dto.ProjectDto;
import by.arch.activity.model.Project;
import org.springframework.data.domain.Pageable;

public interface ProjectService {
    Project create(Project project);

    Iterable<ProjectDto> findAll(Pageable pageable);

    void delete(Long id);
}
