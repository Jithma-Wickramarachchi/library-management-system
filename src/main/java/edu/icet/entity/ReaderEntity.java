package edu.icet.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "reader")
public class ReaderEntity {
    @SequenceGenerator(name = "readerSequence", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "readerSequence")
    private Long readerId;
    private String name;
    private String nic;
    private String contact;
    private String address;
}
