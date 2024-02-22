package com.servermanagement.model;

import com.servermanagement.enumeration.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    @NotEmpty(message = "Ip address cannot be empty or null")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;

    private String imageUrl;
    private Status status;
}
