
import time
import threading




def a():
    val = 100
    val=val+1
    print(val)

    val2=['hello']
    print(val2*3,'\n')

    ar=[10,20,30,40,50,60]
    ar.insert(0,80)

    print(ar)

    

if __name__ == '__main__':

    a()