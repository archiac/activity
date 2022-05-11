package by.arch.activity.service;

import by.arch.activity.model.Project;


import java.util.List;
public interface ProjectService {
    Project create(Project project);
    List<Project> findAll();
    void delete(Long id);
}
