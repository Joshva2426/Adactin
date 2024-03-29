# Adactin Hotel e-commerce website

automation test Demo project

Automation Features:

This Selenium Automation Demo Project features Selenium3 WebDriver API in a Page Object Oriented 
Design Pattern. Elements Interactions Includes Forms, TextBoxes, Frames, Alerts, DropDowns, 
Radio Buttons, Links etc. Test Data is provided via Data Provider methods by accessing a Myjava 
or by Accessing Excel Data Files. Random Data generation is also used when Applicable. Other features
include Parallel Execution, Grouping, Robot Calls to perform non Browser Operations, 
Image Recognition and Reporting. 

Framework:

This Selenium Test Automation Demo Project is Page-Object driven, Data driven, and Property driven.
This Hybrid Java Framework features  three layers of Class implementations, Test Classes, Page Classes,
and UtilsKit.

Test Classes : This layer contents the Test Case Classes Written as testNG methods. This Code is
The Top Level and resembles actual Test Cases Steps. It Makes Calls to Interact with Web Elements. 
For example,  Action calls like Click on a link, send text to a text Box, Press on a button, Scroll
to a particular Element, Switch tabs, Switch Windows, Navigate thru Pages, etc. 
It also has verification Points to ensure expected results.

Page Classes :  This layer provides methods to find and access Web Page Elements. 
It is the only point of access to the Page Objects Repository.
It will Also perform the Steps required to complete the Action Calls made by Test Classes layer.
Page classes are reusable across all Test Classes that need to interact with any of Elements. 

UtilsKit : The UtilsKit contains a set of Static methods to perform low level generic APIs.
Methods in here are re-usable across multiple projects using the same framework. To make this work,
each Project Will have to Keep Its own Property Files and add the UtilKit as a Maven dependency.
It includes methods to Access Test Suite Property Files, Excel Files and relational Database.
Also contains Data Providers, Random Data generators, error Login, Initializations,
Tracking, and Closure. Generic calls like scrollToElement(), findFrames(), findRowsInTable() etc.

