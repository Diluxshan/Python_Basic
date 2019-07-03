
import time
import datetime

def tim(timeout=5):
    #for x in range(10):
        #print("Hello world...!")
        #time.sleep(1)


    a = datetime.datetime.now()
    time.sleep(5)
    b = datetime.datetime.now()

    elap = b-a
    print(elap)

tim()