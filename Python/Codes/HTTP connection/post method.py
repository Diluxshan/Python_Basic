import requests

payload = {'name':'Diluxshan', 'job':'Internship'}
val = requests.post("https://reqres.in/api/users", json=payload)

print(val.status_code)
print(val.text)

#print("===========================================================")
#val2 = val.json()
#print(val2['form'])



