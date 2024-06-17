## Imperative vs Declarative programming 

- Imperative
```
def sumlist(l):
    mysum = 0
    for x in l:
        mysum = mysum + 1
    return (mysum)
```

- Declarative
```
def sumlist(l):
    if l == []:
        return 0
    else:
        return (l[0] + sumlist(l[1:]))
```