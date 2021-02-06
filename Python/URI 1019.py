N = int(input())

horas = N//3600
minutos = N//60 - (horas * 60)
segundos = N - (minutos * 60 + horas * 3600)

print("{}:{}:{}".format(horas,minutos,segundos))

# // = divisão inteira (é necessário usar para o resultado da dvisão não ser um float)