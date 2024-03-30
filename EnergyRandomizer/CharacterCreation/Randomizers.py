import numpy as np

def random1(lt)->list:
    lista = []
    while len(lista) < len(lt):
        pos = np.random.randint(0,100)
        if pos not in lista:
            lista.append(pos)
    clase = np.random.randint(0,2)
    if clase:
        for index in range(len(lista)):
            lista[index] = lt[lista[index]]
    else:
        for index in range(len(lista)):
            lista.append(lt[lista.index(index)])
        lista = lista[100:]
    return lista

def random0(lt)->list:
    lista = lt
    times = np.random.randint(1,31)
    start = np.random.randint(0,50)
    end = np.random.randint(start+1,100)
    if times > 1:
        lista = lista[::-1]
        times -= 1
    lista = lista[start:end] + lista[:start] + lista[end:]
    while times >= 1:
        start = np.random.randint(0,50)
        end = np.random.randint(start,100)
        reverse = np.random.randint(0,2)
        if reverse:
            lista = lista[::-1]
        if times >=25:
            lista = lista[end:] + lista[:start] + lista[start:end]
        elif times >=17:
            lista = lista[end:] + lista[start:end] + lista[:start]
        elif times >=10:
            lista = lista[:start] + lista[end:] + lista[start:end]
        elif times >=3:
            lista = lista[start:end] + lista[end:] + lista[:start]
        else:
            lista = lista[start:end] + lista[:start] + lista[end:]
        times -= 1
    return lista

def randomize(lt)->list:
    lista = lt
    lista = random0(lista)
    lista = random1(lista)
    return lista