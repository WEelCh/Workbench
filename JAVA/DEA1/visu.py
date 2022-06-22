import matplotlib.pyplot as plt



n = [i for i in range(100000,500001,50000)]
t = [18, 123, 212, 285, 391, 451, 686, 844, 903]
x = [1,2,3,4,5,6,7,8,9]
print(len(n),len(t))

plt.bar(n, t, color = 'blue', width = 20000)

plt.xlabel('n')
#plt.xticks(n)
plt.grid(axis='y')
plt.ylabel('T in s')
plt.yticks(t)
plt.title('Laufzeit-Test')

plt.show()