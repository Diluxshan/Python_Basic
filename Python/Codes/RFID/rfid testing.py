import time
import connection_test


connection_test.con()

def select():
    print("\nSelect your Choice...!\n##############################################\n")
    print("1.Add new user \n2.Show excisting user \n3.Delete user")

    print("\nEnter the number of your Selection:")
    val = input()

    # decision()


def decision():
    try:
        if val == '1':
            print("Your selection is Add user")
            for x in range(0, 2):
                fname = input(print("Enter the First name:"))
                ag_e = input(print("Enter the Age:"))



        elif val == '2':
            print("Your selection is View user")

        elif val == '3':
            print("Your selection is Delete user")

        else:
            print("Wrong Input..!")

        cursor.close()
        connection.close()


    except:
        print("Somthing Went Worng....!")


if __name__ == '__main__':
    while True:
        select()
        decision()

