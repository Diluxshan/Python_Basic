print("It's List and Array in Python...!")

arr = ['A','B','C','D','E']
num = ['10','20','30','40','50']

print(arr[2])
print(arr[2:])

# it should be dont take 4th element.
print(arr[2:4])

# arr.extend(num)
print(arr)

arr.append('extra adding')
print(arr)

arr.insert(2,'Arring insert')
print(arr)

print(arr.pop())
print()