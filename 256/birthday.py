# prompt for input birthday
birthday: str = input("Enter your birthday (mm/dd/yyyy): ")

# split date into month, day, and year
date: list = birthday.split("/")

# change the date format and print it
match date[0]:
    case "01":
        date[0] = "January"
    case "02":
        date[0] = "February"
    case "03":
        date[0] = "March"
    case "04":
        date[0] = "April"
    case "05":
        date[0] = "May"
    case "06":
        date[0] = "June"
    case "07":
        date[0] = "July"
    case "08":
        date[0] = "August"
    case "09":
        date[0] = "September"
    case "10":
        date[0] = "October"
    case "11":
        date[0] = "November"
    case "12":
        date[0] = "December"

print(f"You were born on {date[0]} {date[1]}, {date[2]}.")

# print "Hotty Toddy!" three times
print()
for _ in range(3):
    print("Hotty Toddy!")
