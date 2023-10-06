import PySimpleGUI as sg
import numpy as np
import pandas as pd

def linearCongruentialMethod(p_seed, p_noOfRandomNums, p_precision):
    p_m = 2**16 + 1    # Modulus parameter
    p_a = 75        # Multiplier term
    p_c = 74        # Increment term
    p_temp = p_seed
    p_randomNums = []
    for i in range(0, p_noOfRandomNums):
        p_temp = ((p_temp * p_a) + p_c) % p_m
        if (round(p_temp / p_m, p_precision) == 0):
            # print(0, i)
            p_randomNums.append(0.01)
        elif (round(p_temp / p_m, p_precision) == 1):
            # print(1, i)
            p_randomNums.append(0.99)
        else:
            p_randomNums.append(round(p_temp / p_m, p_precision))
            
    return p_randomNums

def inversTransformation(randomNums, precision, b):
    inverse_variate = []
    for i in range(0, len(randomNums), 1):
        x = -b * np.log(1 - randomNums[i])
        inverse_variate.append(round(x, precision))
        # print(inverse_variate[i])
    return inverse_variate

def calculateQueue(arr_a, arr_d):
    lifespan = 0
    for i in range(len(arr_d)):
        arr_a[i] = int(arr_a[i] * 100)
        lifespan += arr_a[i]
    for i in range(len(arr_d)):
        arr_d[i] = int(arr_d[i] * 100)
        lifespan += arr_d[i]

    server_status = 0
    number_in_queue = 0
    time_last_event = 0

    number_delayed = 0
    time_delayed = 0
    cutie = 0
    beauty = 0

    event_list = [arr_a[0], -1]
    arrival_time = [arr_a[0]]
    departure_time = []

    in_service = -1
    in_queue = []

    event_log_type = []
    event_log_time = []
    queue_log = []
    server_status_log = []
    number_delayed_log = []
    time_delayed_log = []
    cutie_log = []
    beauty_log = []

    dn = 0
    qn = 0
    tn = 0
    un = 0

    def printInfo():
            print("time_last_event : ", time_last_event)
            print("server_status : ", server_status)
            print("event_list : ", event_list)
            print("in_service : ", in_service)
            print("in_queue : ", in_queue)
            print("number_in_queue : ", number_in_queue)
            print("number_delayed : ", number_delayed)
            print("time_delayed : ", time_delayed)
            print("cutie : ", cutie)
            print("beauty : ", beauty)
            print("server_status_log : ", server_status_log)
            print("number_delayed_log : ", number_delayed_log)
            print("time_delayed_log : ", time_delayed_log)
            print("queue_log : ", queue_log)
            print("cutie_log : ", cutie_log)
            print("beauty_log : ", beauty_log)
            print("arrival_time : ", arrival_time)
            print("departure_time : ", departure_time)
            print()
            mama = 1
            
    clock_duration = int(lifespan)
    clock_tick = 1
    for clock in range(0, clock_duration, clock_tick):
        if (clock == event_list[0]):
            # print("\n@ Arrival event ", len(arrival_time), " at clock = ", clock)
            if (len(arrival_time) < len(arr_a)):
                if (server_status):
                    in_queue.append(clock)

                    beauty = clock - time_last_event
                    beauty_log.append(beauty_log[len(beauty_log) - 1] + beauty)

                else:
                    server_status = 1
                    in_service = clock
                    event_list[1] = clock + arr_d[len(departure_time)]
                    departure_time.append(arr_d[len(departure_time)])

                    number_delayed += 1
                    beauty_log.append(beauty)

                event_list[0] = clock + arr_a[len(arrival_time)]
                arrival_time.append(arr_a[len(arrival_time)])
                number_delayed_log.append(number_delayed)
            elif (len(arrival_time) == len(arr_a)):
                if (server_status):
                    in_queue.append(clock)
                    beauty = clock - time_last_event
                    beauty_log.append(beauty_log[len(beauty_log) - 1] + beauty)
                else:
                    server_status = 1
                    in_service = clock

                number_delayed_log.append(number_delayed)
                

            time_delayed_log.append(time_delayed)
            number_in_queue = len(in_queue)
            time_last_event = clock

            cutie = 0
            if (len(in_queue) > 0):
                for person in in_queue:
                    cutie += clock - person
            cutie_log.append(cutie + time_delayed)
            
            printInfo()
            server_status_log.append(server_status)
            event_log_time.append(clock)
            event_log_type.append('A')
            queue_log.append(len(in_queue))
        
        if (clock == event_list[1]):
            # print("\n& Departure event ", len(departure_time), " at clock = ", clock)
            if (len(in_queue) == 0):
                in_service = -1
                server_status = 0
                event_list[1] = -1

                number_delayed_log.append(number_delayed)
            else:
                in_service = in_queue.pop(0)
                event_list[1] = clock + arr_d[len(departure_time)]
                departure_time.append(arr_d[len(departure_time)])

                number_delayed += 1
                number_delayed_log.append(number_delayed)
                time_delayed += clock - in_service

            beauty = clock - time_last_event
            beauty_log.append(beauty_log[len(beauty_log) - 1] + beauty)
            number_in_queue = len(in_queue)
            time_last_event = clock
            
            cutie = 0
            for person in in_queue:
                cutie += clock - person
            cutie_log.append(cutie + time_delayed)

            printInfo()
            server_status_log.append(server_status)
            event_log_time.append(clock)
            event_log_type.append('D')
            queue_log.append(len(in_queue))
            time_delayed_log.append(time_delayed)

    dn = (time_delayed / number_delayed)
    qn = cutie_log[len(cutie_log) - 1] / event_log_time[len(event_log_time) - 1]
    tn = (beauty_log[len(beauty_log) - 1])
    un = tn / event_log_time[len(event_log_time) - 1]
    
    print("arr_a : ", arr_a)
    print("arr_d : ", arr_d)
    print("lifespan : ", lifespan)

    print("\n80====================LOG====================085")
    print("event_log_type \t\t", len(event_log_type), ": ", event_log_type)
    print("event_log_time \t\t", len(event_log_time), ": ", event_log_time)
    print("queue_log \t\t", len(queue_log), ": ", queue_log)
    print("server_status_log \t", len(server_status_log), ": ", server_status_log)
    print("number_delayed \t\t", len(number_delayed_log), ": ", number_delayed_log)
    print("time_delayed \t\t", len(time_delayed_log), ": ", time_delayed_log)
    print("cutie \t\t\t", len(cutie_log), ": ", cutie_log)
    print("beauty \t\t\t", len(beauty_log), ": ", beauty_log)

    print("\n8====================Juicy Stats for Nerds====================D")
    print("dn (Average Delay in minute)\t\t : ", dn / 100)
    print("qn (Average Number of ppl in queue)\t : ", qn)
    print("tn (Server busy in minute)\t\t : ", tn / 100)
    print("un (Server busy percentage)\t\t : ", un)

    return dn / 100, qn, tn / 100, un

def calculateJuicyStat(beta_a, beta_s, noOfRandomNums):
    seed = np.random.randint(100000)
    precision = 2
    randomNums = linearCongruentialMethod(seed, noOfRandomNums, precision)
    beta_kedatangan = inversTransformation(randomNums, precision, beta_a)
    beta_service = inversTransformation(randomNums, precision, beta_s)

    print(randomNums)
    print(beta_kedatangan)
    print(beta_service)
    print(seed)
    return calculateQueue(beta_kedatangan, beta_service)

def bulkRun(beta_a, beta_s, noOfRandomNums, number_of_simulation):
    dn = []
    qn = []
    tn = []
    un = []
    for i in range(number_of_simulation):
        a, b, c, d = calculateJuicyStat(beta_a, beta_s, noOfRandomNums,)
        dn.append(a)
        qn.append(b)
        tn.append(c)
        un.append(d)
    stat_for_excel = {
        'dn' : dn,
        'qn' : qn,
        'tn' : tn,
        'un' : un
    }
    return stat_for_excel

font = ("Roboto", 20)
sg.theme('Dark Blue')
main_menu_window = [  
    [sg.Text("Beta Arrival\t", font=("Roboto", 20)), sg.Input(key= "-BETA_ARRIVAL-", font=("Roboto", 14),  do_not_clear=True)],
    [sg.Text("Beta Service\t", font=("Roboto", 20)), sg.Input(key= "-BETA_SERVICE-", font=("Roboto", 14),  do_not_clear=True)],
    [sg.Text("Number Of Data\t", font=("Roboto", 20)), sg.Input(key= "-Number_Of_Data-", font=("Roboto", 14),  do_not_clear=True)],
    [sg.Text("dn (Average Delay in minute)\t =", font=("Roboto", 15)), sg.Text(key='-DN-')],
    [sg.Text("qn (Average Number of ppl in queue)\t = ", font=("Roboto", 15)), sg.Text(key='-QN-')],
    [sg.Text("tn (Server busy in minute)\t\t =", font=("Roboto", 15)), sg.Text(key='-TN-')],
    [sg.Text("un (Server busy percentage)\t =", font=("Roboto", 15)), sg.Text(key='-UN-')],
    [sg.Button("Calculate", font=("Roboto", 14))],
    [sg.Text("Number of Run\t", font=("Roboto", 20)), sg.Input(key= "-Number_Of_Simulation-", font=("Roboto", 14),  do_not_clear=True)],
    [sg.Button("Bulk Calculate", font=("Roboto", 14))],
    [sg.Text(key='-Succes-')]
]

window = sg.Window("Pemodelan Simulasi Sistem Antrian by Your Lovely Students", main_menu_window)
while True:
    event, values = window.read()
    if event in (sg.WIN_CLOSED, "Exit"):
        break
    elif event == 'Calculate':
        beta_a = float(values["-BETA_ARRIVAL-"])
        beta_s = float(values["-BETA_SERVICE-"])
        n = int(values["-Number_Of_Data-"])
        dn, qn, tn, un = calculateJuicyStat(beta_a, beta_s, n)
        window['-DN-'].update(str(dn))
        window['-QN-'].update(str(qn))
        window['-TN-'].update(str(tn))
        window['-UN-'].update(str(un))
    elif event == 'Bulk Calculate':
        beta_a = float(values["-BETA_ARRIVAL-"])
        beta_s = float(values["-BETA_SERVICE-"])
        number_of_data = int(values["-Number_Of_Data-"])
        number_of_simulation = int(values["-Number_Of_Simulation-"])

        data_lcg = pd.DataFrame(bulkRun(beta_a, beta_s, number_of_data, number_of_simulation))
        data_lcg.to_csv(f"juicy_stats_{beta_s}.csv", index=False)
        
        window['-Succes-'].update(f"Bulk Run Succes check your folder for juicy_stats_{beta_s}.csv")

window.close()