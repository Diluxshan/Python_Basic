# import datetime
# import time
#
# def delay():
#     nowt = time.clock()
#     for i in range(1,10):
#         print("The value is :" + str(i))
#         time.sleep(1)
#     print(time.clock()-nowt)
#
# delay()



import time
start_time = time.time()
# Your code here
time.sleep(5)
print(time.time() - start_time, "seconds")

