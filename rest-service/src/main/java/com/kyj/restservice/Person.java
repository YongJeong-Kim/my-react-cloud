package com.kyj.restservice;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Person {
  @Id
  private Long id;
  private String name;
}
