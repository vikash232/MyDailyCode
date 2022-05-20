import os
import pyttsx3

print("Welcome to my menu function How may I help you")
pyttsx3.speak("Welcome to my menu function How may I help you ?")

print("Press 1: to open chrome browser")
print("Press 2: to open chrome editor")
print("Press 3: to open chrome media player")

print("please enter your reqirement: ", end="")
pyttsx3.speak("please enter your reqirement")
p = input()
print(p)

if int(p) == 1:
	pyttsx3.speak("opening browser for you")
	os.system("chrome")
	

elif int(p) == 2:
	pyttsx3.speak("opening editor for you")
	os.system("notepad")
	

elif int(p) == 3:
	pyttsx3.speak("opening media player for you")
	os.system("wmplayer")
	

else:
	pyttsx3.speak("don't support")
	print("don't support")