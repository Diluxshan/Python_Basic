from firebase import firebase
import requests


fbcon = firebase.FirebaseApplication('https://pythontesting-45003.firebaseio.com', None)

name = str(input("What is the Name :"))
age = int(input("What is the Age :"))

sync_to_cloud = {
    "name": name,
    "age" : age
}

# result = fbcon.post('/MyTestData', sync_to_cloud)
result = fbcon.post('/MyTestData', sync_to_cloud)
print(result)

result2 = fbcon.get('/MyTestData/', None)
print(result2)