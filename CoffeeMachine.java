<html>
<head>
<title>CoffeeMachine.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #7a7e85;}
.s4 { color: #2aacb8;}
.s5 { color: #6aab73;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
CoffeeMachine.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">machine</span><span class="s2">;</span>

<span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">util</span><span class="s2">.</span><span class="s1">Scanner</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">CoffeeMachine </span><span class="s2">{</span>
    <span class="s0">public static void </span><span class="s1">main</span><span class="s2">(</span><span class="s1">String</span><span class="s2">[] </span><span class="s1">args</span><span class="s2">) {</span>
        <span class="s3">//values given that the machine will start out with</span>
        <span class="s0">int </span><span class="s1">tot_water </span><span class="s2">= </span><span class="s4">400</span><span class="s2">;</span>
        <span class="s0">int </span><span class="s1">tot_milk </span><span class="s2">= </span><span class="s4">540</span><span class="s2">;</span>
        <span class="s0">int </span><span class="s1">tot_beans </span><span class="s2">= </span><span class="s4">120</span><span class="s2">;</span>
        <span class="s0">int </span><span class="s1">tot_cups </span><span class="s2">= </span><span class="s4">9</span><span class="s2">;</span>
        <span class="s0">int </span><span class="s1">tot_money </span><span class="s2">= </span><span class="s4">550</span><span class="s2">;</span>

        <span class="s3">//start the machine using the above inputs</span>
        <span class="s1">startMachine</span><span class="s2">(</span><span class="s1">tot_water</span><span class="s2">, </span><span class="s1">tot_milk</span><span class="s2">, </span><span class="s1">tot_beans</span><span class="s2">, </span><span class="s1">tot_cups</span><span class="s2">, </span><span class="s1">tot_money</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s3">//method to print the machine stats, used primarily to avoid constantly typing it out</span>
    <span class="s3">//in a real coffee machine scenario, would be useful to change the machines response to users</span>
    <span class="s0">private static void </span><span class="s1">printMachineStats</span><span class="s2">(</span><span class="s0">int </span><span class="s1">tot_water</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_milk</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_beans</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_cups</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_money</span><span class="s2">) {</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;The coffee machine has:&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s1">tot_water </span><span class="s2">+ </span><span class="s5">&quot; ml of water&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s1">tot_milk </span><span class="s2">+ </span><span class="s5">&quot; ml of milk&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s1">tot_beans </span><span class="s2">+ </span><span class="s5">&quot; g of coffee beans&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s1">tot_cups </span><span class="s2">+ </span><span class="s5">&quot; disposable cups&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;$&quot; </span><span class="s2">+ </span><span class="s1">tot_money </span><span class="s2">+ </span><span class="s5">&quot; of money&quot;</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s3">//method to check the current inventory levels of the machine</span>
    <span class="s3">//takes the several different amount of resources need for each type of coffee</span>
    <span class="s3">//if the levels are less than needed will print what resource is needed</span>
    <span class="s0">private static boolean </span><span class="s1">checkOutOfInventory</span><span class="s2">(</span><span class="s1">String user_order</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_water</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_milk</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_beans</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_cups</span><span class="s2">){</span>
        <span class="s0">boolean </span><span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">false</span><span class="s2">;</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;1&quot;</span><span class="s2">)) {</span>
            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_water </span><span class="s2">&lt; </span><span class="s4">250</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough water!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_beans </span><span class="s2">&lt; </span><span class="s4">16</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough beans!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_cups </span><span class="s2">&lt; </span><span class="s4">1</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough cups!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>
        <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;2&quot;</span><span class="s2">)){</span>
            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_water </span><span class="s2">&lt; </span><span class="s4">350</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough water!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_milk </span><span class="s2">&lt; </span><span class="s4">75</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough milk!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_beans </span><span class="s2">&lt; </span><span class="s4">20</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough beans!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_cups </span><span class="s2">&lt; </span><span class="s4">1</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough cups!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

        <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;3&quot;</span><span class="s2">)){</span>
            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_water </span><span class="s2">&lt; </span><span class="s4">200</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough water!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_milk </span><span class="s2">&lt; </span><span class="s4">100</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough milk!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_beans </span><span class="s2">&lt; </span><span class="s4">12</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough beans!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">tot_cups </span><span class="s2">&lt; </span><span class="s4">1</span><span class="s2">){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Sorry, not enough cups!&quot;</span><span class="s2">);</span>
                <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>
            <span class="s2">}</span>
        <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
            <span class="s1">out_of_resource </span><span class="s2">= </span><span class="s0">false</span><span class="s2">;</span>
        <span class="s2">}</span>

        <span class="s0">return </span><span class="s1">out_of_resource</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s3">//method representing the running of the coffee machine</span>
    <span class="s3">//use a while loop to accept inputs from the user and if they match the commands</span>
    <span class="s3">//then to perform the command as requested by the user</span>
    <span class="s3">//puts all user inputs to lower case to avoid the use of capitalization</span>
    <span class="s3">//tracks the number of resources input at the beginning of the program</span>
    <span class="s0">private static void </span><span class="s1">startMachine</span><span class="s2">(</span><span class="s0">int </span><span class="s1">tot_water</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_milk</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_beans</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_cups</span><span class="s2">, </span><span class="s0">int </span><span class="s1">tot_money</span><span class="s2">){</span>
        <span class="s1">Scanner scanner </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Scanner</span><span class="s2">(</span><span class="s1">System</span><span class="s2">.</span><span class="s1">in</span><span class="s2">);</span>
        <span class="s0">boolean </span><span class="s1">start </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>


        <span class="s0">while</span><span class="s2">(</span><span class="s1">start </span><span class="s2">== </span><span class="s0">true</span><span class="s2">){</span>
            <span class="s3">//printMachineStats(tot_water, tot_milk, tot_beans, tot_cups, tot_money);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Write action (buy, fill, take, remaining, exit):&quot;</span><span class="s2">);</span>
            <span class="s1">String user_input </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

            <span class="s0">if</span><span class="s2">(</span><span class="s1">user_input</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;buy&quot;</span><span class="s2">)){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino, back - to main menu:&quot;</span><span class="s2">);</span>
                <span class="s1">String user_order </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>
                <span class="s0">if </span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;1&quot;</span><span class="s2">)){</span><span class="s3">//espresso</span>
                    <span class="s0">if</span><span class="s2">(</span><span class="s1">checkOutOfInventory</span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">, </span><span class="s1">tot_water</span><span class="s2">, </span><span class="s1">tot_milk</span><span class="s2">, </span><span class="s1">tot_beans</span><span class="s2">, </span><span class="s1">tot_cups</span><span class="s2">) == </span><span class="s0">false</span><span class="s2">){</span>
                        <span class="s1">tot_money </span><span class="s2">+= </span><span class="s4">4</span><span class="s2">;</span>
                        <span class="s1">tot_water </span><span class="s2">-= </span><span class="s4">250</span><span class="s2">;</span>
                        <span class="s1">tot_beans </span><span class="s2">-= </span><span class="s4">16</span><span class="s2">;</span>
                        <span class="s1">tot_cups </span><span class="s2">-= </span><span class="s4">1</span><span class="s2">;</span>
                        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;I have enough resources, making you a coffee&quot;</span><span class="s2">);</span>
                    <span class="s2">}</span>

                <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;2&quot;</span><span class="s2">)) {</span><span class="s3">//latte</span>
                    <span class="s0">if</span><span class="s2">(</span><span class="s1">checkOutOfInventory</span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">, </span><span class="s1">tot_water</span><span class="s2">, </span><span class="s1">tot_milk</span><span class="s2">, </span><span class="s1">tot_beans</span><span class="s2">, </span><span class="s1">tot_cups</span><span class="s2">) == </span><span class="s0">false</span><span class="s2">){</span>
                        <span class="s1">tot_water </span><span class="s2">-= </span><span class="s4">350</span><span class="s2">;</span>
                        <span class="s1">tot_milk </span><span class="s2">-= </span><span class="s4">75</span><span class="s2">;</span>
                        <span class="s1">tot_beans </span><span class="s2">-= </span><span class="s4">20</span><span class="s2">;</span>
                        <span class="s1">tot_cups </span><span class="s2">-= </span><span class="s4">1</span><span class="s2">;</span>
                        <span class="s1">tot_money </span><span class="s2">+= </span><span class="s4">7</span><span class="s2">;</span>
                        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;I have enough resources, making you a coffee&quot;</span><span class="s2">);</span>
                    <span class="s2">}</span>

                <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;3&quot;</span><span class="s2">)){</span><span class="s3">//cappuccino</span>
                    <span class="s0">if</span><span class="s2">(</span><span class="s1">checkOutOfInventory</span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">, </span><span class="s1">tot_water</span><span class="s2">, </span><span class="s1">tot_milk</span><span class="s2">, </span><span class="s1">tot_beans</span><span class="s2">, </span><span class="s1">tot_cups</span><span class="s2">) == </span><span class="s0">false</span><span class="s2">){</span>
                        <span class="s1">tot_water </span><span class="s2">-= </span><span class="s4">200</span><span class="s2">;</span>
                        <span class="s1">tot_milk </span><span class="s2">-= </span><span class="s4">100</span><span class="s2">;</span>
                        <span class="s1">tot_beans </span><span class="s2">-= </span><span class="s4">12</span><span class="s2">;</span>
                        <span class="s1">tot_cups </span><span class="s2">-= </span><span class="s4">1</span><span class="s2">;</span>
                        <span class="s1">tot_money </span><span class="s2">+= </span><span class="s4">6</span><span class="s2">;</span>
                        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;I have enough resources, making you a coffee&quot;</span><span class="s2">);</span>
                    <span class="s2">}</span>
                <span class="s2">} </span><span class="s0">else if</span><span class="s2">(</span><span class="s1">user_order</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;back&quot;</span><span class="s2">)) {</span>
                    <span class="s3">//System.out.println(&quot;Sorry we do not have that!&quot;);</span>
                <span class="s2">}</span>
            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">user_input</span><span class="s2">.</span><span class="s1">toLowerCase</span><span class="s2">().</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;fill&quot;</span><span class="s2">)){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Write how many ml of water you want to add:&quot;</span><span class="s2">);</span>
                <span class="s0">int </span><span class="s1">user_input_int </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextInt</span><span class="s2">();</span>
                <span class="s1">tot_water </span><span class="s2">+= </span><span class="s1">user_input_int</span><span class="s2">;</span>

                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Write how many ml of milk you want to add:&quot;</span><span class="s2">);</span>
                <span class="s1">user_input_int </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextInt</span><span class="s2">();</span>
                <span class="s1">tot_milk </span><span class="s2">+= </span><span class="s1">user_input_int</span><span class="s2">;</span>

                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Write how many grams of coffee beans you want to add:&quot;</span><span class="s2">);</span>
                <span class="s1">user_input_int </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextInt</span><span class="s2">();</span>
                <span class="s1">tot_beans </span><span class="s2">+= </span><span class="s1">user_input_int</span><span class="s2">;</span>

                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Write how many disposable cups you want to add:&quot;</span><span class="s2">);</span>
                <span class="s1">user_input_int </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextInt</span><span class="s2">();</span>
                <span class="s1">tot_cups </span><span class="s2">+= </span><span class="s1">user_input_int</span><span class="s2">;</span>

            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">user_input</span><span class="s2">.</span><span class="s1">toLowerCase</span><span class="s2">().</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;take&quot;</span><span class="s2">)){</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;I gave you $&quot; </span><span class="s2">+ </span><span class="s1">tot_money</span><span class="s2">);</span>
                <span class="s1">tot_money </span><span class="s2">= </span><span class="s4">0</span><span class="s2">;</span>
            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">user_input</span><span class="s2">.</span><span class="s1">toLowerCase</span><span class="s2">().</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;remaining&quot;</span><span class="s2">)){</span>
                <span class="s1">printMachineStats</span><span class="s2">(</span><span class="s1">tot_water</span><span class="s2">, </span><span class="s1">tot_milk</span><span class="s2">, </span><span class="s1">tot_beans</span><span class="s2">, </span><span class="s1">tot_cups</span><span class="s2">, </span><span class="s1">tot_money</span><span class="s2">);</span>
            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">user_input</span><span class="s2">.</span><span class="s1">toLowerCase</span><span class="s2">().</span><span class="s1">equals</span><span class="s2">(</span><span class="s5">&quot;exit&quot;</span><span class="s2">)){</span>
                <span class="s1">start </span><span class="s2">= </span><span class="s0">false</span><span class="s2">;</span>
            <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;You have entered an invalid action, please enter (buy, fill, take)&quot;</span><span class="s2">);</span>

            <span class="s2">}</span>
        <span class="s2">}</span>
    <span class="s2">}</span>
<span class="s2">}</span>
</pre>
</body>
</html>