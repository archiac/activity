package by.arch.activity.endpoint;

import by.arch.activity.dto.ProjectDto;
import by.arch.activity.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectController {

    private static final int PAGE_DEFAULT_SIZE = 5;
    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<Iterable<ProjectDto>> getAllProjects(
            @PageableDefault(size = PAGE_DEFAULT_SIZE) Pageable pageable
    ) {
        return ResponseEntity.ok(projectService.findAll(pageable));
    }

}
