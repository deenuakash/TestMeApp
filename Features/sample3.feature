Feature: Test with multiple data

Scenario Outline:
Given Enter login page of testmeapp
When enter "<username>" And "<password>"
When click login button
Then verify if it redirects to home page

Examples:
|username|password|
|qwert|y123|
|lalitha|password123|