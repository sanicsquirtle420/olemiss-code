class EmptyException(Exception):
    def __init__(self, message: str) -> None:
        super().__init__(message)


class InvalidRadixSort(Exception):
    def __init__(self, message: str) -> None:
        super().__init__(message)
