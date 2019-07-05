import requests

payload = {'username':'Diluxshan', 'password':'dilux123'}
val = requests.post("https://httpbin.org/post", data=payload)

print(val.status_code)
print(val.text)

print("===========================================================")

val2 = val.json()
print(val2['form'])


# if resp.status_code == 200:
#     print(resp)




