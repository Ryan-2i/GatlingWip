@Gatling @all
Feature: Gatling simulation example
  Description: Basic performance testing against a Gatling provided website

  Scenario: Performing a Gatling simulation on the Gatling website
    Given I execute the Gatling simulation with "1" users and "5" second ramp up time

