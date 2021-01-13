linha = input().split()
num1, num2, num3 = linha

if int(num1) >= int(num2) and int(num1) >= int(num3):
    print("{} eh o maior".format(num1))
elif int(num2) >= int(num1) and int(num2) >= int(num3):
    print("{} eh o maior".format(num2))
else:
    print("{} eh o maior".format(num3))