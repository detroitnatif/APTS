def totality(vals, typ):
    final = 0
    if typ == "even":
        for i in vals:
            if vals.index(i) % 2 == 0:
                final += i
    elif typ == "odd":
        for j in vals:
            if (vals.index(j)) % 2 != 0:
                final += j
    else:
        final = sum(vals)
    return final


print(totality([1, 2, 3, 4, 5], "odd"))
