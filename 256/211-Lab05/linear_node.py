from typing import TypeVar , Generic

T: TypeVar = TypeVar("T")

class LinearNode(Generic[T]):
    def __init__(self, element: T) -> None:
        self.element: T = element
        self.next: "LinearNode[T]" = None

    def get_element(self) -> T:
        return self.element

    def get_next(self) -> "LinearNode[T]":
        return self.next

    def set_next(self, next: "LinearNode[T]") -> None:
        self.next = next
