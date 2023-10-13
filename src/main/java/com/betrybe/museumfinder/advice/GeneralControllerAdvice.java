package com.betrybe.museumfinder.advice;

import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/** ControllerAdvice. */
@ControllerAdvice
public class GeneralControllerAdvice {

  /** InvalidCoordinateException. */
  @ExceptionHandler(InvalidCoordinateException.class)
  public ResponseEntity<String> handleInvalidData(InvalidCoordinateException e) {
    return ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .body(e.getMessage());
  }

  /** MuseumNotFoundException. */
  @ExceptionHandler(MuseumNotFoundException.class)
  public ResponseEntity<String> handleNotFound(MuseumNotFoundException e) {
    return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(e.getMessage());
  }

  /** InternalErrorException. */
  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<String> handleInternalError() {
    return ResponseEntity
        .status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body("Erro interno!");
  }
}
