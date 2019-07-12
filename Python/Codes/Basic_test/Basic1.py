import time
import datetime


#1 Argument pass with parameter.
def val(d):
   print(d)

   # # print('Enter the name:')
   # na=input('Enter the name:')
   # print('Welcome '+na)

val('\n1. name')

#============================================


#2 class verification
class clas():
    def fun(self):
        print('\n2. Hello...Im CAR')
        print('2. This is non Static Method..')
#============================================


#3 Staticmethod
class Static():
    @staticmethod
    def stat():
        print('\n3. This is Static Method...')
#============================================


#4 Inheritance
class version1():
    @staticmethod
    def v1():
        print('\n4. This is Version 1..(inheritance)')
        print('4. This is Version 1-copied..(inheritance)')

class version2(version1):
    def v2(self):
        print('\n4. This is Version 2..-NonStatic(inheritance)')

class version3(version2):
    def v3(self):
        print('\n4. This is Version 3..-NonStatic(inheritance)')
        print("")

    def timing(self):
        for x in range(20):
            print("helo worls...!")
            # time.sleep(1)

def new():
    print("hello..!")

new()
#============================================
if __name__ == '__main__':
    obj=clas()
    obj.fun()

    Static.stat()

    version2.v1()

    inherit = version2()
    inherit.v2()

    print('\\n')
    time = str(datetime.datetime.today())
    print(time)

    cls3=version3()
    cls3.timing()