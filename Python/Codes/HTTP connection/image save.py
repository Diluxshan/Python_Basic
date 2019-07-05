import requests

resp = requests.get("https://files.realpython.com/media/API-Integration-in-Python_watermark.c7945f579b25.jpg")

print(resp.status_code)

with open('python_tst.jpg','wb') as f:
    f.write(resp.content)

