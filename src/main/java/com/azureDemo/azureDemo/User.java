package com.azureDemo.azureDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_obj")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

      @Id
      @GeneratedValue
      private int id;
      private String name;
      private String email;

}
