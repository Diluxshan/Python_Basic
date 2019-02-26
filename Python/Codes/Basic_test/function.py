
def say_Hi():
    print("hello it is Dilux..!")

say_Hi()

class check():
    def cc(self):
        print('ho')

    @staticmethod
    def dd():
        print('dddddd')


if __name__ == '__main__':
    c=check()
    c.cc()

    check.dd()