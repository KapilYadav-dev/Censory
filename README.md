# Censory

A small library which will convert censored words to * so that we can process string on frontend side : )
# Implementation
<p>Add jitpack to your maven sources</p>
<div class="highlight highlight-source-groovy"><pre>allprojects {
    repositories {
        <span class="pl-k">..</span>.
        maven { url <span class="pl-s"><span class="pl-pds">"</span>https://jitpack.io<span class="pl-pds">"</span></span> }
    }
}</pre></div>
<p>Add Censory as a dependency to your <code>build.gradle</code></p>
<div class="highlight highlight-source-groovy"><pre>dependencies {
    implementation <span class="pl-s"><span class="pl-pds">'</span>com.github.KapilYadav-dev:Censory:1.0.4<span class="pl-pds">'</span></span>
}</pre></div>


# Usage
1) Use with default list 
2) Use with custom list

# Use with default list
String string ="Your string";<br />
Censory censory = new Censory();<br />
String output=censory.defaultCensor(string,context);<br />

# Use with custom list
String string ="Your string";<br />
List<String> words =Arrays.asList("head", "now");<br />
Censory censory = new Censory();<br />
String output=censory.customCensor(string,words);<br />
