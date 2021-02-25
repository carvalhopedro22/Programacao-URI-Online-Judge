x = input().split()
horainicial, minutoinicial, horafinal, minutofinal = x

horainicial = int(x[0]) 
minutoinicial = int(x[1])
horafinal = int(x[2]) 
minutofinal = int(x[3]) 

if horainicial < horafinal:
    h = horafinal - horainicial
    if minutoinicial < minutofinal:
        m = minutofinal - minutoinicial
    if minutoinicial > minutofinal:
        h = h - 1
        m = (60 - minutoinicial) + minutofinal
    if minutoinicial == minutofinal:
        m = 0
if horainicial > horafinal:
    h = (24 - horainicial) + horafinal
    if minutoinicial < minutofinal:
        m = minutofinal - minutoinicial
    if minutoinicial > minutofinal:
        h = h - 1
        m = (60 - minutoinicial) + minutofinal
    if minutoinicial == minutofinal:
        m = 0
if horainicial == horafinal:
    if minutoinicial < minutofinal:
        m = minutofinal - minutoinicial
        h = 0
    if minutoinicial > minutofinal:
        m = (60 - minutoinicial) + minutofinal
        h = 23
    if minutoinicial == minutofinal:
        h = 24
        m = 0
    
print('O JOGO DUROU {} HORA(S) E {} MINUTO(S)'.format(h, m))