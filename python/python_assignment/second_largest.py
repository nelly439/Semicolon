num1 = int(input("Enter first integer: "))
num2 = int(input("Enter second integer: "))
num3 = int(input("Enter third integer: "))


if num1 > num2 and num1 < num3 or num1 > num3 and num1 < num2:
	second_highest = num1

elif num2 > num3 and num2 < num1 or num2 > num1 and num2 < num3:
	second_highest = num2

else:
	second_highest = num3

print("The second_ highest number is ", second_highest)