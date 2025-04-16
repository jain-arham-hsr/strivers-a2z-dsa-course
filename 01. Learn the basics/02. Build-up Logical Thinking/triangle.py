def triangle(n:int) -> None:
    for i in range(1, n + 1):
        print((f"{i} " * i).strip())

triangle(int(input()))