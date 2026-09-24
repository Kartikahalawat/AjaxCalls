# AJAX Web Application Automation Testing

A hands-on **Selenium automation testing project** focused on testing AJAX-based and dynamically loaded web applications.

The repository contains automation scenarios inspired by real-world **e-commerce and enterprise applications**, where page content frequently changes without a full page refresh.

## 🎯 Project Focus

The main purpose of this project is to practice and demonstrate automation of:

* AJAX-based interactions
* Dynamically loaded elements
* Auto-suggestions
* Dynamic dropdowns
* Product search and filtering
* Add to cart and cart updates
* Dynamic tables
* Loading indicators
* Partial page updates
* Alerts and notifications
* Asynchronous page elements
* Wait and synchronization handling

## 🛒 E-Commerce Scenarios

Example scenarios include:

* Product search
* Search suggestions
* Product filtering
* Sorting products
* Product selection
* Add to cart
* Remove from cart
* Quantity updates
* Cart validation
* Dynamic price updates
* Checkout-related workflows

## 🏢 Enterprise Application Scenarios

The project also covers common dynamic interactions found in enterprise applications, such as:

* Login and authentication flows
* Dynamic forms
* Dependent dropdowns
* Dynamic tables
* Search and filtering
* Notifications
* Form validation
* Multi-step workflows
* Loading and asynchronous elements

## ⏳ AJAX & Synchronization

A major focus of the project is handling elements that are loaded or updated asynchronously.

The automation uses appropriate Selenium waits and synchronization techniques instead of relying unnecessarily on fixed delays.

Examples include waiting for:

* Elements to become visible
* Elements to become clickable
* Elements to disappear
* Dynamic content to load
* Text or values to update
* AJAX-related loading indicators to finish

## 🛠️ Technology Stack

* **Java**
* **Selenium WebDriver**
* **TestNG**
* **Maven**
* **Git / GitHub**
* **HTML / CSS / XPath**
* **JavaScript basics**

## 📂 Project Structure

```text
AJAX-Automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │
│   └── test/
│       └── java/
│
├── pom.xml
└── README.md
```

## 🧪 Example Workflow

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
Add Product to Cart
      ↓
Validate Cart Update
```

## 🚀 Learning Objectives

This project helps strengthen practical understanding of:

* Selenium WebDriver
* Locators
* XPath and CSS Selectors
* Explicit Waits
* Dynamic Elements
* AJAX-based UI interactions
* WebElement synchronization
* Page Object Model
* TestNG
* Reusable automation code

## 📌 Project Goal

The goal is to build practical experience in automating **dynamic, AJAX-heavy web applications** and become more comfortable handling the synchronization challenges commonly encountered in real-world Selenium automation.

> **Focus:** Automate the UI reliably, especially when the application updates content dynamically without refreshing the page.
