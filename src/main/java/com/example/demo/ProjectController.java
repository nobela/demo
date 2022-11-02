/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author enobela
 */
@RestController
public class ProjectController {
  
   @GetMapping("/Projects") 
   public List<Project> GetAllProjects()
   {
   return ProjectService.GetAllProjects();
   
   }
   @PostMapping("/AddProject")
   public  Project AddProject(Project pro_oj)
   {
   return ProjectService.AddProject(pro_oj);
   
   }
   @GetMapping("/Project/{projectid}")
   public  Project GetProject(@PathVariable Long id)
   {
   return ProjectService.GetProjectDetails(id);
   }
   
  @DeleteMapping("/deleteProject/{projectid}")
    public Project Deleteproject(@PathVariable Long id)
   {
   
   return ProjectService.removeProject(id);
   }
}
