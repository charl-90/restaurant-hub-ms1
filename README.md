
# Restaurants Hub 
Restaurant hub is a go to platform for the public to place food orders from variety of restaurant brands all over the UK. 
Designed with simplicity to offers a browsing experience, allowing to place food effortlessly and gets it delivered to their doorsteps. It also has the ability for collection. Start your food delivery or collection order today from Restaurants hub. We are food delivery service that connects you with the best local restaurants in your area. Whether you're craving a juicy burger, spicy jollof rice, or crispy fried chicken, we've got you covered. Our easy-to-use platform allows you to browse menus, place orders, and track your delivery in real-time. With Restaurants Hub, you can enjoy delicious meals from the comfort of your home.

Visit The Spoon right here: https://charl-90.github.io/restaurant-hub-ms1/gallery.html 



<!-- TOC -->
# Table of Content

- [Restaurants Hub](#restaurants-hub--the-spoon)
- [Project Goals](#project-goals)
- [Design Layouts](#design-layouts)
- [Icons](#icons)
- [Color Choices](#color-choices)
- [Feature Layouts](#feature-layouts)
- [Landing Page](#landing-page)
- [Gallery](#gallery)
- [Sign Up](#sign-up)
- [About Us](#about-us)
- [Contact Us](#contact-us)
- [Technologies Used](#technologies-used)
- [Testing](#testing)
- [Test Artifacts](#test-artifacts)
- [Performance Testing](#performance-testing)
- [CI/CD Pipeline](#cicd-pipeline)


# Project Goals
  
As a user on Restaurant hub website, I am expected to be able to browse a restaurant of my choice.  
I should be able to place a food order effortlessly and gets it delivered to my doorsteps. I should also be able to place order for collection.  
As a user visiting the Restaurant hub website for the first time, I should be able to register as a new user.
I should have ability to read the terms and conditions as well as the privacy policy.

# Requirement Specification  
 Requirement specification (SRS) is a formal document that details a software project's purpose, behaviour, features, and performance criteria. It serves as a comprehensive blueprint and a communication tool for the business and all stakeholders, including clients, developers, and testers, to ensure everyone has a shared understanding of the final product. A good SRS minimizes miscommunication, reduces rework, and provides a solid foundation for estimating costs, timelines, and testing.

# User Experience (UX)
# Users Stories 1
As a user visiting the Restaurant hub website. I will like the ability to be able to register and place my orders, book for home deliveries or pick-up collections.
* Given I am a new user, I will want to sign up.
* When I fill in the sign-up form
* And I click the submit botton.
* Then I should be taken to a Congratulations! page telling me the registration was successful. 


# Users Stories 2
* Given I am a new user,
* And would like to see the images of menu I can order from.
* When I click on the gallery page
* Then I should see different menu available to order from.

# Users Stories 3
* Given I am a new user, I will want to place an order for a home delivery.
* When I order food from any restaurant of my choice
* Then I should get the food delivered to my doorstep.

* Given I am a new user, I will want to place an order for collection.
* When I order food from any restaurant of my choice
* Then I should be able to collect the food from the restaurant.


# Font 
- Google Fonts (https://fonts.google.com/specimen/Open+Sans)
- kit.fontawaesome.com

    - The sans-serif font I used is known for its bold and uppercase letters, offering a strong and modern look to websites.


# Design / Feature Layouts:
- Restaurant hub | The Spoon offers a variety range of meals from different demographic settings to users. User experience with simple layouts enabling quick access to users. The gallery page provides various dishes a user can see and choose from.

# Landing Page
This page will provide a welcoming feel to the user with available links of where to go.

![alt text](assets/css/images/homepage.png)

# Gallery
User should be able to see some of the amazing and delicious meals available

![alt text](assets/css/images/gallery.png)


# Sign Up
User should be able to register when they first visit the website.
Sign uo form should be clear and easy for fill in.

![alt text](assets/css/images/signup.png)

# Technologies Used
- Html
- css 
- GitHub
- Git Bash



# Testing
# Testing User Stories from User Experience (UX) Section in Behaviour Driven Approach
# Users Stories 1
As a user visiting the Restaurant hub website. I will like the ability to be able to register and place my orders, book for home deliveries or pick-up collections.
* Given I am a new user, I will want to sign up.
* When I fill in the sign-up form
* And I click the submit button.
* Then I should be taken to a Congratulations! page telling me the registration was successful. 


![alt text](assets/css/images/signup.png)

# Users Stories 2
* Given I am a new user,
* And would like to see the images of menu I can order from.
* When I click on the gallery page
* Then I should see different menu available to order from.
![alt text](assets/css/images/gallery.png)

# Users Stories 3
* Given I am a new user, I will want to place an order for a home delivery.
* When I order food from any restaurant of my choice
* Then I should get the food delivered to my doorstep.

![alt text](assets/css/images/homepage.png)
 


* Given I am a new user, I will want to place an order for collection.
* When I order food from any restaurant of my choice
* Then I should be able to collect the food from the restaurant.

- Manuel Testing (Test Activities)
- Test Case 
    - Set of test steps, test conditions, and expected results used to verify that a specific feature of a software application functional specifications are correct and meets the functional requirements. It's a detailed documentation that provides step-by-step instructions for a tester to follow, including prerequisites, input data, and the expected results. The main purpose is to check that the software behaves as expected, uncover defects / bugs, and ensure it performs as intended. Test Cases also provides the ability to ensure that the final products meets the functional requirements, user accessibility, useability and responsiveness across multiple platforms. 

     # Test Case ID181025:
     - Test to validate that new user is able to register and submit a form.
     - Test to verify that the input fields for first name accepts only letters

     - Test to verify that the input fields for last name accepts only letters

     - Test to verify that the input fields for first name does not accepts numbers

     - Test to verify that the input fields for last name does not accepts number

     - Test to ensure that the input fields for first name does not accepts special character 

     - Test to ensure that the input fields for last name does not accepts special character
     - Test the validate the gallery page contains 12 different types of food images
     - Ensure that footers are available on the Gallery Page
     - Ensure users can see "Restaurant Hub" on the Gallery Page
     - Ensure users can see the "Welcome to Restaurant Hub" on the Home Page
     - Ensure users can see "Restaurant Hub" on the Home page
     - Ensure that footers icons are available on the Home Page
     - Test to verify that a beef burger image is visible on the Home Page


    
# Test Scripts
   -  The Test scripts will provide a set of instructions that will be performed on the system under testing to ensure that the system functions as expected and fit for purpose. 

 | Test Steps | Expected Result |
 |:-----------|:----------------|
 |Go to URL : https://charl-90.github.io/restaurant-hub-ms1/index.html   |Website opens, user taken to the landing page|
 |Visually verify that the landing page image is in the centre| Image is in the centre of the page
 |
 |Go to URL : https://charl-90.github.io/restaurant-hub-ms1/index.html   |Website opens|
 |Click on the Sign up link| Sign-up form opens|
 |Provide first name, last name, password, email and click submit button  | User should be taken to a I Congratulations! page |
 |
 |Go to URL : https://charl-90.github.io/restaurant-hub-ms1/index.html   |Website opens|
 |Click on the Home Page Link | Home Page Pages
 |Visually verify that the gallery page image displays correctly| Images are clearly displayed

# Validators 

The W3C Markup Validator and W3C CSS Validator Services were used to validate every page of the project to ensure there were no syntax errors in the project.

- W3C Markup Validator   https://jigsaw.w3.org/css-validator/ - Results

![alt text](assets/css/images/markupvalidator.png)

- W3C CSS Validator  https://validator.w3.org/ - Results
![alt text](assets/css/images/jigsawvalidator.png)

# Lighthouse Testing 
- https://pagespeed.web.dev/
- Mobile 
![alt text](assets/css/images/lighthousetestingmobil.png)

- Desktop
![alt text](assets/css/images/lighthousetestingdesktop.png)
  
     

#  Testing Tools
- VS Code

# Test Artifacts
- Test Report

# Deployment
- GitHub Pages
The project was deployed to GitHub Pages using the following steps...

Log in to GitHub and locate the GitHub Repository
At the top of the Repository (not top of page), locate the "Settings" Button on the menu.
Alternatively Click Here for a GIF demonstrating the process starting from Step 2.
Scroll down the Settings page until you locate the "GitHub Pages" Section.
Under "Source", click the dropdown called "None" and select "Master Branch".
The page will automatically refresh.
Scroll back down through the page to locate the now published site link in the "GitHub Pages" section.

# Forking the GitHub Repository
By forking the GitHub Repository, we make a copy of the original repository on our GitHub account to view and/or make changes without affecting the original repository by using the following steps...

Log in to GitHub and locate the GitHub Repository
At the top of the Repository (not top of page) just above the "Settings" Button on the menu, locate the "Fork" Button.
You should now have a copy of the original repository in your GitHub account.

# Making a Local Clone
Log in to GitHub and locate the GitHub Repository
Under the repository name, click "Clone or download".
To clone the repository using HTTPS, under "Clone with HTTPS", copy the link.
Open Git Bash
Change the current working directory to the location where you want the cloned directory to be made.
Type git clone and then paste the URL you copied in Step 3.
$ git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY

Press Enter. Your local clone will be created.

$ git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY
- Cloning into `CI-Clone`...
- remote: Counting objects: 10, done.
- remote: Compressing objects: 100% (8/8), done.
- remove: Total 10 (delta 1), reused 10 (delta 1)
- Unpacking objects: 100% (10/10), done.




**Libaries**
- kit.fontawaesome.com,
- Google font style
- Bootstrap

# References 
- https://fontjoy.com/
- https://validator.w3.org/#validate_by_input+with_options
- https://jigsaw.w3.org/css-validator/validator

 

