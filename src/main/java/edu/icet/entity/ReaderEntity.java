package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "reader")
public class ReaderEntity {
    @Id
    private String readerId;
    private String name;
    private String nic;
    private String contact;
    private String address;
}
