package by.arch.activity.service;

import by.arch.activity.model.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjectService {
    Project create(Project project);
    Page<Project> findAll(Pageable pageable);
    void delete(Long id);
}
