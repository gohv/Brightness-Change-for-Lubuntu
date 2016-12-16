# Brightness-Change-for-Lubuntu
Small Brightness Changer for Lubuntu Desktop - written in Java, executes bash commands to change the brightness on Lubuntu Desktop


This was writtten specifically for my setup of Lubuntu Desktop.
I am using Ubuntu 16.10 with Xfce installed.
My brightness setting file is located in /sys/class/backlight/intel_backlight/brightness, so if you decide to use this, 
you may need to ammend the directory of your brightness settings.
A very important thing is to set the file brightness to rw permissions, otherwise the app wont work,as the app does not
access root privileges.

At this point no exception are cought.
App may be unstable.

Dont use a setting lower than 50!
