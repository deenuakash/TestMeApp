Feature: Test Login
-Description (optional): Registered user login to test app using proper credentials
-Pre-Requisite: Registration module should be completed
Example Mapping:

Business Rule1:Signin Link
Acceptance Criteria:Registered
@case1
Scenario: Login with valid credentials
Given user opens chrome browser And enter url
When user enter username And password
When user clicks login button
Then verify result
@case2
Scenario:Login with invalid credentials
Given user opens chrome browser And enter url
When user enter invalid username And password
When user clicks login button
Then verify result