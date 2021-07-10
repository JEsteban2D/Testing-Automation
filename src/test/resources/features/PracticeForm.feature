Feature: Practice Form

  @regression
  Scenario: Form successful
    Given that a web user wants to form in ToolsQA
    When all the fields are filled
    Then he should see the confirmation window


  @smokeTest
  Scenario: Form successful with excel
    Given that a web user wants to form in ToolsQA with excel
    When all the fields are filled with excel
    Then he should see the confirmation window with excel

  @smokeTest2
  Scenario: Form successful with confiproperties
    Given that a web user wants to form in ToolsQA with confiproperties
    When all the fields are filled with confiproperties
    Then he should see the confirmation window with confiproperties
