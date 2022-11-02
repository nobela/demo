/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author enobela
 */
public class Project {
   // Variables 
    private long Project_Id;
    private String Project_Name;
    private String Project_Description;
    private String ProjectStatus;
    
    
    public enum ProjectStatus{
    Created,
    Inprogress,
    Completed,
    Paused;
    
    }
    
    /* Default constructor*/
    
    public Project()
    {
    
    }
    public Project(long id, String name, String Description,String p_status)
    {
    this.Project_Id=id;
    this.Project_Name=name;
    this.Project_Description=Description;
    this.ProjectStatus=p_status;
    
    }
    
    public void setID(long id)
    {
    this.Project_Id= id;
    }
    public long getID()
    {
    return Project_Id;
    }
    public void setProjectName(String pname)
    {
    this.Project_Name=pname;
    }
    
    public String getProjectName()
    {
    
    return Project_Name;
    }
    public void setProjectDescription(String projectD)
    {
    
    this.Project_Description=projectD;
    }
    
    public String getProjectDesc()
    {
    return Project_Description;
    }
    public void setProject_status(String status)
    {
    
    this.ProjectStatus=status;
    }
    public String getProjectStatus()
    {
    
    return ProjectStatus;
    }
}

