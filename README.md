# AJAX Web Application Automation Testing

A hands-on **Selenium WebDriver automation project** focused on testing AJAX-driven and dynamically updated web applications.

This project demonstrates practical automation techniques for handling **asynchronous UI interactions, dynamic elements, AJAX requests, synchronization challenges, and frequently changing page content** without relying unnecessarily on fixed delays.

The scenarios are designed around common workflows found in **e-commerce and enterprise web applications**.

---

## 🎯 Project Overview

Modern web applications frequently update individual page components without performing a complete page refresh.

This project focuses on automating such scenarios reliably using **Java + Selenium WebDriver + TestNG**, with particular attention to synchronization and dynamic element handling.

### Key Areas Covered

* AJAX-based interactions
* Dynamically loaded elements
* Auto-suggestions
* Dynamic dropdowns
* Dependent dropdowns
* Dynamic tables
* Product search and filtering
* Sorting and dynamic results
* Add-to-cart workflows
* Dynamic price and quantity updates
* Loading indicators
* Partial page updates
* Alerts and notifications
* Dynamic forms
* Multi-step workflows
* Explicit waits and synchronization

---

## 🛒 E-Commerce Automation Scenarios

The project includes automation scenarios representing common e-commerce workflows:

* Product search
* Search suggestions
* Product filtering
* Product sorting
* Product selection
* Add product to cart
* Remove product from cart
* Update product quantity
* Validate cart contents
* Validate dynamic price updates
* Checkout-related workflows
* Handling dynamically refreshed product information

### Example Flow

```text
Open Application
       ↓
Search Product
       ↓
Wait for AJAX Suggestions
       ↓
Select Product
       ↓
Apply Filter
       ↓
Wait for Dynamic Results
       ↓
Select Product
       ↓
Add to Cart
       ↓
Validate Cart Update
```

---

## 🏢 Enterprise Application Scenarios

The project also covers dynamic interactions commonly encountered in enterprise applications:

* Login and authentication flows
* Dynamic forms
* Dependent dropdowns
* Dynamic tables
* Search and filtering
* Form validation
* Notifications
* Multi-step workflows
* Loading and asynchronous elements

These scenarios help build practical experience with UI behavior where elements may appear, disappear, or change based on user actions or backend responses.

---

## ⏳ AJAX & Synchronization Handling

A major focus of this project is **reliable synchronization with asynchronous web elements**.

Instead of depending heavily on `Thread.sleep()`, the automation uses appropriate Selenium synchronization techniques to wait for application conditions.

### Synchronization scenarios include:

* Waiting for an element to become visible
* Waiting for an element to become clickable
* Waiting for an element to disappear
* Waiting for dynamic content to load
* Waiting for text or values to change
* Handling AJAX-related loading indicators
* Synchronizing interactions with dynamically rendered elements

### Example

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement searchResult = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'search-result')]")
        )
);

searchResult.click();
```

This approach helps reduce flaky tests caused by timing and asynchronous rendering issues.

---

## 🛠️ Technology Stack

| Technology             | Purpose                                 |
| ---------------------- | --------------------------------------- |
| **Java**               | Automation programming language         |
| **Selenium WebDriver** | Browser automation                      |
| **TestNG**             | Test execution and organization         |
| **Maven**              | Build and dependency management         |
| **XPath**              | Dynamic element identification          |
| **CSS Selectors**      | Element location                        |
| **JavaScript**         | Supporting dynamic browser interactions |
| **Git / GitHub**       | Version control                         |

---

## 🧩 Automation Concepts Demonstrated

This project provides hands-on practice with:

* Selenium WebDriver
* WebElement interactions
* XPath
* CSS Selectors
* Explicit Waits
* Expected Conditions
* Dynamic elements
* AJAX-driven UI
* Asynchronous page updates
* Browser synchronization
* Page Object Model
* TestNG
* Reusable automation components
* Data-driven test concepts
* Reliable UI automation practices

---

## 📂 Project Structure

```text
AjaxCalls/
│
├── src/
│   └── main/
│       └── java/
│           └── ...
│
├── pom.xml
├── .gitignore
└── README.md
```

> The repository structure may evolve as additional automation scenarios and framework components are added.

---

## 🚀 Getting Started

### Prerequisites

Make sure the following are installed:

* Java JDK
* Maven
* Git
* A supported web browser
* IDE such as IntelliJ IDEA or Eclipse

### Clone the Repository

```bash
git clone https://github.com/Kartikahalawat/AjaxCalls.git
```

### Navigate to the Project

```bash
cd AjaxCalls
```

### Install Dependencies

```bash
mvn clean install
```

### Execute Tests

```bash
mvn test
```

---

## 🧪 Automation Approach

The project follows a practical automation approach:

```text
Identify Dynamic Behavior
          ↓
Identify Stable Locators
          ↓
Define Synchronization Strategy
          ↓
Automate User Interaction
          ↓
Validate Dynamic Response
          ↓
Execute Through TestNG
          ↓
Analyze Test Result
```

The focus is not simply on locating elements, but on creating automation that can reliably interact with applications whose UI changes asynchronously.

---

## 🎯 Learning Objectives

This project is intended to strengthen practical understanding of:

1. **Selenium WebDriver automation**
2. **Dynamic locator strategies**
3. **XPath and CSS selectors**
4. **Explicit waits and synchronization**
5. **AJAX-based UI behavior**
6. **Dynamic web elements**
7. **Page Object Model**
8. **TestNG test execution**
9. **Reusable automation code**
10. **Handling real-world synchronization challenges**

---

## 📌 Project Goal

The primary goal is to develop practical expertise in automating **dynamic, AJAX-heavy web applications** and handling the synchronization problems commonly encountered in real-world Selenium automation.

> **Focus:** Build reliable UI automation that remains synchronized with dynamically changing application behavior.

---

## 👨‍💻 Author

**Kartik Ahalawat**

SDET / Test Automation Engineer
Java | Selenium | Playwright | API Testing | SQL | CI/CD

GitHub: [Kartik Ahalawat](https://github.com/Kartikahalawat)

---

## ⭐ Future Improvements

Planned improvements may include:

* More Page Object Model implementations
* Advanced reusable wait utilities
* Data-driven testing
* Cross-browser execution
* Parallel test execution
* Extent/Allure reporting
* Selenium Grid execution
* CI/CD integration with Jenkins
* API validation alongside UI workflows
* Additional enterprise application scenarios

---

## 📄 License

This project is intended for **learning, practice, and demonstration of web automation concepts**.
