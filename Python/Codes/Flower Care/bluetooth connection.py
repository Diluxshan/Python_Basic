import sched, time
import datetime

s = sched.scheduler(time.time, time.sleep)
time=str(datetime.datetime.today())

def do_something(sc):
    print("\nWakeup..!")
    print ("Doing stuff one...")
    print(time)
    # do your stuff
    s.enter(2, 2, do_something, (sc,))
    print("Going to sleep")

s.enter(5, 5, do_something, (s,))
s.run()
