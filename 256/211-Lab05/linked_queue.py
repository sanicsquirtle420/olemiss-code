from linear_node import *
from raccoon_exceptions import *

class LinkedQueue(object):
    def __init__(self) -> None:
        self.count: int = 0
        self.head: LinearNode = None
        self.tail: LinearNode = None

    def is_empty(self) -> bool:
        return self.count == 0

    def size(self) -> int:
        return self.count

    def enqueue(self, element: T):
        node: LinearNode = LinearNode(element)
        if self.is_empty():
            self.head = node
        else:
            self.tail.set_next(node)

        self.tail = node
        self.count += 1

    def dequeue(self) -> T:
        if self.is_empty():
            raise EmptyException("Queue is empty. Nothing to dequeue")

        result: T = self.head.get_element()
        self.head = self.head.get_next()
        self.count -= 1

        if self.is_empty():
            self.tail = None
        return result

    def first(self) -> T:
        if self.is_empty():
            raise EmptyException("Queue is empty")

        return self.head.get_element()

    def __str__(self) -> str:
        msg: str = ""
        current: LinearNode = self.head

        while current is not None:
            msg += str(current.get_element()) + "\n"
            current = current.get_next()

        return msg
