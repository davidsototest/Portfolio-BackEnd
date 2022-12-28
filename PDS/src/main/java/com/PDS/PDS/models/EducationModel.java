
package com.PDS.PDS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name = "education")
public class EducationModel {
    
    @Getter @Setter @Column (name = "id_edu")
    @Id
    private int id_edu;
    
    @Getter @Setter @Column (name = "duration_education")
    private String duration_education;
    
    @Getter @Setter @Column (name = "level_education")
    private String level_education;
    
    @Getter @Setter @Column (name = "name_education")
    private String name_education;
    
    @Getter @Setter @Column (name = "place_education")
    private String place_education;
    
    @Getter @Setter @Column (name = "url_photo_education")
    private String url_photo_education;
    
    
}
