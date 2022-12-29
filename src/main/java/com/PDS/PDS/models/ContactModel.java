
package com.PDS.PDS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table ( name = "contacts")
public class ContactModel {
    
    @Id
    @Getter @Setter @Column (name = "id_contact")
    private int id_contact;
    
    @Getter @Setter @Column (name = "email_contact")
    private String email_contact;
    
    @Getter @Setter @Column (name = "linkedin_contact")
    private String linkedin_contact;
    
    @Getter @Setter @Column (name = "instagram_contact")
    private String instagram_contact;
    
    @Getter @Setter @Column (name = "discord_contact")
    private String discord_contact;
    
}
