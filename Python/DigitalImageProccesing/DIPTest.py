import cv2 as cv
import matplotlib.pyplot as plt
import numpy as np

img_list = [
    "bersihkan_noise.png",
    "hitung_koin.png"
]
plt.figure(figsize=(16, 9))

kernel = np.ones((9,9), np.uint8)
img_ori = cv.imread(img_list[0])
img_ori = cv.cvtColor(img_ori, cv.COLOR_BGR2RGB)
plt.title("Original")
plt.imshow(img_ori)
plt.figure(figsize=(16, 9))
img_eroded = cv.erode(img_ori, kernel, iterations=1)

plt.show()
