'''Write a program to create a dictionary of Hindi words
with values as their english translation.
Provide user with an option to look it up! '''


myDict = {
    "Dabba": "box",
    "kela": "banana",
    "khana": "food"
}
# here myDict.keys() will show the options
print("the options are:-", myDict.keys())
a = input("enter you choice :- \n")
#print("meaning of your choice is", myDict[a])

# Below line will not throw an error if the key is not present in the dictionary
print("The meaning of your word is :", myDict.get(a))


# myDict = {
#     "Pankha": "Fan",
#     "Dabba": "Box",
#     "Vastu": "Item"
# }
# print("Options are", myDict.keys())
# a = input("Enter the Hindi Word\n")
# # print("The meaning of your word is :", myDict[a])

# # Below line will not throw an error if the key is not present in the dictionary
# print("The meaning of your word is:", myDict(a))
