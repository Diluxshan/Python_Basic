
import mysql.connector
import datetime
import os
import mysql


def db_con():
    connection = mysql.connector.connect(host="localhost", database="dilux2", user="user2", passwd="dilux123")
    cursor = connection.cursor()

    cursor.execute("select*from detail ")
    result = cursor.fetchall()
    rows = int(cursor.rowcount)

    #result2 = cursor.fetchone()
    #result3 = cursor.fetchmany(5)

    print(result)
    print(rows)

    if result !=0 :
        print("The data was successfully Read")

    else:
        print("There are no any Rows added....!")


db_con()

#
# if __name__ == '__main__':
#     while True:
#         db_con()