def FCM(image,  randnum_r, randnum_g, randnum_b, iteration):
    print(image)
    p_total = []
    error_log = []
    randnum_sum = arrSum(randnum_r, randnum_g)
    myu_r = setMyu(randnum_r, randnum_sum)
    myu_g = setMyu(randnum_g, randnum_sum)
    myu_b = setMyu(randnum_b, randnum_sum)
    # myu_sum = arrSum(myu_r, myu_g)
    X = []
    Y = []
    width, height = fcm_image.size
    for y in range(height):
            for x in range(width):
                X.append(x)
                Y.append(y)
                # print(f"Pixel at ({x}, {y}): X={r}, Y={g}, B={b}")

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
        myu_G_sum = sumArr(myu_g_squared)
        B_x_sum = sumArr(B_x)
        B_y_sum = sumArr(B_y)

        cluster_r = []
        cluster_r.append(R_x_sum / myu_R_sum)
        cluster_r.append(R_y_sum / myu_R_sum)
        cluster_g = []
        cluster_r.append(G_x_sum / myu_G_sum)
        cluster_r.append(G_y_sum / myu_G_sum)
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

    for i in range(1, len(p_total)):
        error_log.append(p_total[i-1] - p_total[i])

    return p_total, error_log, cluster_r, cluster_g, cluster_b