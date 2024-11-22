def main():
    # initialize variables
    prime_nums: int = 0
    primes: str = ""

    # loop through 2 - 100
    for i in range(2 , 101):
        output: int = is_prime(i)

        if output != -1:
            primes += f"{output} "
            prime_nums += 1

    # print output
    print("The prime numbers from 1 - 100:")
    print(primes)
    print(f"There are {prime_nums} prime numbers.")

def is_prime(num: int) -> int:
    for i in range(2 , (num // 2) + 1):
        if num % i == 0:
            return -1

    return num

if __name__ == "__main__":
    main()
