/*Word Decryption3
Johan has an encrypted document which contains his personal information. He want to decrypt the information contained in the document to get the original message. So he plans to decrypt the information using an algorithm as given below.
1.	Decrypt the information in words
2.	Each character in a word decrypted as below
a.	Key value given in Input2

b.	Mathematically give each letter(both upper and lower case) a number
 
c.	Decrypt each character in the word as (character value  - key value)%26
Example: Character need to decrypt: ‘V’, Input2 is 20
		  Value for ‘V’=21
		 Key for ‘V’ is Y, value for ‘Y’=24
                                        (21-24)%26=>(-3+25)%26=22, character for 22 is ‘w’
      Encrypted character for ‘V’: ‘W’ 
Note: if (character value  - key value) produces negative value than add 25 before performing modulo operation.
d.	If the character is lower case then encrypt it as lower.
e.	If the character is upper case then encrypt it as upper case.
Example1: 
      Input1: qCJLInYWB
      Input2:20
      Encrypted words: Wipro Tech

Explanation: 
First Word: qCJLI
Character value	Key value	(character value –key value)%26	Decrypted character
q-16	20	22	W
C-2	20	8	i
J-9	20	15	p
L-11	20	17	r
I-8	20	14	o 

    Decrypted first word: Wipro		
Same way decrypt all other words.

Try to help him by writing the code for decryption using the function decrypt as given below 
 String decrypt(String Input1,int Input2)
{
   //write your code here
retrundecryptedstring;
}
*/package Logicalms4;

public class EncryptedWord
{
public static String decrypt(String input1,int input2)
{
	String decryptedString="";
	for (int i = 0; i < input1.length(); i++)
	{
	char ch=input1.charAt(i);
	if(Character.isUpperCase(ch))
	{
		ch=Character .toLowerCase(ch);
	}
	else
	{
		ch=Character .toUpperCase(ch);
	}
	
	int n=ch;
	if(n>=97)
	{
	n=n-96;
	n=(n-input2+26)%26;
	decryptedString+=String.valueOf((char)(n+96));
	}
	else
	{
		n=n-64;
		n=(n-input2+26)%26;
		decryptedString+=String.valueOf((char)(n+64));
	}
	}
	return decryptedString;
	
}
	

  	public static void main(String[] args) 
    {
		
System.out.println(decrypt("qCJLInYWB",20));
	}

}
