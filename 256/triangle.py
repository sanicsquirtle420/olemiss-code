import math

# prompt for inputs (1 inch = 2.54 centimeters)
x: float = float(input("Side x in inches: ")) * 2.54
y: float = float(input("Side y in inches: ")) * 2.54
z: float = float(input("Side z in inches: ")) * 2.54

# s = (1/2) * (x + y + z)
s: float = 0.5 * (x + y + z)

# calculate area
area: float = math.sqrt(s * (s - x) * (s - y) * (s - z))

# display the output
print()
print(f"For a triangle of sides {x:.2f}cm , {y:.2f}cm , {z:.2f}cm")
print(f"Area = {area:.2f}cm^2")
