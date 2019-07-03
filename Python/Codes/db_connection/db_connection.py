
import mysql.connector
import datetime
import os
import mysql


def db_con():
    connection = mysql.connector.connect(host="localhost", database="dilux2", user="user2", passwd="dilux123")

    try:
        cursor = connection.cursor()
        cursor.execute("select*from detail ")

        result = cursor.fetchall()
        rows = int(cursor.rowcount)

        cursor.close()
        connection.close()

        print(result)
        print(rows)

        if result != 0:
            print("The data was successfully Read")

        else:
            print("There are no any Rows added....!")


    except:
        print("This is not the actual value.")

if __name__ == '__main__':
    db_con()

    print(datetime.date.today())