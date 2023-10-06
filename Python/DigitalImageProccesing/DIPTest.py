import cv2 as cv
import matplotlib.pyplot as plt
import sys

img = cv.imread("Starry_Night.jpg")

b,g,r = cv.split(img)

fig,ax = plt.subplots(2,2)

ax[0,0].imshow(r,cmap='gray')
ax[0,0].set_title("Red Channel");
ax[0,1].imshow(g,cmap='gray')
ax[0,1].set_title("Green Channel");
ax[1,0].imshow(b,cmap='gray')
ax[1,0].set_title("Blue Channel");

# Merge the individual channels into a BGR image
imgMerged = cv.merge((b,g,r))
# Show the merged output
ax[1,1].imshow(imgMerged[:,:,::-1])
ax[1,1].set_title("Merged Output");
print(ax)


plt.show()

# cv.imshow("Display window", img)
# k = cv.waitKey(0)

# if k == ord("s"):
#     cv.imwrite("starry_night.png", img)