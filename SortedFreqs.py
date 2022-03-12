def freqs(data):
    final = 0
    newarr = []
    newarr2 = []
    a = sorted(set(data))
    for i in range(len(a)):
        newarr.append(0)
        newarr2.append(0)
    for i in range(len(a)):
        newarr[i] = a[i]
        print(newarr)
    for ide, elm in enumerate(newarr):
        for idx, ele in enumerate(data):
            if elm == ele:
                newarr2[ide] += 1
    return newarr2


print(freqs(["apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"]))
