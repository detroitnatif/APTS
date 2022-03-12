def starter(words, letter):
    unique = set(words)
    counter = 0
    for i in unique:
        if i[0] == letter:
            counter += 1
    return counter


print(starter(["dog", "cat", "fish", "dog"], "d"))
