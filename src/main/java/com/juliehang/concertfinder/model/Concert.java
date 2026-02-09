package com.juliehang.concertfinder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity // tells JPA that this is a DB table
@Table(name = "concerts") // table is named "concerts"
@Data // lombok generates getters, setters, toString etc.
@NoArgsConstructor
@AllArgsConstructor
public class Concert {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String venue;
    
    @Column(nullable = false)
    private LocalDateTime date;
    
    private String price;
    
    @Column(length = 1000)
    private String url;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}