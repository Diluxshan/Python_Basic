
import time
import multiprocessing

def deposit(balance):
    for i in range (100):
        time.sleep(0.01)
        balance.value=balance.value + 1

def withdraw(balance):
    for i in range(100):
        time.sleep(0.01)
        balance.value = balance.value+1

if __name__ == '__main__':
    balance = multiprocessing.Value('i',200)

    d = multiprocessing.Process(target=deposit, args(balance))
    w = multiprocessing.Process(target=withdraw, args(balance))

    d.start()
    w.start()
    print(balance.value)