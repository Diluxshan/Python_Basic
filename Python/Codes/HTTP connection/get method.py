import requests

payload = {'page':2, 'count':25}
val = requests.get("https://httpbin.org/get", params=payload)

print(val.status_code)
print(val.text)


# if resp.status_code == 200:
#     print(resp)




