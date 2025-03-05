from unordered_list import *
from person import *

def main():
    kiriko: LinkedList = LinkedList()

    with open("samplePeople.txt" , "r") as file:
        tmp: list[list[str]] = []
        tags: list[str] = file.read().splitlines()
        for tag in tags:
            sample: list[str] = tag.split(",")
            tmp.append(sample)

        for person in tmp:
            kiriko.add_to_rear(Person(person[0] , int(person[1]) , person[2]))

    luna: LinkedList = copy(kiriko)

    if kiriko != luna:
        print("PASS: I am ready to put on a show!")
    else:
        print("FAIL: Let the kitsune guide you!")

    kiriko.add_to_rear(Person("Kiriko" , 21 , "female"))
    luna.add_to_rear(Person("Luna" , 22 , "female"))

    print(f"KIRIKO:\n{kiriko}")
    print(f"LUNA:\n{luna}")

    if is_equals(kiriko , luna):
        print("PASS: Overwatch is better")
    else:
        print("FAIL: Marvel Rivals is the best game ever")

    if in_list(luna , "ennif"):
        print('PASS: Welcome to orbit')
    else:
        print("FAIL: Oh moons not again") # Juno <3



def copy(sample: LinkedList) -> LinkedList:
    tmp: LinkedList = LinkedList()
    current: LinearNode[T] = sample.get_list_head()

    while current is not None:
        tmp.add_to_rear(current.get_element())
        current = current.get_next()

    return tmp

def is_equals(one: LinkedList , two: LinkedList) -> bool:
    one_node: LinearNode[T] = one.get_list_head()
    one_str: str = str(one_node.get_element())
    two_node: LinearNode[T] = two.get_list_head()
    two_str: str = str(two_node.get_element())

    while one_node is not None:
        if one_str != two_str:
            return False

        one_node = one_node.get_next()
        two_node = two_node.get_next()
        one_str = str(one_node.get_element())
        two_str = str(two_node.get_element())

    return True

def in_list(sample: LinkedList , find: str) -> bool:
    current: LinearNode[Person] = sample.get_list_head()

    while current is not None:
        sample_str: str = current.get_element().get_name().lower()
        find = find.lower()

        if find in sample_str:
            return True

        current = current.get_next()

    return False

if __name__ == "__main__":
    main()
