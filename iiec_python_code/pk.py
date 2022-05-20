import os


x="cd /project"
y= "python3 vkprogram.py"
os.system("ssh root@192.168.56.103 {} {}".format(x,y))
ch = input()
os.system("ssh root@192.168.56.103 {}".format(ch))
input()
