linha = input().split(" ") 
A,B,C = linha

# ou A,B,C = [float(x) for x in input().split()]

tret = (float(A) * float(C))/2.0
circ = 3.14159 * (float(C) * float(C))
trap = ((float(A) + float(B)) * float(C))/2.0
quad = float(B) * float(B)
ret = float(A) * float(B)

print("TRIANGULO: {:.3f}".format(tret))
print("CIRCULO: {:.3f}".format(circ))
print("TRAPEZIO: {:.3f}".format(trap))
print("QUADRADO: {:.3f}".format(quad))
print("RETANGULO: {:.3f}".format(ret))