from firebase import firebase
import requests


fbcon = firebase.FirebaseApplication('https://pythontesting-45003.firebaseio.com', None)

val = '-LjQE_Ht3E89XXD5cMJx'

result2 = fbcon.get('/MyTestData/', None)


print(result2)
print(len(result2))
#code for update to gi
# thub

