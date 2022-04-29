'''Create an empty dictionary. Allow 4 friends to enter their favourite language
 as values and use keys as their names. 
 Assume that the names are unique '''

favLang = {}
a = input("Enter your favorite language Shubham\n")
b = input("Enter your favorite language Ankit\n")
c = input("Enter your favorite language Sonali\n")
d = input("Enter your favorite language Harshita\n")
# e = input("Enter your favorite language Shubham\n")

favLang['Shubham'] = a
favLang['Ankit'] = b
favLang['Sonali'] = c
favLang['Harshita'] = d

print(favLang)