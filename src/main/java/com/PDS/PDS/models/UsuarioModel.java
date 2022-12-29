
package com.PDS.PDS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "developer")
public class UsuarioModel {
    
    @Getter @Setter @Column (name = "id")
    @Id
    private int id;
    
    @Getter @Setter @Column (name = "name")
    private String name;
    
    @Getter @Setter @Column (name = "title")
    private String title;
    
    @Getter @Setter @Column (name = "presentation")
    private String presentation;
    
    @Getter @Setter @Column (name = "url_photo")
    private String url_photo;
    
    @Getter @Setter @Column (name = "url_banner")
    private String url_banner;
    
    @Getter @Setter @Column (name = "url_logo_argProg")
    private String url_logo_argProg;
    
    @Getter @Setter @Column (name = "location")
    private String location;
    
}
