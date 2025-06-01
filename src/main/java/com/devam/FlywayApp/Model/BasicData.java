package com.devam.FlywayApp.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
import jakarta.persistence.Id;

@Entity
@Table(name = "basic_data", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class BasicData {

    @Id
    private String uid;
    private String name;
    private String address;
}
