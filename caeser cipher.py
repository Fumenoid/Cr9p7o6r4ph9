alcaps="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
alsmal="abcdefghijklmnopqrstuvwxyz"
def encryption():
    rstring=''
    string=input("Enter the string to be Encrypted\n")
    key=int(input("Enter the key to Encrypt with\n"))
    for i in range(len(string)):    
        if string[i].islower():
            index=alsmal.find(string[i])
            rstring=rstring+alsmal[(index+key)%26]
        elif string[i].isupper():
            index=alcaps.find(string[i])
            rstring=rstring+alcaps[(index+key)%26]
        else:
            rstring=rstring+string[i]
    print("Encrpted string is\n"+rstring)

def decryption():
    rstring=''
    string=input("Enter the string to be Decrypted\n")
    key=int(input("Enter the key to Decrypt with\n"))
    for i in range(len(string)):    
        if string[i].islower():
            index=alsmal.find(string[i])
            rstring=rstring+alsmal[(index-key)%26]
        elif string[i].isupper():
            index=alcaps.find(string[i])
            rstring=rstring+alcaps[(index-key)%26]
        else:
            rstring=rstring+string[i]
    print("Decrpted string is\n"+rstring)

print("\nThis program encrypts or decrypts a message using caesor cipher technique")
while True:
    i=input("\nEnter 1 to encrpyt, 2 to decrypt, 0 to quit\n")
    if i=='0':
        print("Exiting..")
        break
    elif i=='1':
        encryption()
    elif i=='2':
        decryption()
    else:
        print("Invalid input")

