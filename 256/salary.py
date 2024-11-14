def main():
    # prompt for input
    days: int = int(input("Enter number of working days: "))

    # FOR LOOP to display the table and calculate the total pay
    # format: $ at the beginning, 2 decimal places
    pay: float = 0.01
    total: float = 0
    print()

    print("Day\tPay")
    for i in range(days):
        if i == 0:
            pay = 0.01
        else:
            pay = pay * 2

        print(f"{i + 1}\t${pay:,.2f}")
        # also adds commas if it's over a thousand
        total += pay

    # display the total pay
    print()
    print(f"The total pay is ${total:,.2f}")

if __name__ == "__main__":
    main()
