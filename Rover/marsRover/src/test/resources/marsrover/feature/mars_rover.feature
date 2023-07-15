Feature: Mars Rovers
 
  Scenario Outline: login to the YT using ch
  Given I have logged in using browser <browser>
  Given I search for channel "Forty3 Stories"
  Then I click video <keyword>
  #Then I close all browsers
  Examples:
  | browser  |  keyword   |
  | "chrome" | "#forest"  |
  | "chrome" | "cream"  |
  
  