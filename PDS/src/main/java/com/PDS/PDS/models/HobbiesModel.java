
package com.PDS.PDS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table ( name = ("hobbies"))
public class HobbiesModel {
    
    @Id
    @Getter @Setter @Column (name = "id_hobbies")
    private int id_hobbies;
    
    @Getter @Setter @Column (name = "name_hobbies")
    private String name_hobbies;
    
    @Getter @Setter @Column (name = "url_photo_hobbies")
    private String url_photo_hobbies;
    
    
    
    
}
