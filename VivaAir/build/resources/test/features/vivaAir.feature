Feature: flight reservation
  As a User
  I want to enter the page www.vivaair.com
  To make a flight reservation


  Scenario: Make the flight reservation with the most economical value
    Given a new user can enter the reservation page
    When make a flight reservation
    Then he can choose the cheapest price