import random
rgb_color=list(range(0,255))
# print(rgb_color)
def rgb(l):
    new_val=[]
    count=0
    for i in range(0,len(rgb_color)):
        if count<3:
            val=random.randint(0,len(rgb_color)-1)
            new_val.append(rgb_color[val])
            count+=1
    return f"rgb{tuple(new_val)}"
print(rgb(rgb_color))