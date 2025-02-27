from linked_queue import *

class RadixSortHTML(object):
    def __init__(self, filename: str) -> None:
        self.filename = filename
        self.buckets: list[LinkedQueue] = []
        self.tags: list[str] = []
        self.passes: int = 0

        self.initialize_buckets()

    def initialize_buckets(self) -> None:
        for i in range(0 , 27):
            self.buckets.append(LinkedQueue())

    def get_passes(self) -> int:
        return self.passes

    def read_tags(self) -> None:
        with open(self.filename , "r") as file:
            self.tags = file.read().splitlines()

    def process_tags(self) -> None:
        max: int = 0
        for string in self.tags:
            if len(string) > max:
                max = len(string)

        for i in range(len(self.tags)):
            while len(self.tags[i]) != max:
                self.tags[i] = self.tags[i] + " "

    def sort(self) -> None:
        max: int = len(self.tags[0]) - 1

        for pos in range(max , -1 , -1):
            self.count_sort(pos)

    def count_sort(self, position: int) -> None:
        for string in self.tags:
            letter: int = ord(string[position]) - ord('a')

            if letter == -65:
                self.buckets[26].enqueue(string)
            elif 0 <= letter <= 25:
                self.buckets[letter].enqueue(string)
            else:
                raise InvalidRadixSort("Invalid index")

        self.passes = 0
        for i in range(0 , 27):
            while not self.buckets[i].is_empty():
                self.tags[self.passes] = self.buckets[i].dequeue()
                self.passes = self.passes + 1

    def __str__(self) -> str:
        output: str = ""
        for tag in self.tags:
            output += tag + "\n"

        return output
