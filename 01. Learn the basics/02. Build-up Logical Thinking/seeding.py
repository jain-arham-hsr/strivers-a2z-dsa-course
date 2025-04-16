def seeding(n: int) -> None:
    for i in range(n, 0, -1):
        print(("* " * i).rstrip())

seeding(int(input()))