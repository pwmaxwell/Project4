# Project4
This is the a tax calculator which uses the Visitor pattern

The other pattern can be found on a different repo: https://github.com/KurtDaill/Project4Mediator
# Testing
This is used to test the program. Run this as a JUnit test.

# Visitor
This is an interface which can visit the different types of food listed below

# TaxVisitor
This implements the Visitor interface and sets the tax rate for each food group

# Visitable
This is an interface which stores the accept() function. It is passed to each food group

# HealthyFood, Liquor, SugarFood
These are used to store prices of each food/drink. They are started with a constructor which sets the price, and can return the price. They also come with an accept() function which allows you to add a Visitor to them
