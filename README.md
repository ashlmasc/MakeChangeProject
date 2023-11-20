# MakeChangeProject

## Project Description
### The Make Change program take prpmpts user for the amount of money owed for something and then prompts user for amount of money paid. The program then figures out how much change is needed (if any) using the largest bill and coin denominations.

## Project Overview
### In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. We will also notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.

### User Story #1
### The user is prompted asking for the price of the item.

### User Story #2
### The user is then prompted asking how much money was tendered by the customer.

### User Story #3
### Display an appropriate message if the customer provided too little money or the exact amount.

### User Story #4
### If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.

## Lessons Learned
### I struggled most with getting the modulus operator to round correctly to maintain accuracy. I fixed this by consistently rounding the answer to two decimal places after using the modulus operator to solve the amount of coins needed in change.