
package com.PDS.PDS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table ( name = ("skills"))
public class SkillModel {
    
    @Id
    @Getter @Setter @Column (name = "id_skill")
    private int id_skill;
    
    @Getter @Setter @Column (name = "name_skill")
    private String name_skill;
    
    @Getter @Setter @Column (name = "percentage_skill")
    private int percentage_skill;
    
    
}
