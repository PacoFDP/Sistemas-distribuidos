
#Este codigo fue creado en python
#Alumno: Rosales Mendoza Jose Francisco
def common_elements(a,b):
    listaResultado = []
    for x in a:
        for y in b:
            if x==y:
                listaResultado.append(x);
    return listaResultado
a =[1,2,3,4,5,6]
b =[1,4,6,8,5]
print("La lista es:\n "+ str(common_elements(a,b)))
