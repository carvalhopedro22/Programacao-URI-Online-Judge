count = 0
count_2 = 0
while(count < 5):
  x = int(input())
  if(x % 2 == 0):
    count_2 += 1
  count += 1
print('{} valores pares' .format(count_2))