def main():
    # prompt for number of scores
    total: int = int(input("How many scores do you want to put in: "))

    # prompt for the actual scores
    grades: list[int] = [int(input("Score: ")) for _ in range(total)]

    # call convert_to_letter()
    letters: list[str] = []
    for i in range (len(grades)):
        letters.append(convert_to_letter(grades[i]))

    # print output
    print(f"\nHere are the letter grades: {letters}")
    print(f"The average is {calc_average(grades):.2f}")

def calc_average(scores: list[int]) -> float:
    total: float = 0.0
    for i in range (len(scores)):
        total += scores[i]

    return total / len(scores)

def convert_to_letter(score: int) -> str:
    if score > 89:
        return "A"
    elif score > 79:
        return "B"
    elif score > 69:
        return "C"
    elif score > 59:
        return "D"
    else:
        return "F"

if __name__ == "__main__":
    main()
