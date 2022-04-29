# Creating an empty set
b = set()
print(type(b))

# Adding values to an empty set
b.add(4)
b.add(4)
b.add(5)
b.add(5)
b.add(5) # Addomg a value repeatedly does not changes a set
b.add([4, 5, 6]) #cannot be added list because it is mutable or changable
b.add((4, 5, 6)) #can be added because it is tuple and tuple cannot be change mean immutable

## Accessing Elements
# b.add({4:5}) # Cannot add list or dictionary to sets
print(b)

## Length of the Set
print(len(b)) #Prints the length of this set

## Removal of an Item
b.remove(5) #Removes 5 from set b
b.remove(15) # throws an error while trying to remove 15 (which is not present in the set)
print(b)

print(b.pop()) #remvoe the existing no.
print(b)