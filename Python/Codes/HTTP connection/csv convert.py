import pip
import csv

csvData = [['Person','Age'],['Peter','22'], ['Jasmine','21'], ['Sam','24'],['Dilu','25']]
with open('person.csv', 'w') as csvFile:
    writer = csv.writer(csvFile)
    writer.writerows(csvData)
csvFile.close()


