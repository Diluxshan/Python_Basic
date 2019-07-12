import pip
import csv

csvData = [['Name','Age'],['Sathu','22'], ['Jasmi','21'],['Dilu','25']]
with open('testing.csv', 'w') as csvFile:
    writer = csv.writer(csvFile)
    writer.writerows(csvData)
csvFile.close()


