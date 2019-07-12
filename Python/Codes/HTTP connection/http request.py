
import csv
import datetime
import requests
import os.path

#Just put r before your normal string it converts normal string to raw string
with open(r'C:\Users\envy pc\Downloads\Register_User.csv','rb') as f:
    r = requests.post('http://httpbin.org/post', data={'Register_User.csv':f})

if r.status_code==200:
    print(r.text)

else:
    print("Something Wrong..!")


def testin():
    print("Hello this is call funtion for ")