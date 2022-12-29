
package com.PDS.PDS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table ( name = "projects")
public class ProjectModel {
    
    @Id
    @Getter @Setter @Column ( name = "id_project")
    private int id_project;
    
    @Getter @Setter @Column ( name = "name_project")
    private String name_project;
    
    @Getter @Setter @Column ( name = "description_project")
    private String description_project;
    
    @Getter @Setter @Column ( name = "url_photo_project")
    private String url_photo_project;
    
    @Getter @Setter @Column ( name = "url_project")
    private String url_project;
    
    
    
}
