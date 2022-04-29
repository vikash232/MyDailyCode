myDict = {
    "fast": "In a Quick Manner",
    "harry": "A Coder",
    "marks": [1,2,4],
    "anotherdict": {'harry': 'Player'},
    1:2
}

# Dictionary Methods
print(list(myDict.keys())) # Prints the keys of the dictionary
print(myDict.values()) # Prints the keys of the dictionary
print(myDict.items()) # Prints the (key, value) for all contents of the dictionary
print(myDict)
updateDict = {
    "Lovish": "Friend",
    "Divya": "Friend",
    "Shubham": "Friend",
    "harry": "A Dance"
}
myDict.update(updateDict) # Updates the dictionary by adding key-pairs from updateDict
print(myDict)

print(myDict.get("harry")) # Prints value associated with key "harry"
print(myDict["harry"]) #Prints value associated with key "harry"

# The difference b/w .get and [] syntax in Dictionary?
print(myDict.get("harry2")) #Returns None as harry2 is not present in the dictionary
print(myDict["harry2"]) # Throws an error as harry2 is not present in the dictionary