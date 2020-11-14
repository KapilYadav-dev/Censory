# Censory

A small library which will convert censored words to * so that we can process string on frontend side : )

# Usage
1) Use with default list 
2) Use with custom list

# Use with default list
String string ="Your string";<br />
Censory censory = new Censory();<br />
String output=defaultCensor(string,context);<br />

# Use with custom list
String string ="Your string";<br />
List<String> words =Arrays.asList("head", "now");<br />
Censory censory = new Censory();<br />
String output=defaultCensor(string,words);<br />
