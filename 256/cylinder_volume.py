import math

# prompt for input
radius: float = float(input("Radius of the cylinder: "))
height: float = float(input("Height of the cylinder: "))

# calculations
area: float = math.pi * math.pow(radius , 2)
volume: float = area * height

# display the output (2 decimal places
print(f"The cylinder with a height of {height:.2f} and radius of {radius:.2f}")
print(f"has a base area of {area:.2f} and a volume of {volume:.2f}")
