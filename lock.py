import threading
import time
import inspect

class Thread(threading.Thread):
    def __init__(self, t, *args):
        threading.Thread.__init__(self, target=t, args=args)
        self.start()

count = 0
lock = threading.Lock()

def incre():
    global count
   # caller = inspect.getouterframes(inspect.currentframe())[1][3]

    print('\nThe value is ({})'.format(count))
    print ('Acquiring lock')
    with lock:
        print('Lock Acquired \n')

        count += 1
      #  time.sleep(2)

def test1():
    while count < 5:
        incre()
        time.sleep(2)
def test2():
    while count < 6:
        incre()
        print('Its working...!')

def main():
    hello = Thread(test1)
    goodbye = Thread(test2)


if __name__ == '__main__':
    main()