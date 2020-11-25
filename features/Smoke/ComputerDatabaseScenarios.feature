
Feature: Computer Database Scenarios

  Background: URL Launch
    Given I navigate to the "http://computer-database.herokuapp.com/computers" URL
    And I verify that main header "Play sample application — Computer database" is displayed after logging in


  Scenario Outline: TC_F_03: Create a New Computer
    Then I click on the "Add a new computer" link
    Then I verify page subheader "Add a computer"
    Then I fill up the Computer details "<ComputerName>", "<IntroducedDate>", "<DiscontinuedDate>" and "<Company>"
    Then I click on the "Create this computer" button
    Then I verify that alert "Done! Computer <ComputerName> has been created" is displayed
    Then I search for "<ComputerName>"
    Then I verify page subheader "One computer found"
    Then I click on the record that contains "<ComputerName>"
    Then I verify that "<ComputerName>" details "<IntroducedDate>", "<DiscontinuedDate>" and "<Company>" are retrieved

    Examples:
    | ComputerName | IntroducedDate | DiscontinuedDate | Company    |
    | Rasool       | 1990-09-09     | 2000-09-09       | Apple Inc. |


  Scenario Outline: TC_F_09: Delete a Computer
    Then I search for "<ComputerName>"
    Then I verify page subheader "One computer found"
    Then I click on the record that contains "<ComputerName>"
    Then I click on the "Delete this computer" button
    Then I verify that alert "Done! Computer has been deleted" is displayed
    Then I search for "<ComputerName>"
    Then I verify page subheader "No computers found"
    Then I verify that table displays message "Nothing to display"

    Examples:
      | ComputerName |
      | Rasool |




