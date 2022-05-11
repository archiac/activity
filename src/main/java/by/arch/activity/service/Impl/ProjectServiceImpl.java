package by.arch.activity.service.Impl;

import by.arch.activity.model.Project;
import by.arch.activity.repository.ProjectRepository;
import by.arch.activity.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public Project create(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }
}
