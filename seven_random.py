import random
num=list(range(0,10))
random_num=[]
count=0
for i in range(0,len(num)):
    if count<7:
        val=random.randint(0,len(num)-1)
        if num[val] not in random_num:
            random_num.append(num[val])
            count+=1
print(random_num)