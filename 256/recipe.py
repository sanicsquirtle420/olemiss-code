import math

# prompt for input
batch: float = math.floor(float(input("How many cookies do you want to make? "))) / 48
## math.floor() : rounds down if needed

# calculate number of cups of each ingredient needed
sugar: float = 1.5 * batch
butter: float = batch
flour: float = 2.75 * batch

# display the output (2 decimal places)
print("Using this cookie recipe you need:")
print(f"\t{sugar:.2f} cups of sugar")
print(f"\t{butter:.2f} cups of butter")
print(f"\t{flour:.2f} cups of flour")
