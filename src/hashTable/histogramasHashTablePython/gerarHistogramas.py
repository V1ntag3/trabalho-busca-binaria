import matplotlib.pyplot as plt
from dadosHist import m, freq, alfa, indice

if int(indice) == 32:
    ticks = m
elif int(indice) == 64:
    ticks = [0, 20, 40, 63]
elif int(indice) == 128:
    ticks = [0, 25, 50, 75, 100, 127]
elif int(indice) == 256:
    ticks = [0, 50, 100, 150, 200, 255]
elif int(indice) == 512:
    ticks = [0, 100, 200, 300, 400, 511]
else:
    ticks = [0, 25, 50, 75, 99]

plt.figure(figsize=(10, 5))

plt.bar(m, freq, color="blue")

plt.xticks(ticks)

plt.xlabel("Key value")

plt.ylabel("Frequency")

plt.title("Histogram M = " + indice)

plt.axhline(y=alfa, color="r")

plt.show()
