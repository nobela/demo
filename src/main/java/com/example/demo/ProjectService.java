/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author enobela
 */
public class ProjectService {
    public static Map<Long, Project> projects = new HashMap<>();
    
    public static Long index= 4L;
    
    static {
    
    
    Project  project1 = new Project(1L,"ReactJS","App Development","Created");
    Project  project2 = new Project(2L,"Angular","Web Development","Created");
    Project  project3 = new Project(3L,"Spring Boot","Web Development","Created");
    Project  project4 = new Project(4L,"Java","Desktop Development","Created");
    projects.put(1L, project1);
    projects.put(2L, project2);
    projects.put(3L, project3);
    projects.put(4L, project4);
    
    }
    
    public static List<Project> GetAllProjects()
    {
    
    return new ArrayList<>(projects.values());
    }
    
    public static Project  GetProjectDetails(long projectid)
    {
    return  projects.get(projectid);
    }
    
    public static Project AddProject(Project proc)
    {
    index +=1;
    proc.setID(index);
    projects.put(index, proc);
    return proc;
    }
    
    public static Project removeProject(Long pro_id)
    {
    
        return projects.remove(pro_id);
    
    }
}
