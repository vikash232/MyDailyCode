# Change the value of list using
a = [1, 2, 3]
a[0] = 98
print(a)

# We can create a list with items of different types
c = [45, "Harry", False, 8.9]
print(c)

# List slicing
friends = ["Harry", "Tom", "Rohan", "Sam", "Divya", 45]
print(friends[0:4])
print(friends[-4:])


def vk():
    for i in a:
        print(i*2)

vk()
