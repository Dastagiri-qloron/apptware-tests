/** This class is expected to be immutable. Please make necessary changes. */
package com.apptware.interview.immutability;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public final class Student {
  private final String name;
  private final Date dateOfBirth;
  private final List<String> courses;

  public Student(String name, Date dateOfBirth, List<String> courses) {
    this.name = name;
    this.dateOfBirth = new Date(dateOfBirth.getTime());
    this.courses = new ArrayList<>(courses);
  }

  // Returning a copy of the dateOfBirth
  public Date getDateOfBirth() {
    return new Date(dateOfBirth.getTime());
  }

  // Returning a copy of the Courses list
  public List<String> getCourses() {
    return new ArrayList<>(courses);
  }
}

