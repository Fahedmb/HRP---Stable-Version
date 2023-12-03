package com.hr.hr.Service;

import com.hr.hr.Entity.Project;


import java.util.List;


public interface ProjectService {
    List<Project> getAllProjects();
    Project getProjectById(Long projectId);
    Project createProject(Project project);
    Project updateProject(Long projectId, Project project);
    void deleteProject(Long projectId);
}
