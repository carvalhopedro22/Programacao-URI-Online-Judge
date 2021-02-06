n = int(input())

a = n // 365
n = n - a*365 #resto da divisão por 365

m = n // 30
n = n - m*30 #resto da divisão por 30, feito a divisão por 365 anteriormente

d = n

print('{} ano(s)'.format(a))
print('{} mes(es)'.format(m))
print('{} dia(s)'.format(d))