# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
# print("Hello world")
# square=lambda c:c**c for c in range(0,7)
# print(square())
# tables=[(i,i**j) for i in range(0,10) for j in range(0,7)]
# print(tables)
# def num(x):
#     return lambda n:n**x
# table=[num(j)(i) for i in range(0,7) for j in range(0,7)]
# print(table)
# countries = [[('Finland', 'Helsinki')], [('Sweden', 'Stockholm')], [('Norway', 'Oslo')]]
# func=lambda x:x.append(n)
# uppercase=[ for i in countries for j in i for n in j]
# print(uppercase)
# countries = [[('Finland', 'Helsinki')], [('Sweden', 'Stockholm')], [('Norway', 'Oslo')]]
# dic=[{'country':k[0].upper(),'city':k[1].upper()} for i in countries for k in i]
# print(dic)
# names = [[('Asabeneh', 'Yetayeh')], [('David', 'Smith')], [('Donald', 'Trump')], [('Bill', 'Gates')]]
# # output
# # ['Asabeneh Yetaeyeh', 'David Smith', 'Donald Trump', 'Bill Gates']
# output=[k[0]+" "+k[1] for i in names for k in i]
# print(output)
# output1=[(i**j) for i in range(0,7) for j in range(0,7)]
# print(output1)
countries = [[('Finland', 'Helsinki')], [('Sweden', 'Stockholm')], [('Norway', 'Oslo')]]
# output:
# [['FINLAND','FIN', 'HELSINKI'], ['SWEDEN', 'SWE', 'STOCKHOLM'], ['NORWAY', 'NOR', 'OSLO']]
table=[[j[0].upper(),k[0:3].upper(),j[1].upper()] for i in countries for j in i for k in j]
print(table)