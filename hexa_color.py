import string
import random
alpha=string.ascii_lowercase
num=list(range(0,10))
num2=list(range(0,255))
for i in num:
    alpha+=str(i)
# print(alpha)
def hexa_color(l):
    hexa_color_val=""
    count=0
    for i in range(0,len(l)):
        if count<6:
            val=random.randint(0,len(l))
            hexa_color_val+=l[val]
            count+=1
    return "#"+hexa_color_val
# hexa_color(alpha)
def genetrate_hexa_color(l,n):
    hexa=[]
    count=0
    for i in range(0,n):
        if count<n:
            hexa.append(hexa_color(l))
    return hexa
# print(genetrate_hexa_color(alpha,3))
def rgb_color(l):
    rgb_color_list=[]
    rgb_color=""
    count=0
    val=0
    for i in range(0,len(l)):
        if count<3:
            val=random.randint(0,len(l)-1)
            rgb_color=l[val]
            rgb_color_list.append(rgb_color)
            count+=1
    return f"rgb{tuple(rgb_color_list)}"
print(rgb_color(num2))
def generate_rgb_color(l,n):
    rgb_list=[]
    for i in range(0,n):
        rgb_list.append(rgb_color(num2))
    return rgb_list
print(generate_rgb_color(num2,1))


