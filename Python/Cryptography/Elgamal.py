import math
import random

# func 
def findAlpha(p,q):
    alpha = 2
    while True:
        if(alpha**2 % p != 1 or alpha**q % p != 1 ):
            return alpha
        alpha += 1
    

# Nentuin prima + cek aman gak primanya
p = 107
q = (p-1)/2

# Nentukan alpha
alpha = findAlpha(p,q)
print("alpha :", alpha)

# Nentukan beta (harus diatas p)
a = p + 1
beta = alpha**a % p 
print("beta :", beta)

# Encrypt 
plain = "SELAMATPAGI" # Ini nanti tolong disesuain sama input gui
# masukin ke array + jadiin ascii
plain = [ord(i) for i in plain]
# cari k
k = [random.randint(2,100000) for i in range(len(plain))]
print("k :", k)
#cari r & t 
r = [alpha**k[i] % p for i in range(len(plain))]
t = [beta**k[i]*plain[i] % p for i in range(len(plain))]
print("r :",r)
print("t :",t)
    
    
