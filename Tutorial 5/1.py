def add(n):
    if(n<=1):
        return n
    else:
        return((add(n-1))+add(n-2))


print(add(6))