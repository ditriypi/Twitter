Feature: I want to test the login page


  Scenario: login with valid credentials
  Given We go to the login page
  When  We enter 'Ilnnn3' in the login field
  And  We enter 'tME969Tkx4' in the password field
  And We press log in button
  Then We got to the main page





  Scenario:Send message
    Given We go to the  main Page

##Scenario Outline:
 # Given We go to the login page
#  When  We enter <login> in the login field
#  And We enter <password> in the password field
#  And We press log in button
#  Then  We do not see the link

 # Examples:
  #  |login   |password    |
  #  |'Ilnnn3'|            |
  #  |        |'tME969Tkx4'|
  #  | 'vsdv' |  '1234'    |