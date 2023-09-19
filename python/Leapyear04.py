import calendar

year = int(input("Enter the year to check"))

def printLeapYear01(year):
    if year % 400 == 0 or (year % 100 != 0 and year % 4 == 0):
        return "Leap Year"
    else:
        return "Not Leap Year"
    
def printLeapYear02(year):
    return "Leap Year" if (year % 400 == 0 or (year % 100 != 0 and year % 4 == 0)) else "Not Leap Year"    


def printLeapYear03(year):
    return "Leap Year" if (year % 400 == 0 or (year % 100 != 0 and year % 4 == 0)) else "Not Leap Year"    

def printLeapYear04(year):
    return "Leap Year" if calendar.isleap(year) else "Not Leap Year"

print(printLeapYear01(year))    
print(printLeapYear02(year))
print(printLeapYear03(year))
print(printLeapYear04(year))    
