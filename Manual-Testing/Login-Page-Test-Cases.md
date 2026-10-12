# Login Page Test Cases

## 1. Objective
To verify that the login page works correctly for valid and invalid user inputs.

## 2. Preconditions
- The login page is accessible.
- A valid test account is available for positive login testing.

## 3. Test Cases

| Test Case ID | Test Scenario | Test Steps | Expected Result |
|---|---|---|---|
| TC_LOGIN_001 | Valid login | Enter valid username and password; click Login | User should log in successfully |
| TC_LOGIN_002 | Invalid password | Enter valid username and incorrect password | An appropriate error message should appear |
| TC_LOGIN_003 | Invalid username | Enter an invalid username and password | Login should be rejected |
| TC_LOGIN_004 | Empty fields | Leave username and password empty; click Login | Required-field validation should appear |
| TC_LOGIN_005 | Empty password | Enter username and leave password empty | Password validation should appear |
| TC_LOGIN_006 | Empty username | Leave username empty and enter password | Username validation should appear |
| TC_LOGIN_007 | Password masking | Enter a password | Password characters should be masked by default |
| TC_LOGIN_008 | Login using Enter key | Enter credentials and press Enter | Login should be triggered if supported |
| TC_LOGIN_009 | Multiple failed attempts | Submit incorrect credentials repeatedly | Expected security controls should work according to requirements |
| TC_LOGIN_010 | Logout and login again | Log in, log out, and attempt login again | Login should work according to the application's requirements |

## 4. Notes
- These are sample test cases for practice.
- Expected results should be confirmed against the application's actual requirements.
- No live application has been tested as part of this document.
