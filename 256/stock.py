def main():
    # prompt for inputs
    shares: int = int(input("Enter the number of shares you purchased: "))
    paid: float = float(input("Enter the amount per share: $"))
    sold: int = int(input("Enter the number of shares you SOLD two weeks later: "))
    sale: float = float(input("Enter the amount you sold per share: $"))

    # calculate information needed as specified
    cost_before: float = shares * paid
    commission_before: float = cost_before * 0.03
    cost_after: float = sold * sale
    commission_after: float = cost_after * 0.03

    total: float = cost_after - cost_before - commission_after - commission_before

    # display the output (format: $ and 2 decimal places)
    if total < 0:
        print(f"${total:.2f}")
        print("You lost money :(")
    elif total == 0:
        print("You made no profit!")
    else:
        print(f"${total:.2f}")
        print("You made a profit!")

if __name__ == "__main__":
    main()
