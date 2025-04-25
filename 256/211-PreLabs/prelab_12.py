def print_array(array: list[float]):
    for x in array:
        print(f"{x:.3f} ", end="")
    print()

def print_matrix(array: list[list[float]]):
    for x in range(len(array)):
        for y in array[x]:
            print(f"{y:.3f} ", end="")
        print()

def modify(array: list[float]) -> list[float]:
    for x in array:
        if int(x) % 2 == 0:
            array[array.index(x)] = x * 2
        else:
            array[array.index(x)] = x * 3
    return array


def average(array: list[list[float]]) -> list[float]:
    avg: list[float] = []
    for x in range(len(array)):
        sum: float = 0.0
        for y in array[x]:
            sum += y
        avg.append(sum / len(array[x]))

    return avg