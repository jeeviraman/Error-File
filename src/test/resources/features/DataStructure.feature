@Datastrure_intro
Feature: The User launch the DSalgo portal and test the Datastructures introduction page

   @TS_DataStructure01
   Scenario: The user launches the DSalgo portal
   Given The user is on the Dsalgo portal
   And   user clicks signin link
   When  user gives valid "username" and "password"
   Then  user is redirected to Home page
    

  @TS_DataStructure02
  Scenario: The user is able to navigate the Datastructure Introduction page
    Given   The user is in Home page
    When    The user clicks on "Get Started" button on Data Structure Introduction link
    Then The user is directed to Data Structure Introduction page

   @TS_DataStructure03
   Scenario: The user is able to navigate the Time complexity page
    Given The user is in Data structure Introduction page
    When The user clicks on "Time complexity" button on Data Structure Introduction link
    Then The user is redirected to Time complexity page
    
 @TS_DataStructure04
   Scenario: The user is able to navigate the Try here button on Time complexity page
    Given The user is in Time complexity Introduction page
    When The user clicks on "Try here" button on Time complexity page
    Then The user is redirected to a  tryEditor page

    
 @TS_DataStructure05
   Scenario: The user is able run code in tryEditor for Time Complexity page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor page
    And The user clicks on run button
    Then The user should be presented with Run result
    
    @TS_DataStructure06
     Scenario: The user is presented with error message for  invalid syntax 
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor 
    And The user clicks on run button
    Then The user should be presented with error message
    
    @TS_ReturnHomepage07
    Scenario: The user is returing to home page
    Given: The user is in the DS Time complexity page
    When: The user clicks Dsalgo url "https://dsportalapp.herokuapp.com/home"
    Then: The user is redirected to Dsalgo Home page
    
    
    
    