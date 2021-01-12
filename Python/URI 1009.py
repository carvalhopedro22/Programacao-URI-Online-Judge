NOME = str(input())
SALARIO = float(input())
MONTANTE = float(input())
COMISSAO = MONTANTE * (15.0/100.0)
TOTAL = SALARIO + COMISSAO
print("TOTAL = R$ {:.2f}".format(TOTAL))