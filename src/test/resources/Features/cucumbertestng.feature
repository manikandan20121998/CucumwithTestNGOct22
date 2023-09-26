@E2E
Feature: To validate the login functionality of facebook application

Background:
Given The user should be in facebook page


@smoke @regression @tc1
Scenario Outline: Invalid login-To validate the login with invalid credentials
When The user has enter the "<username>" and "<password>"
And The user has to click the "login" button
Then The user should be in invalid login page

Examples:
   |username|password|
   |mani    |   maddy|