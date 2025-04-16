def nStarTriangle(n: int) -> None:
    for i in range(n - 1, -1, -1):
        padding = " " * (n - 1 - i)
        stars = "*" * (2 * i + 1)
        print(padding + stars + padding)

nStarTriangle(int(input()))