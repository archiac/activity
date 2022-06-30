package by.arch.activity.mapper;

import by.arch.activity.dto.ProjectDto;
import by.arch.activity.model.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectDto toDto(Project project);

    Project toEntity(ProjectDto projectDto);

    Iterable<ProjectDto> toListDto(Iterable<Project> entityList);

    Iterable<Project> toListEntity(Iterable<ProjectDto> dtoList);
}
