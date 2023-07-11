Question:10 Problem: The Secret Message Decoder

You are a software engineer at a secret spy agency. The agency often receives secret messages encoded in Unicode. Your task is to build a method that accepts a character and displays its Unicode, helping the agents decode the messages quickly and efficiently.

Class Definition:

public class MessageDecoder {

public int decodeCharacter(char ch);

}

Inputs:

The method decodeCharacter(char ch) will receive one parameter:

- ch : a character representing the encoded message.

Outputs:

The method will return an integer - the Unicode of the received character.

Example:

Sample Input:

MessageDecoder decoder = new MessageDecoder();

decoder.decodeCharacter('A');

Sample Output:

65

Note:

In the sample input, the spy agency has received a message with the character 'A'. The Unicode for 'A' is 65, so the method returns 65 as the output. Your method will play a crucial role in decoding the secret messages and ensuring the success of the agency's missions. Good luck, coder agent!