Feature: Test Hello World from Sample Spring Application

@Hello
Scenario: Test Hello World from Sample
    Given url 'http://localhost:8080'
    And path '/hello'
    When method GET
    Then status 200

@HelloWorld
Scenario: Test Hello World from Sample
    Given url 'http://localhost:8080'
    And path '/helloWorld'
    When method GET
    Then status 200
