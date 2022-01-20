package com.nttdatadesafio.nttdatadesafio.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_ENTRY")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EntryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "entry_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
    private String type;
    private String amount;
    private String date;
    private Boolean paid;

    @ManyToOne
    @JoinColumn(name="category", referencedColumnName = "id")
    private CategoryEntity category;

}
