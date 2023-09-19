print('Enter the two numbers')
num1 = int(input())
num2 = int(input())


def findLargest01(num1, num2):
    largest = -1
    
    if num1 >= num2:
        largest = num1
    else:
        largest = num2
        
    return largest   

def findLargest02(num1, num2):
    return num1 if num1 >= num2 else num2

def findLargest03(num1, num2):
    return max(num1, num2)
    
def findLargest04(num1, num2):
    largestNum = lambda a, b:a if a >= b else b
    return largestNum(num1, num2)

# list comprehension
def findLargest05(num1, num2):
    x = [num1 if num1 >= num2 else num2]
    return x[0]

def findLargest06(num1, num2):
    x = [num1, num2]
    x.sort()
    return x[-1]
    
        

print(findLargest01(num1, num2))
print(findLargest02(num1, num2))
print(findLargest03(num1, num2))
print(findLargest04(num1, num2))
print(findLargest05(num1, num2))
print(findLargest06(num1, num2))
        
    
