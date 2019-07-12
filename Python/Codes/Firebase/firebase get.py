from firebase import firebase
import requests


fbcon = firebase.FirebaseApplication('https://pythontesting-45003.firebaseio.com', None)


result2 = fbcon.get('/MyTestData/-LjQEmW3ukEfSM38jVPL/', None)

print(result2)