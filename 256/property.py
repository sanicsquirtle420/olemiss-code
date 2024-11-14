def main():
    # prompt for actual value of a property
    actual_value: float = float(input("Enter the actual value of your property: $"))
    print()
    # getting the assessment value with the calcAsmt function
    assess_value: float = calcAsmt(actual_value)
    # getting the property tax with the calcTax function
    tax: float = calcTax(assess_value)

    # display the data
    print(f"Assessment value of the property: ${assess_value:,.2f}")
    print(f"Property tax: ${tax:,.2f}")

def calcAsmt(p_val: float) -> float:
    return p_val * 0.6

def calcTax(a_value: float) -> float:
    return 0.72 * (a_value // 100)


if __name__ == "__main__":
    main()
