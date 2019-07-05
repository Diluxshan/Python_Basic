
import csv
import datetime
import requests

with open('person.csv','rb') as f:
    r = requests.post('http://httpbin.org/post', data={'person.csv':f})

if r.status_code==200:
    print(r.text)

else:
    print("Something Wrong..!")