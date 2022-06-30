package by.arch.activity.service.Impl;

import by.arch.activity.dto.ProjectDto;
import by.arch.activity.mapper.ProjectMapper;
import by.arch.activity.model.Project;
import by.arch.activity.repository.ProjectRepository;
import by.arch.activity.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    @Override
    public Project create(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Iterable<ProjectDto> findAll(Pageable pageable) {
        Page<Project> pageProjects = projectRepository.findAll(pageable);
        return projectMapper.toListDto(pageProjects);
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }
}
