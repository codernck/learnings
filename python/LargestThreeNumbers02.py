print('Enter the two numbers')
num1 = int(input())
num2 = int(input())
num3 = int(input())

def findLargest01(num1, num2, num3):
    if num1 >= num2 and num1 >= num3:
        return num1
    elif num2 >= num1 and num2 >= num3 :
        return num2
    else:
        return num3
    
def findLargest02(num1, num2, num3):
    if num1 >= num2:
        if num1 >= num3:
            return num1
        else:
            return num3
    else:
        if num2 >= num3:
            return num2
        else:
            return num3
        
def findLargest03(num1, num2, num3):
    if num1 >= num2 and num1 >= num3:
        return num1
    elif num2 >= num3:
        return num2
    else:
        return num3
    
def findLargest04(num1, num2, num3):
    largest = num1 if num1 > num2 else num2
    largest = num3 if num3 > largest else largest
    return largest
    
def findLargest05(num1, num2, num3):
    return max(num1, max(num2, num3))

def findLargest06(num1, num2, num3):
    list = [num1, num2, num3]
    return max(list)

def findLargest07(num1, num2, num3):
    list = [num1, num2, num3]
    list.sort()
    return list[-1]
        

print(findLargest01(num1, num2, num3)) 
print(findLargest02(num1, num2, num3))
print(findLargest03(num1, num2, num3))
print(findLargest04(num1, num2, num3))
print(findLargest05(num1, num2, num3))
print(findLargest06(num1, num2, num3)) 