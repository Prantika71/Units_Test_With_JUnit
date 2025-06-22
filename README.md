# Automated Testing Projects with JUnit and Selenium

 This repository contains three automated test cases implemented using Java, Selenium, and JUnit:

 **1.** [**Webform Automation for Digital Unite**](https://www.digitalunite.com/practice-webform-learners)<br>
**2.** [**Guest Registration Automation for WP Everest**](https://demo.wpeverest.com/user-registration/guest-registration-form/)<br>
**3.** [**Web Scraping Data for DSEBD Stock Prices**](https://dsebd.org/latest_share_price_scroll_by_value.php)


## **Content**
- [Project Description](#project-description)
  - [Webform Automation for Digital Unite](#Webform-Automation-for-Digital-Unite)
  - [Guest Registration Automation for WP Everest](#Guest-Registration-Automation-for-WP-Everest)
  - [Web Scraping for DSEBD Stock Prices](#Web-Scraping-for-DSEBD-Stock-Prices)
- [Tools & Technologies](#Tools-&-Technologies)
- [Prerequisites](#Prerequisites)
- [How To Run This?](#How-To-Run-This?)
- [Project Reports](#Project-Reports)


## Project Description

### 1. Webform Automation for Digital Unite
Automates the form submission process:
- Fills in the required fields.
- Uploads a file (≤ 2 MB).
- Validates the success message upon submission.

 ### 2. Guest Registration Automation for WP Everest
 Automates the guest registration process:
 - Completes all mandatory fields.
 - Submit the form.
 - Verifies successful registration.

 ### 3. Web Scraping for DSEBD Stock Prices
 Automates stock market data extraction:
 - Scrapes stock table data from the DSEBD website.
 - Prints all cell values.
 - Stores the data in a text file for further reference

## 🛠️ Technologies Used

| Tool                | Purpose                         |
|---------------------|----------------------------------|
| Java                | Programming language             |
| JUnit               | Unit testing framework           |
| Selenium WebDriver  | Browser Automation           |
| IntelliJ IDEA       | Integrated development environment |
| Gradle              | Project & dependency build management   |

---

## 🔧 Prerequisites

Before running this project, make sure the following are properly set up on your system:

- **Java Development Kit (JDK) 8 or higher**  
  Required to compile and run Java test classes.

- **Supported Web Browser (e.g., Chrome, Firefox)**  
  Used for executing browser-based tests.

- **WebDriver Binary (ChromeDriver or GeckoDriver)**  
  Must match the version of your installed browser.  
  - [Download ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)
  - [Download GeckoDriver](https://github.com/mozilla/geckodriver/releases)

## 🚀 How To Run This?
1. Clone the repository:
   ```bash
   git clone https://github.com/Prantika71/Units_Test_With_JUnit.git
2. Open the Project in any IDE
3. Add Dependency in the build.gradle file and reload gradle from the top right
   - Dependencies Add:
     - [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.33.0)
4. Verification
   - For the web forms:
      - Check the assertion logs for success or failure messages.
   - For the table scraping:
      - Verify the console output and the generated text file (e.g., store.txt).
5. Output Files
   - Logs: Test results and execution details are logged in the console.
   - Text File: Scraped table data is stored in store.txt.


## Project Reports
### 1. Webform Automation for Digital Unite
- Automated field inputs.
- Implemented file upload functionality.
- Asserted the expected success message: "Thank you for your submission!".
#### Report
![image](https://github.com/user-attachments/assets/b2bf1702-8e46-49f3-b622-ec95a9982e42)

### 2. Guest Registration Automation for WP Everest
- Automated field inputs for First Name, Last Name, Email, Password, Gender, DOB, Nationality, Phone, Country, and acceptance of Terms & Conditions.
- Asserted the expected success message: "User successfully registered.!".
#### Report 
![image](https://github.com/user-attachments/assets/a6f59fd1-f330-422d-96df-3b8eab527c42)


### 3. Web Scraping for DSEBD Stock Prices
- Scraped table data from the provided webpage using Selenium.
- Printed all table cell values in the console.
- Stored the scraped data into a text file for reference. 
#### Report
![image](https://github.com/user-attachments/assets/b1b8121b-38d4-4acb-863f-623863fd2ead)

#### Text File
![image](https://github.com/user-attachments/assets/f10ce7e4-3332-474c-a9f0-4772b1cc9cf3)





