contador = 0
for x in range(1,7):
    a = float(input())
    if a > 0:
        contador = contador + 1
print('{} valores positivos'.format(contador))