def main():
    # Lists = Arrays
    line: list = input("Text: ").split(" ")
    # split() splits strings into a list
    # in this case being split by a space

    for i in range(len(line)):
        print(line[i])

    numbers: str = input("Numbers: ")
    # strings can be considered an array of characters
    # so we can use str_var[index] to get a character
    total: int = 0
    for j in range(len(numbers)):
        print(numbers[j])
        total += int(numbers[j])
        # int(str_val) converts from string to integer

    print() # new line
    print(f"Length of string {len(numbers)}\tTotal: {total}")


if __name__ == "__main__":
    main()
