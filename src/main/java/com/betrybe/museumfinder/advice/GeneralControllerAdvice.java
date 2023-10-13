package com.betrybe.museumfinder.advice;

import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/** ControllerAdvice. */
@ControllerAdvice
public class GeneralControllerAdvice {
  @ExceptionHandler({ InvalidCoordinateException.class })
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String handleInvalidData(RuntimeException exception) {
    return exception.getMessage();
  }

  @ExceptionHandler({ MuseumNotFoundException.class })
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String handleNotFound(RuntimeException exception) {
    return exception.getMessage();
  }

  @ExceptionHandler({ RuntimeException.class })
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String handleInternalError() {
    return "Erro interno!";
  }
}
