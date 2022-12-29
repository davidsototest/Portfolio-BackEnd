
package com.PDS.PDS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table ( name = "access")
public class AccessModel {
    
    @Id
    @Getter @Setter @Column (name = "id_access")
    private int id_access;
    
    @Getter @Setter @Column (name = "user")
    private String user;
    
    @Getter @Setter @Column (name = "password")
    private String password;
    
    
}
