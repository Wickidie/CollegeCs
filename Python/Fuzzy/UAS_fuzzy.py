from PIL import Image
import numpy as np
from scipy.spatial.distance import euclidean

def setRGBtoMaxValue(fcm_image):
    width, height = fcm_image.size
    for y in range(height):
        for x in range(width):
            r, g, b = fcm_image.getpixel((x, y))
            if ((r > g and r > b) or (r == g)):
                fcm_image.putpixel((x, y), (255, 0, 0))
            elif ((g > r and g > b) or (g == b)):
                fcm_image.putpixel((x, y), (0, 255, 0))
            elif ((b > r and b > g) or (b == r)):
                fcm_image.putpixel((x, y), (0, 0, 255))

            r, g, b = fcm_image.getpixel((x, y))
            # print(f"Pixel at ({x}, {y}): R={r}, G={g}, B={b}")
    return fcm_image

def generateBitmap(width, height):
    image = Image.new("RGB", (width, height), (0, 0, 0))
    for y in range(width):
        for x in range(height):
            randnum = np.random.randint(1, 101)
            if (randnum >= 1 and randnum <= 5 and y < height / 3 and x < width / 3):
                image.putpixel((x, y), (255, 255, 255))
            elif (randnum >= 6 and randnum <= 9):
                image.putpixel((x, y), (255, 255, 255))
            elif (randnum >= 10 and randnum <= 30 and y > height / 1.3 and x > width / 1.3):
                image.putpixel((x, y), (255, 255, 255))
            elif (randnum >= 31 and randnum <= 100):
                image.putpixel((x, y), (0, 0, 0))

    return image
# Used
def findMiddlePoint(point1, point2, point3):
    x_avg = sum([point[0] for point in [point1, point2, point3]]) / 3
    y_avg = sum([point[1] for point in [point1, point2, point3]]) / 3
    return [x_avg, y_avg]

def setNewImage(fcm_image, cluster_r, cluster_g, cluster_b):
    width, height = fcm_image.size
    for y in range(height):
        for x in range(width):
            this_point = [x, y]
            if (fcm_image.getpixel((x, y)) != (0, 0, 0) and fcm_image.getpixel((x, y)) != (255, 165, 0)):
                fcm_image.putpixel((x, y), (255, 255, 255))

    for y in range(height):
        for x in range(width):
            this_point = [x, y]
            distance_to_r = int(euclidean(this_point, cluster_r))
            distance_to_g = int(euclidean(this_point, cluster_g))
            distance_to_b = int(euclidean(this_point, cluster_b))
            if (fcm_image.getpixel((x, y)) == (255, 255, 255)):
                if (min(distance_to_r, distance_to_g, distance_to_b) == distance_to_r):
                    fcm_image.putpixel((x, y), (255, 0, 0))
                elif (min(distance_to_r, distance_to_g, distance_to_b) == distance_to_g):
                    fcm_image.putpixel((x, y), (0, 255, 0))
                elif (min(distance_to_r, distance_to_g, distance_to_b) == distance_to_b):
                    fcm_image.putpixel((x, y), (0, 0, 255))
    
    middle_point = findMiddlePoint(cluster_r, cluster_g, cluster_b)
    print((int)(middle_point[0]), (int)(middle_point[1]))
    fcm_image.putpixel(((int)(middle_point[0]), (int)(middle_point[1])), (255, 255, 255))
    fcm_image.putpixel((int(cluster_r[0]), int(cluster_r[1])), (255, 0, 255))
    fcm_image.putpixel((int(cluster_g[0]), int(cluster_g[1])), (255, 255, 0))
    fcm_image.putpixel((int(cluster_b[0]), int(cluster_b[1])), (0, 255, 255))

    return fcm_image

def FCM(image, iteration, error): 
    def arrSum(arr1, arr2, arr3):
        random_sum = []
        for i in range(len(arr1)):
            random_sum.append(arr1[i] + arr2[i] + arr3[i])
        return random_sum

    def sumArr(arr):
        num = 0
        for i in range(len(arr)):
            num += arr[i]
        return num
    
    def arrMultiply(arr1, arr2):
        arr = []
        for i in range(len(arr1)):
            arr.append(arr1[i] * arr2[i])
        return arr

    def setMyu(random_arr, random_sum):
        myu = []
        for i in range(len(random_arr)):
            myu.append(random_arr[i] / random_sum[i])
        return myu

    def myuSquared(arr):
        for i in range(len(arr)):
            arr[i] *= arr[i]
        return arr

    def getL(arr1, arr2, arr_sum, arr_squared):
        arr = []
        for i in range(len(arr1)):
            arr.append(((arr1[i] - arr_sum[0])**2 + (arr2[i] - arr_sum[1])**2) * arr_squared[i])
        return arr

    def onePerL(arr1, arr2):
        arr = []
        for i in range(len(arr1)):
            arr.append(1 / (arr1[i] / arr2[i]))
        return arr

    print(image)
    X = []
    Y = []
    width, height = fcm_image.size
    for y in range(height):
            for x in range(width):
                if (fcm_image.getpixel((x, y)) != (0, 0, 0)):
                    X.append(x)
                    Y.append(y)
                # print(f"Pixel at ({x}, {y}): X={r}, Y={g}, B={b}")

    randnum_r = np.random.rand(len(X))
    randnum_g = np.random.rand(len(X))
    randnum_b = np.random.rand(len(X))

    p_total = [0]
    error_log = []
    randnum_sum = arrSum(randnum_r, randnum_g, randnum_b)
    myu_r = setMyu(randnum_r, randnum_sum)
    myu_g = setMyu(randnum_g, randnum_sum)
    myu_b = setMyu(randnum_b, randnum_sum)
    # myu_sum = arrSum(myu_r, myu_g, myu_b)

    for i in range(iteration):
        myu_r_squared = myuSquared(myu_r)
        myu_g_squared = myuSquared(myu_g)
        myu_b_squared = myuSquared(myu_b)

        R_x = arrMultiply(myu_r_squared, X)
        R_y = arrMultiply(myu_r_squared, Y)
        G_x = arrMultiply(myu_g_squared, X)
        G_y = arrMultiply(myu_g_squared, Y)
        B_x = arrMultiply(myu_b_squared, X)
        B_y = arrMultiply(myu_b_squared, Y)

        myu_R_sum = sumArr(myu_r_squared)
        R_x_sum = sumArr(R_x)
        R_y_sum = sumArr(R_y)
        myu_G_sum = sumArr(myu_g_squared)
        G_x_sum = sumArr(G_x)
        G_y_sum = sumArr(G_y)
        myu_B_sum = sumArr(myu_b_squared)
        B_x_sum = sumArr(B_x)
        B_y_sum = sumArr(B_y)

        cluster_r = []
        cluster_r.append(R_x_sum / myu_R_sum)
        cluster_r.append(R_y_sum / myu_R_sum)
        cluster_g = []
        cluster_g.append(G_x_sum / myu_G_sum)
        cluster_g.append(G_y_sum / myu_G_sum)
        cluster_b = []
        cluster_b.append(B_x_sum / myu_B_sum)
        cluster_b.append(B_y_sum / myu_B_sum)

        L_r = getL(X, Y, cluster_r, myu_r_squared)
        L_g = getL(X, Y, cluster_g, myu_g_squared)
        L_b = getL(X, Y, cluster_b, myu_b_squared)
        L_sum = sumArr(arrSum(L_r, L_g, L_b))

        one_L_r = onePerL(L_r, myu_r_squared)
        one_L_g = onePerL(L_g, myu_g_squared)
        one_L_b = onePerL(L_b, myu_b_squared)
        one_L_sum = arrSum(one_L_r, one_L_g, one_L_b)

        myu_r = setMyu(one_L_r, one_L_sum)
        myu_g = setMyu(one_L_g, one_L_sum)
        myu_b = setMyu(one_L_b, one_L_sum)

        p_total.append(L_sum)
        fcm_image.putpixel((int(cluster_r[0]), int(cluster_r[1])), (255, 165, 0))
        fcm_image.putpixel((int(cluster_g[0]), int(cluster_g[1])), (255, 165, 0))
        fcm_image.putpixel((int(cluster_b[0]), int(cluster_b[1])), (255, 165, 0))

        error_log.append(abs(p_total[i] - p_total[i+1]))
        if (error_log[i] < error):
            print(f"Stop at {i} iteration")
            break
        
    cluster_r[0] = int(cluster_r[0])
    cluster_r[1] = int(cluster_r[1])
    cluster_g[0] = int(cluster_g[0])
    cluster_g[1] = int(cluster_g[1])
    cluster_b[0] = int(cluster_b[0])
    cluster_b[1] = int(cluster_b[1])

    return p_total, error_log, cluster_r, cluster_g, cluster_b

# x = 50 
# y = 50
# fcm_image = generateBitmap(x, y)
# np.random.seed(1)
fcm_image = Image.open('/home/wickidie/Documents/GitHub/CollegeCs/Python/Fuzzy/fcm1.png') # 
x, y = fcm_image.size
fcm_image = fcm_image.convert('RGB')
fcm_image.save("old_fcm.png")

p_total, error_log, cluster_r, cluster_g, cluster_b = FCM(fcm_image, 50, 0.03)

print("p value : ", p_total)
print("error value : ", error_log)
print("Last p value : ", p_total[len(p_total)-1])
print("Last error value : ", error_log[len(error_log)-1])
print("Cluster RED at : ", cluster_r)
print("Cluster GREEN at : ", cluster_g)
print("Cluster BLUE at : ", cluster_b)

fcm_image = setNewImage(fcm_image, cluster_r, cluster_g, cluster_b)
fcm_image.save("new_fcm.png")