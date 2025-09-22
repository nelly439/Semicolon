num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
num3 = int(input("Enter third number: "))
num4 = int(input("Enter fourth number: "))

highest = num1

if(highest > num2):
	highest = num2 

if(highest > num3):
	highest = num3

if(highest > num4):
	highest = num4

 
lowest = num1

if(lowest < num2):
	lowest = num2

if(lowest < num3):
	lowest = num3

if(lowest < num4):
	lowest = num4

median = (highest + lowest) // 2

print("The median of the number is", median)