Feature: gmail Login

@regression
  Scenario: gmail valid credential  
    Given User Launch application 
    When User enters valid username and password
    |username|password|
    |v.vinothmar26@gmail.com|vnothrusty|
    Then User logout the application
 
  #Scenario: gmail invalid credential  
    #Given User Launch application 
    #When User enters Invalid username and password
    #|username|password|
    #|vinoth|vnoth@123|
    #Then User Validate Error Message
    #
#Scenario: gmail empty credential  
    #Given User Launch application 
    #When User enters Invalid username and password
    #|username|password|
    #|||
    #Then User Validate Error Message
 #
 @sanity
 Scenario Outline: gmail credentials
    Given User Launch application 
    When User enters valid "<username>" and "<password>"
    Then User close browser
   Examples:
   |username|password|
   |vinoth|rustee|
   |vikki|wickie|
 