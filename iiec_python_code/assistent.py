

import pyttxs3
import  os
pyttsx3.speak("welcome vikash I am your Assistent what can I do for you")

while True:
	print("Tell me How may I help you ?")
	pyttsx3.speak("Tell me How may I help you ?")
	p = input().lower

if (("run" in p) or ("open" in p) or ("launch" in p)) and (("notepad" in p) or ("editor" in p)):
	pyttsx3.speak("Opening notepad for you please wait")
	os.system("notepad")

 elif (("run" in p) or ("open" in p) or ("launch" in p)) and (("chrome" in p) or ("browser" in p)):
	pyttsx3.speak("Opening chrome for you please wait")
	os.system("chrome")
	
	
 elif (("run" in p) or ("open" in p) or ("launch" in p)) and (("music player" in p) or ("media player" in p)):
	pyttsx3.speak("Opening media player for you please wait")
	os.system("wmplayer")
	
	
 elif (("run" in p) or ("open" in p) or ("launch" in p)) and (("virtualbox" in p) or ("vm" in p)):
	pyttsx3.speak("Opening virtualbox for you please wait")
	os.system("virtualbox")
	
	
 elif (("run" in p) or ("open" in p) or ("launch" in p)) and (("linkedin" in p)):
	pyttsx3.speak("Opening linkedin for you please wait")
	os.system("chrome linkedin.com")
	
 elif ("exit" in p) or ("quit" in p) or ("shutdown" in p) or ("close" in p) or ("kill" in p) or ("stop" in p):
	pyttsx3.speak("Shutting down ")
	break
        
 elif (("run" in p) or ("open" in p) or ("launch" in p)) and (("telegram" in p)):
	pyttsx3.speak("Opening telegram for you please wait")
	os.system("telegram")
	
	
 elif (("run" in p) or ("open" in p) or ("launch" in p)) and (("zoom" in p)):
	pyttsx3.speak("Opening zoom for you please wait")
	os.system("zoom")
	
	
 elif (("run" in p) or ("open" in p) or ("launch" in p)) and (("virtualbox" in p) or ("vm" in p)):
	pyttsx3.speak("Opening virtualbox for you please wait")
	os.system("virtualbox")
	
 elif (("run" in p) or ("open" in p) or ("launch" in p)) and (("excel" in p)):
	pyttsx3.speak("Opening excel for you please wait")
	os.system("excel")
	
	
 else:
	pyttsx3.speak("such application doesn't exist in your computer plz tell again")
	
	