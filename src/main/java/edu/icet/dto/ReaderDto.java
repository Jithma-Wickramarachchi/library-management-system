package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ReaderDto {
    private Long readerId;
    private String name;
    private String nic;
    private String contact;
    private String address;
}
