import random
import string
s1=string.ascii_lowercase
num=list(range(0,10))
for i in num:
    s1+=str(i)
# print(s1)
def username(s,j):
    newuser=""
    count=0
    for i in range(0,len(s)):
        if count<j:
            val=random.randint(0,len(s)-1)
            newuser=newuser+s[val]
            count+=1
    print(newuser)

def user_id_gen_by_user(j,n):
    for i in range(j):
        username(s1,n)
# loop(5,5)
