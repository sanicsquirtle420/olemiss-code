# prompt for inputs
name: list = input("Name: ").split(" ")
nums: str = input("Numbers: ")
print()

# split name and display initials
print("Your initials:" , end = " ")
for i in range(len(name)):
    print(name[i][0] , end = "")
# Note: [index of words][character at string]
print()

# calculate and display sum of all digits of the numbers
total: int = 0
for j in range(len(nums)):
    total += int(nums[j])

print(f"The total of the {len(nums)} numbers is {total}")
