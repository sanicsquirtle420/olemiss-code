from rectangle import Rectangle
from prelab_12 import *
import random

def main():
    print("*** Prelab 10 / 11 ***")
    juno: Rectangle = Rectangle(3.14, 9.81)
    print("Reference: " + juno.obj_reference())
    hash = juno.generate_hash()
    print("Encoded: " + hash)
    print("Decoded: " + juno.decode_hash(hash))
    print("\n*** Prelab 12 ***")
    luna: list[float] = []
    kiriko: list[list[float]] = []
    for i in range(5):
        luna.append(random.uniform(5000.0, 499999.9))

    for x in range(5):
        kiriko.append([])
        for y in range(4):
            kiriko[x].append(random.uniform(5000.0, 499999.9))
    print("Luna:")
    print_array(luna)
    print("\nKiriko:")
    print_matrix(kiriko)
    print("\nKiriko averages:")
    print_array(average(kiriko))
    print("\n** Modifications **")
    sue = modify(luna.copy())
    print("Sue:")
    print_array(sue)
    dva = []
    for arr in kiriko:
        dva.append(modify(arr.copy()))
    print("\nDVa:")
    print_matrix(dva)
    print("\nDVa averages:")
    print_array(average(dva))

if __name__ == "__main__":
    main()