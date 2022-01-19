package com.nttdatadesafio.nttdatadesafio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "entry")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EntryModel {

    @Id
    @Column(name = "entry_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String type;
    private String amount;
    private String date;
    private Boolean paid;
    private Long categoryId;

}
