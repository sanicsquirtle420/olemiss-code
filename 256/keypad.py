def main():
    response: str = "yes"
    alphabet: str = "abc def ghi jkl mno pqrs tuv wxyz"
    numpad: list = alphabet.split()

    # while loop to display letter/number mapping until the user quits
    while response == "yes" or response == "y":
        # prompt for input
        letter: str = input("Enter a letter: ").lower()

        if letter in alphabet:
            for i in numpad:
                if letter in i:
                    number: int = numpad.index(i) + 2
                    print(f"The number on the numpad is {int(number)}")
        else:
            print(f"[{letter}] is an invalid letter")

        print()
        response = input("Do you want to continue? (yes/no) ").lower()


if __name__ == "__main__":
    main()
