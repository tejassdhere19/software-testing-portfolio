# ShopQ — E-Commerce QA Automation Portfolio

An original demo storefront and Java + Selenium + TestNG UI automation suite.

## Stack
- App: HTML, CSS, vanilla JavaScript
- Automation: Java 17+, Selenium WebDriver, TestNG, Maven
- Pattern: Page Object Model (POM)

## Run the app
From the project root:
```bash
python -m http.server 8000
```
Open http://localhost:8000/app/

## Run automation
Keep the server running. In a second terminal:
```bash
cd automation
mvn test
```
Requires Java 17+, Maven, Chrome, and internet access for the first Maven dependency download. Selenium Manager can resolve the browser driver in most standard setups.

## Coverage
Product catalogue, search, add to cart, quantity update, checkout validation, order confirmation.

This is a demo/portfolio app, not a production store. Test results must come from actual execution.
