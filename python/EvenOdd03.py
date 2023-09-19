num = int(input("Enter the number to check:"))

def findEvenOdd01(num):
    if num % 2 == 0:
        return "Even"
    else:
        return "Odd"
    
def findEvenOdd02(num):
    return "Even" if num % 2 == 0 else "Odd"

def findEvenOdd03(num):
    if num&1 == 1:
        return "Odd"
    else:
        return "Even"
    
    
print(findEvenOdd01(num))
print(findEvenOdd02(num))
print(findEvenOdd03(num))
