words = []

with open('arquivosTexto/taleModificado.txt') as file:
    for linha in file:
        aux = linha.split()
        for pal in aux:
            if(pal in words):
                continue
            else:
                words.append(pal)

with open('arquivosTexto/taleModSemRepeticao.txt', 'w') as arq:
    for pal in words:
        arq.write(pal + "\n")
