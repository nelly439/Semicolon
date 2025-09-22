number1 = int(input("Enter first number: "))
number2 = int(input("Enter second number: "))
number3 = int(input("Enter third number: "))

highest = number1

if(number2 > highest):
	highest = number2

if(number3 > highest):
	highest = number3

print("The largest number is ",  highest)