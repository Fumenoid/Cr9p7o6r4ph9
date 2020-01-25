import java.util.*;
public class cypherwheel {
    String s;
    String enc="";
    int key, x, y, mkey=0, k, q;
    char alphabets[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char alphad[]={'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
    char alphc[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char alphcd[]={'Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A'};
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        s=scan.nextLine();
        System.out.println("Enter the key");
        key=scan.nextInt();
    }
    public void encypt() {
        for(x=0;x<s.length();x++) {
           if(s.charAt(x)!=32){
               for(y=0;y<26;y++) {
                   if((s.charAt(x)>=97)&&(s.charAt(x)<=122)){
                    if((int)(alphabets[y])==(int)(s.charAt(x))) {
                       mkey=key+y;
                       q=1;
                       break;
                    }  
                   } else if((s.charAt(x)>=65)&&(s.charAt(x)<=90)) {
                    if((int)(alphc[y])==(int)(s.charAt(x))) {
                       mkey=key+y;
                       q=2;
                       break;
                    }  
                   } else{
                       q=0;
                   }
                }
                if(q==1){
                if(mkey<=25){
                   enc=enc+alphabets[mkey];
                } else{
                   mkey %= 26;
                   enc=enc+alphabets[mkey];
                }
                q=0;
                } else if(q==2){
                if(mkey<=25){
                   enc=enc+alphc[mkey];
                } else{
                   mkey %= 26;
                   enc=enc+alphc[mkey];
                }
                q=0;    
                } else{
                    enc=enc+s.charAt(x);
                }
           } else{
               enc=enc+' ';
           }
        }
        System.out.println("Encypted Text");
        System.out.println(enc);
    }
    public void decrypt() {
        for(x=0;x<s.length();x++) {
           if(s.charAt(x)!=32){
               for(y=0;y<26;y++) {
                   if((s.charAt(x)>=97)&&(s.charAt(x)<=122)){
                    if((int)(alphabets[y])==(int)(s.charAt(x))) {
                       mkey=y-key;
                       q=1;
                       break;
                    }  
                   } else if((s.charAt(x)>=65)&&(s.charAt(x)<=90)) {
                    if((int)(alphc[y])==(int)(s.charAt(x))) {
                       mkey=y-key;
                       q=2;
                       break;
                    }  
                   } else{
                       q=0;
                   }
               }
               if(q==1){
                if(mkey>=0){
                   enc=enc+alphabets[mkey];
                } else{
                   mkey *= -1;
                   mkey -=1;
                   enc=enc+alphad[mkey];
                }
                q=0;
               } else if(q==2){
                  if(mkey>=0){
                   enc=enc+alphc[mkey];
                   } else{
                   mkey *= -1;
                   mkey -=1;
                   enc=enc+alphcd[mkey];
                   }
                q=0; 
               } else{
                    enc=enc+s.charAt(x);
               }
           } else{
               enc=enc+' ';
           }
        }
        System.out.println("Decrypted Text");
        System.out.println(enc);
    }
    public static void main(String[] args) {
        int a;
        cypherwheel obj=new cypherwheel();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 0 to cypher and 1 to decypher the text");
        a=scan.nextInt();
        if(a==0) {
            obj.input();
            obj.encypt();
        } else if(a==1){
            obj.input();
            obj.decrypt();
        } else{
         System.out.println("Invalid number entered");
        }
    }
}