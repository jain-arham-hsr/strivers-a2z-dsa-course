def nNumberTriangle(n: int) -> None:
    for i in range(n, 0, -1):
        print(" ".join([str(num) for num in range(1, i + 1)]))

nNumberTriangle(int(input()))