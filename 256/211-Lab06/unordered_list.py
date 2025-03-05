from linked_list import *

class LinkedList(LinkedList):
    def __int__(self) -> None:
        super().__init__()

    def get_list_head(self) -> LinearNode[T]:
        return self.head

    def add_to_front(self, element: T) -> None:
        newNode: LinearNode[T] = LinearNode(element)

        if self.is_empty():
            self.head = newNode
            self.tail = newNode
        else:
            newNode.set_next(self.head)
            self.head = newNode

        self.count += 1
        self.mod_count += 1

    def add_to_rear(self, element: T) -> None:
        newNode: LinearNode[T] = LinearNode(element)

        if self.is_empty():
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.set_next(newNode)
            self.tail = newNode

        self.count += 1
        self.mod_count += 1

    def add_after(self, element: T , target: T) -> None:
        if self.is_empty():
            raise ElementNotFound("Linked Unordered List")

        found: bool = False
        current: LinearNode[T] = self.head
        newNode: LinearNode[T] = LinearNode(element)

        while current is not None and not found:
            if target is current.get_element():
                found = True
            else:
                current = current.get_next()

        if not found:
            raise ElementNotFound("Linked Unordered List")

        newNode.set_next(current.get_next())
        current.set_next(newNode)

        self.count += 1
        self.mod_count += 1

    def __str__(self) -> str:
        output: str = ""
        current: LinearNode[T] = self.head

        while current is not None:
            output += str(current.get_element())
            current = current.get_next()

        return output
