"""
Noah Francois
Shape Drawing Project (Python):
    - Three objects possible to draw. Line, Triangle, or Square. User 
      determines length and width of object.
"""


import turtle
t = turtle.Turtle()

c = input("Enter Color: ")
w = int(input("Enter Width: "))
l = int(input("Enter Length: "))
s = input("Enter shape(line, triangle or square) : ")

if(s == "line"):
    t.color(c)
    t.width(w)
    t.forward(l)

elif(s == "triangle"):
    t.color(c)
    t.width(w)
    t.forward(l)
    t.left(120)
    t.forward(l)
    t.left(120)
    t.forward(l)

elif(s == "square"):
    t.color(c)
    t.width(w)
    t.forward(l)
    t.left(90)
    t.forward(l)
    t.left(90)
    t.forward(l)
    t.left(90)
    t.forward(l)

else:
    print("Invalid Input Detected")


