import math
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
    ans: str = ""
    a = alphabet.copy()

    for i in reversed(range(len(key))):
        if key[i].upper() in alphabet:
            a.remove(key[i].upper())
            a.insert(0, key[i].upper())

    if enc_dec():
        for j in range(len(plaintext)):
            if plaintext[j].upper() in alphabet:
                index: int = alphabet.index(plaintext[j].upper())
                ans += a[index]
            else:
                ans += plaintext[j]
    else:
        for j in range(len(plaintext)):
            if plaintext[j].upper() in a:
                index: int = a.index(plaintext[j].upper())
                ans = ans + alphabet[index]
            else:
                ans = ans + plaintext[j]

    return ret_case(ans, plaintext)

def columnar(key: str, plaintext: str) -> str:
    ans: str = ""
    r: int = math.ceil(len(plaintext) / len(key))
    arr: list[list[str]] = [[" " for _ in range(len(key))] for _ in range(r)]

    if enc_dec():
        for row in range(len(arr)):
            for col in range(len(arr[row])):
                index: int = row * len(key) + col
                if index < len(plaintext):
                    arr[row][col] = plaintext[index]
                else:
                    arr[row][col] = " "
    else:
        print("DECRYPTING")

    for col in range(len(arr[0])):
        for row in range(len(arr)):
            ans += arr[row][col]
    # for row in arr:
    #     for col in range(len(row)):
    #         print(row[col], end="")
    #     print()
    return ans

def vigenere(key: str, plaintext: str) -> str:
    ans: str = ""
    key = key.upper()

    if enc_dec():
        for j in range(len(plaintext)):
            if plaintext[j].upper() in alphabet:
                index: int = (ord(plaintext[j].upper()) + ord(key[j % len(key)])) % 26
                ans += alphabet[index].upper()
            else:
                ans += plaintext[j]
    else:
        for j in range(len(plaintext)):
            if plaintext[j].upper() in alphabet:
                index: int = (ord(plaintext[j].upper()) - ord(key[j % len(key)])) % 26
                ans += alphabet[index].upper()
            else:
                ans += plaintext[j]

    return ret_case(ans, plaintext)

def ret_case(cap_str: str, reg_str) -> str:
    tmp = list(cap_str)
    for i in range(len(reg_str)):
        if reg_str[i].islower():
            tmp[i] = tmp[i].lower()
    return "".join(tmp)

def enc_dec() -> bool:
    print("Select:\n1. Encrypt\n2. Decrypt")
    choice: int = int(input("-> "))
    return choice == 1

if __name__ == "__main__":
    main()
