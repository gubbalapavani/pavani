Feature: Test for google application

  Scenario: Verify title of google page
    Given Browser should open app should launch
    When User captures title of google page
    Then Expected nad Actual title should match
