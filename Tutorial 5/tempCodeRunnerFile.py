def add(n):
    if(n<=1):
        return n
    else:
        print(str((add(n-1))+add(n-2)))


add(6)