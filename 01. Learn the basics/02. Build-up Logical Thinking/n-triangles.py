def nTriangle(n:int) -> None:
    for i in range(n):
        print(" ".join([str(num) for num in range(1, i + 2)]))

nTriangle(int(input()))