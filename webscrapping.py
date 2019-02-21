
import requests
import urllib.request
from bs4 import BeautifulSoup
from urllib.request import urlopen

# def internet_on():
#    try:
#         response = urlopen('https://www.google.com/', timeout=10)
#         print('connected...')
#     except:
#         print('Failed to connect..')

url = 'https://www.senzmate.com/'
source=urllib.request.urlopen(url)
r = requests.get(url)
soup=BeautifulSoup(source, 'html.parser')


try:
    #Print the First Paragraph
    print('\n1.This is First Paragraph.')
    print('==================================')
    first_para=soup.p.getText()
    print(first_para)
    print('\n')

    #Print the All Links in the website...!
    print('\n2.These are Webpage Links.')
    print('==================================')
    links=soup.find_all('a')
    for link in links:
        print(link.get('href'))

    #Print IMage Links..!
    print('\n3.These are image Links.')
    print('==================================')
    images=soup.find_all('img')
    for image in images:
        print(image.get('src'))

except:
    print('Check your Internet.....!')
