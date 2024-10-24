# Fundamentals of Programming for Engineers, Lab 4

## Exercise 2a

### Objective
Design a discount system for the members of a restaurant.

### Instructions
Write a program to calculate the discounted price given the membership status 
of the individual.

Prompt the user for the cost of their meal and whether or not they are a
member.

The discounts are as follows:
- If a customer is a member
  - There is a 5% discount for dinner costing less than £100
  - There is a 10% discount for dinner costing at least £100
- If a customer is not a member, there is no discount

## Exercise 2b

### Objective
Design a meal planner that suggests meals based on dietary preferences.

### Instructions
Prompt the user for their dietary preference (vegetarian or vegan) and a meal 
time (breakfast, lunch, dinner).

The dietary preference and meal time should both be strings. No other variables
are needed for this task.

Use nested `if` statements to suggest meals:
- If vegetarian:
    - If meal time is breakfast, suggest porridge
    - If lunch, suggest a salad
    - If dinner, suggest vegetable stir-fry
- If vegan:
    - If meal time is breakfast, suggest fruit salad
    - If lunch, suggest a quinoa bowl
    - If dinner, suggest lentil curry
- If another preference is specified:
    - Print "Unsupported dietary preference! Please specify a valid dietary
      preference."

