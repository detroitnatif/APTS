import math


def circles(x, y, r, x1, y1, x2, y2):
    counter = 0
    for i in range(len(x)):
        d = math.sqrt(((x[i] - x1) ** 2) + ((y[i] - y1) ** 2))
        if d < r[i]:
            counter += 1

    for i in range(len(x)):
        d = math.sqrt(((x[i] - x2) ** 2) + ((y[i] - y2) ** 2))
        if d < r[i]:
            counter += 1

    return counter


print(circles([0], [0], [2], -5, 1, 5, 1))

print(circles([0, -6, 6], [0, 1, 2], [2, 2, 2], -5, 1, 5, 1))

print(
    circles(
        [1, -3, 2, 5, -4, 12, 12],
        [1, -1, 2, 5, 5, 1, 1],
        [8, 1, 2, 1, 1, 1, 2],
        -5,
        1,
        12,
        1,
    )
)
