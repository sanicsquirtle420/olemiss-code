from linear_node import *
from raccoon_exceptions import *

class LinkedList(object):
    def __init__(self):
        self.count: int = 0
        self.head: LinearNode[T] = None
        self.tail: LinearNode[T] = None
        self.mod_count: int = 0

    def remove_first(self) -> T:
        if self.is_empty():
            raise EmptyException("Linked List")

        result: LinearNode[T] = self.head
        self.head = self.head.get_next()

        if self.head is None:
            self.tail = None

        self.count -= 1
        self.mod_count += 1

        return result.get_element()

    def remove_last(self) -> T:
        if self.is_empty():
            raise EmptyException("Linked List")

        previous: LinearNode[T] = None
        current: LinearNode[T] = self.head

        while current.get_next() is not None:
            previous = current
            current = current.get_next()

        result: LinearNode[T] = self.tail
        self.tail = previous

        if self.tail is None:
            self.head = None
        else:
            self.tail.set_next(None)

        self.count -= 1
        self.mod_count += 1

        return result.get_element()

    def remove(self, target: T) -> T:
        if self.is_empty():
            raise EmptyException("Linked List")

        found: bool = False

        previous: LinearNode[T] = None
        current: LinearNode[T] = self.head

        while current is not None and not found:
            if target is current.get_element():
                found = True
            else:
                previous = current
                current = current.get_next()

        if not found:
            raise ElementNotFound("Linked List")

        if self.size() == 1:
            self.head = None
            self.tail = None
        elif current is self.head:
            self.head = current.get_next()
        elif current is self.tail:
            self.tail = previous
            self.tail.set_next(None)
        else:
            previous.set_next(current.get_next())

        self.count -= 1
        self.mod_count += 1

        return current.get_element()

    def first(self) -> T:
        if self.is_empty():
            raise EmptyException("Linked List")

        return self.head.get_element()

    def last(self) -> T:
        if self.is_empty():
            raise EmptyException("Linked List")

        return self.tail.get_element()

    def contains(self, target: T) -> bool:
        if self.is_empty():
            raise EmptyException("Linked List")

        found: bool = False
        current: LinearNode[T] = self.head

        while current is not None and not found:
            if target is current.get_element():
                found = True
            else:
                current = current.get_next()

        return found

    def is_empty(self) -> bool:
        return self.count == 0

    def size(self) -> int:
        return self.count

    def __str__(self) -> str:
        output: str = ""
        current: LinearNode[T] = self.head
        count: int = 0

        while current is not None:
            if count == 0:
                output += current.get_element()
            else:
                output += " -> " + str(current.get_element())

            count += 1
            current = current.get_next()

        return output
