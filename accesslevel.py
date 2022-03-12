def access(people, num):
    final = ""
    for i in people:
        if i < num:
            final += "D"
        else:
            final += "A"
    return final


print(access([0, 1, 2, 3, 4, 5], 2))
print(access([5, 3, 2, 10, 0], 20))
