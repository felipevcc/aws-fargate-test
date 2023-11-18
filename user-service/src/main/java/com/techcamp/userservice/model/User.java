package com.techcamp.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "USER")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long userId;

  @Column(name = "name", length = 45)
  private String name;

  @Column(name = "username", length = 20)
  private String username;

  @Column(name = "password", length = 45)
  private String password;

  @Column(name="phone_number", length = 20)
  private String phoneNumber;

  @Column(name="email", length = 100)
  private String email;
}
