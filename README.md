# Web Application Login Automation Testing

This repository contains automated tests for a web application's login functionality using both Cypress and Selenium. The tests cover scenarios for successful login, failed login with invalid credentials, and verifying the error message display upon failed login. These tests are integrated into a CI/CD pipeline using GitHub Actions.

## Table of Contents
- [Web Application Login Automation Testing](#web-application-login-automation-testing)
  - [Table of Contents](#table-of-contents)
  - [Technologies Used](#technologies-used)
  - [Test Scenarios](#test-scenarios)
  - [Project Structure](#project-structure)
  - [Setup Instructions](#setup-instructions)
    - [Prerequisites](#prerequisites)
    - [Selenium Tests Setup](#selenium-tests-setup)
    - [Cypress Tests Setup](#cypress-tests-setup)
    - [Running Tests Locally](#running-tests-locally)
  - [CI/CD Integration](#cicd-integration)
    - [GitHub Actions](#github-actions)
  - [Contributing](#contributing)
  - [License](#license)

## Technologies Used
- **Selenium** (Java)
- **Cypress** (JavaScript)
- **GitHub Actions** for CI/CD

## Test Scenarios
1. **Successful Login with Valid Credentials**
2. **Failed Login with Invalid Credentials**
3. **Error Message Display When Login Fails**

## Project Structure
├── cypress
│ ├── e2e
│ │ └── logintest.cy.js
│ ├── fixtures
│ └── support
├── selenium
│ └── src
│ └── test
│ └── java
│ └── orangeLogin.java
├── .github
│ └── workflows
│ └── cypress.yml
│ └── selenium.yml
└── README.md


## Setup Instructions

### Prerequisites
- **Node.js** (for Cypress)
- **Java Development Kit (JDK)** (for Selenium)
- **ChromeDriver** (for Selenium)
- **Maven** (for Selenium)

### Selenium Tests Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/cybernerd4u/automation.testing.git
    cd your-repo-name
    ```

2. Navigate to the Selenium test directory:
    ```bash
    cd selenium
    ```

3. Install dependencies and run the tests:
    ```bash
    mvn clean install
    mvn test
    ```

### Cypress Tests Setup

1. Navigate to the Cypress test directory:
    ```bash
    cd cypress
    ```

2. Install dependencies:
    ```bash
    npm install
    ```

3. Open Cypress test runner:
    ```bash
    npx cypress open
    ```

### Running Tests Locally

- **Selenium Tests**: Run the tests using the Maven command:
    ```bash
    mvn test
    ```

- **Cypress Tests**: Run the tests using the Cypress CLI:
    ```bash
    npx cypress run
    ```

## CI/CD Integration

### GitHub Actions

This project uses GitHub Actions for continuous integration. The workflow file is located in `.github/workflows/cypress.yml && selenium.yml`.

The CI workflow:
- Checks out the repository
- Sets up the Java and Node.js environments
- Installs dependencies for both Selenium and Cypress
- Runs the test suites for both frameworks

## Contributing

Contributions are welcome! Please follow these steps:
1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Open a pull request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

