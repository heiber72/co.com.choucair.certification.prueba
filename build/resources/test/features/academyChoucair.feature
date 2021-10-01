#author: Luis
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy the automation course.
  @scenario1
  Scenario: Search for automation course
    Given than Luis wants to learn automation at the Academy Choucair
    | strUser  | strPassword   |
    | 79918093 | Choucair2021* |
    When he search for the course Foundation Level on the Choucair Academy platform
    | strCourse        |
    | Foundation Level |
    Then he find the course called Foundation Level
    | strCourse        |
    | Foundation Level |