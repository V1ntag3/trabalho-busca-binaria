import sys

dados = []
freq = []
qntL = 0

arq = input('Qual nome do arquivo para gerar o histograma: ')
indice = input("Quantidade de posicoes da tabela hash (m): ")

try:
    with open("arquivosTexto/"+arq) as file:
        file.seek(0)
        for linha in file:
            pos = int(linha.split()[0])
            dados.append(pos)
            qntL += 1

    m = []
except FileNotFoundError as e:
    print("Erro ao abrir o arquivo!")
    sys.exit()


for i in range(0, int(indice), 1):
    freq.append(dados.count(i))
    m.append(i)

alfa = qntL / int(indice)
