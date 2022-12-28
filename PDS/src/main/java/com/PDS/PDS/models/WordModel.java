
package com.PDS.PDS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table ( name = "word_exp")
public class WordModel {
    
    @Id
    @Getter @Setter @Column ( name = "id_word")
    private int id_word;
    
    @Getter @Setter @Column ( name = "name_business")
    private String name_business;
    
    @Getter @Setter @Column ( name = "job")
    private String job;
    
    @Getter @Setter @Column ( name = "chores")
    private String chores;
    
    @Getter @Setter @Column ( name = "duration")
    private String duration;
    
    @Getter @Setter @Column ( name = "url_photo_business")
    private String url_photo_business;
    
    
    
}
