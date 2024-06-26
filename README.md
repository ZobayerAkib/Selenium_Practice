# Automated Testing 

This repository contains automated tests for a web application using Selenium WebDriver with Java. The tests are designed to perform basic checks on the login functionality and shopping cart operations of the application.

## Test Scenarios

### Task 1: Login Page Check and Navigation
 **https://www.saucedemo.com/** website is used for Test
1. **Login Page Check using ID Locator:**
   - Locate and verify elements on the login page using ID locators.
   
2. **Verify Website Title:**
   - Print the current title of the website using an ID locator.
   - Assert that the actual title matches the expected title.
   
3. **Verify Current URL:**
   - Check the current URL of the page after login.
   - Assert that the current URL matches the expected URL.

### Task 2: Shopping Cart Operations

1. **Navigate to T-Shirt Product Page:**
   - Click on the orange "T-shirt link" using a absolute path.
   
2. **Add Item to Cart:**
   - Click on the "Add to Cart" button to add the item to the shopping cart using a relative path.
   
3. **View Shopping Cart:**
   - Click on the shopping cart badge to view the items in the cart using an absolute path.
   
4. **Continue Shopping:**
   - Click on the "Continue shopping" button to return to the previous page using an relative path.


## Tools Used

- **Selenium WebDriver:** Automation tool for web browsers.
- **Java:** Programming language used for scripting.
- **TestNG or JUnit:** Frameworks for organizing test cases.
- **Assertions:** Used to validate expected outcomes.

## Setup Instructions

1. **Clone the Repository:**  **https://github.com/ZobayerAkib/Selenium_Practice.git**


2. **Install Dependencies:**
- Ensure you have Java Development Kit (JDK) installed.
- Use Maven or Gradle for managing dependencies.

3. **Configure WebDriver:**
- Download the appropriate WebDriver executable (ChromeDriver, GeckoDriver, etc.) and place it in the `/drivers` directory.

4. **Run Tests:**
- Use Maven or Gradle to run the tests, or directly execute the test classes using your IDE.

5. **Review Test Results:**
- After running the tests, review the console output for test results and any assertions that failed.

## Notes

- Update the expected titles and URLs in the test scripts (`TestSeleniumOne.java` and `SeleniumAssignmentTwo.java`) according to your application's actual titles and URLs.
- Ensure all paths (relative and absolute) in the test scripts are correct and match your application's structure.
- Use appropriate annotations and assertions provided by TestNG or JUnit to structure your test cases effectively.
