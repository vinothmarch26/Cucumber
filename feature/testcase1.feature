Feature: Gmail Login
  
  @Regression @home
  Scenario: valid the username and password
    Given User Launch the Application
    When User enter the Username and password
    Then User close the Application
 
 
 @Sanity @logout
  Scenario: valid the username and password
    Given User Launch the Application
    When User enter the Username and password and designation
         |username|password|designation|
         |vinoth|rustee|tester|
         |rustee|fail|busy|
    Then User close the Application
 
 
 
 @Regression @Sanity
  Scenario Outline: Enter all the username and password
    Given User Launch the Application 
    When User enter "<username>" and "<password>" 
    Then User close the Application

    Examples: 
      | username  | password  |
      | vinoth | success |
      | rustee | Fail    |
