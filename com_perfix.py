# COMMON PREFIX
# s=['flow','flower','flome']
s=['sun','five','son']
sorted=list(set(s))
print(sorted)
k=sorted[0]
r=""
count=0
for i in sorted:
    if count<len(s):
        if k[count]==i[count]:
            r=r+i[count]
            count+=1
        else:
            if count<2:
if count<2:
    print('no common prefix')
print(r)
