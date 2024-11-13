def main():
    num: int = 428
    # You don't have to add the data type I just do it to make sure
    # the variables are assigned correctly
    gravity: float = 9.8067
    word: str = "Yotsuba"
    artists: list = ["Clairo" , "Laufey" , "Faye Webster"]
    # lists = arrays

    print("For loop with _ as variable:")
    for _ in range(4):
        print("Welcome to Orbit")
    # can use a _ if you don't have to call the counting variable

    print("Printing strings from a list:")
    for i in range(len(artists)):
        print(artists[i])

    print("Printing characters from a string:")
    for j in range(len(word)):
        print(word[j].lower()) # making all the characters lowercase
    # Strings can be treated a list of characters

    print("Printing values with format:")
    print(f"integer: {num}\tfloat: {gravity:.2f}\tstring: {word}")

if __name__ == "__main__":
    main()
