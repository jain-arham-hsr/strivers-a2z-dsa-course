def whichWeekDay(day):
    days = {
        1: "Monday",
        2: "Tuesday",
        3: "Wednesday",
        4: "Thursday",
        5: "Friday",
        6: "Saturday",
        7: "Sunday",
    }
    print(days.get(day, "Invalid"))

whichWeekDay(int(input()))