'''write a program to fill in a letter templete given below with name and date
letter = Dear <|Name|>,
You are Selected!
<|Date|>s '''


letter = '''Dear <|Name|>,
You are selected!

Date: <|Date|>
'''
name = input("Enter your name\n")
date = input("Enter Date\n")
letter = letter.replace("<|Name|>",name)
letter = letter.replace("<|Date|>",date)
print(letter)