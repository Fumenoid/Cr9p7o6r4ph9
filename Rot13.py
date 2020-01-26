#ROT13\s(encoder|decoder)
#ROT13 is the special case of (Shift Cipher|Caesor Cipher), in which the letter gets replaced by it's 13th element from it's index.
alcaps="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
alsmal="abcdefghijklmnopqrstuvwxyz"
print("ROT13 is the special case of (Shift Cipher|Caesor Cipher), in which the letter gets replaced by it's 13th element from it's index.")
string=input("Enter the string for ROT13\n")
rstring=''
for i in range(len(string)):    
    if string[i].islower():
        index=alsmal.find(string[i])
        rstring=rstring+alsmal[(index+13)%26]
    elif string[i].isupper():
        index=alcaps.find(string[i])
        rstring=rstring+alcaps[(index+13)%26]
    else:
        rstring=rstring+string[i]
print("After ROT13 :\n"+rstring)
        


