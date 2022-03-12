def gravity(time, velo):
    d = velo * time + (9.8 * (time ** 2)) / 2
    return d


print(gravity(3, 5))
