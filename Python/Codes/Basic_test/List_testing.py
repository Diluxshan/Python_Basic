val = input(">")
word = val.split(' ')

smily ={
    "sm" : "😊",
    "sd" : "☹",
    "lv" : "❤"
}

output = ""
for wrd in word:
    output += smily.get(wrd,wrd)+ " "

print(output)
