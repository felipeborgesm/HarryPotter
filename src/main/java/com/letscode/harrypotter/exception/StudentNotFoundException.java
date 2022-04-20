package com.letscode.harrypotter.exception;

public class StudentNotFoundException extends RuntimeException {
  public StudentNotFoundException(Long id) {
    super("O Id" + id + " não foi encontrado");
  }
}
