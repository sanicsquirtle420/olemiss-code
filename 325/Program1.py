alphabet: list[str] = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]

def main():
    run: bool = True
    while run:
        print("Select a cipher to use:")
        print("1. Keyword Cipher")
        print("2. Columnar Cipher")
        print("3. Vigenere Cipher")
        print("4. Exit")

        choice: int = int(input("-> "))

        if choice == 1:
            k = input("Enter a key: ")
            pt = input("Enter your text: ")
            print(keyword(k, pt) + "\n")
        elif choice == 2:
            k = input("Enter a key: ")
            pt = input("Enter your text: ")
            print(columnar(k, pt) + "\n")
        elif choice == 3:
            k = input("Enter a key: ")
            pt = input("Enter your text: ")
            print(vigenere(k, pt) + "\n")
        else:
            run = False

def keyword(key: str, plaintext: str) -> str:
    print("Select:")
    print("1. Encrypt")
    print("2. Decrypt")
    choice: int = int(input("-> "))
    ans: str = ""
    a = alphabet.copy()

    for i in reversed(range(len(key))):
        if key[i].upper() in alphabet:
            a.remove(key[i].upper())
            a.insert(0, key[i].upper())

    if choice == 1:
        for j in range(len(plaintext)):
            if plaintext[j].upper() in alphabet:
                index: int = alphabet.index(plaintext[j].upper())
                ans = ans + a[index]
            else:
                ans = ans + plaintext[j]
    elif choice == 2:
        for j in range(len(plaintext)):
            if plaintext[j].upper() in a:
                index: int = a.index(plaintext[j].upper())
                ans = ans + alphabet[index]
            else:
                ans = ans + plaintext[j]

    tmp = list(ans)
    for k in range(len(plaintext)): # the stupidest way to keep the same case
        if plaintext[k].islower():
            tmp[k] = tmp[k].lower()

    return "".join(tmp)

def columnar(key: str, plaintext: str) -> str:
    print("Select:")
    print("1. Encrypt")
    print("2. Decrypt")
    choice: int = int(input("-> "))
    ans: str = ""

    if choice == 1:
        print("ENCRYPTING")
    elif choice == 2:
        print("DECRYPTING")

    return ans

def vigenere(key: str, plaintext: str) -> str:
    print("Select:")
    print("1. Encrypt")
    print("2. Decrypt")
    choice: int = int(input("-> "))
    ans: str = ""

    if choice == 1:
        print("ENCRYPTING")
    elif choice == 2:
        print("DECRYPTING")

    return ans

if __name__ == "__main__":
    main()
