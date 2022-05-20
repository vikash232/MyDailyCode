import pyttsx3
import os
pyttsx3.speak("welcome vikash I am your Assistent what can I do for you")


while True:
    print(" Please tell Me How may I help you ?")
    pyttsx3.speak("Please tell Me How may I help you ?")
    p = input().lower()

       

    if  (("run" in p) or  ("open" in p) or ("launch" in p))  and  (("chrome" in p) or  ("browser" in p)) :
             pyttsx3.speak("Opening chrome for you please wait")
             os.system("chrome")
	
    elif  (("run" in p) or  ("open" in p) or ("launch" in p))  and  (("notepad" in p) or  ("editor" in p)) :
             pyttsx3.speak("Opening notepad for you please wait")
             os.system("notepad")

    elif  (("run" in p) or  ("open" in p) or ("launch" in p))  and  (("virtualbox" in p)) :
             pyttsx3.speak("Opening virtualbox for you please wait")
             os.system("virtualbox")


    elif  (("run" in p) or  ("open" in p) or ("launch" in p))  and  (("twitter" in p)) :
             pyttsx3.speak("Opening twitter for you please wait")
             os.system("chrome www.twitter.com")


    elif  (("run" in p) or  ("open" in p) or ("launch" in p))  and  (("facebook" in p)) :
             pyttsx3.speak("Opening facebook for you please wait")
             os.system("chrome facebook.com")

    elif  (("run" in p) or  ("open" in p) or ("launch" in p))  and  (("excel" in p)) :
             pyttsx3.speak("Opening excel for you please wait")
             os.system("excel")

    elif  (("run" in p) or  ("open" in p) or ("launch" in p))  and  (("media player" in p)) :
             pyttsx3.speak("Opening media player for you please wait")
             os.system("wmplayer")

    elif ("exit" in p) or ("quit" in p) or ("shutdown" in p) or ("close" in p) or ("kill" in p) or ("stop" in p):
         pyttsx3.speak("It is good to have you I will always here to help you")
         break
    else:
        pyttsx3.speak("don't support")
	