Spartans Cipher
---------------

Published by [Deep Xavier](https://edabit.com/user/a777e8chPvJkY3tKa) on [Edabit](https://edabit.com/challenge/KXs93N4RX6jNSsgCr)

In **Spartans Cipher**, encoding is done by writing the text horizontally, across the strap in the plaintext word of a message. In ancient times, Spartans and Greeks invented an interesting way of encryption called [Scytale](https://en.wikipedia.org/wiki/Scytale).

The ancient Greeks, and the Spartans in particular, are said to have used this cipher to communicate during military campaigns.

Create a function that takes two arguments, a number of slides `nSlide` and a string `message`, and returns the **encoded message**.

There are some variations on the rules of encipherment. One version of the cipher rules are outlined below:

    message = "Mubashir Scytale Code"
    nSlide = 6
    
    cipher(message, nSlide) ➞ "Ms t euhSaC biclo aryed"

**Step 1:** Imagine this Scytale:

![S](https://edabit-challenges.s3.amazonaws.com/199px-Skytale.png)

**Step 2:** You can write the given message on a **6 slide** Scytale like this:

| M | u | b | a |
|---|---|---|---|
| s | h | i | r |
|   | S | c | y |
| t | a | l | e |
|   | C | o | d |
| e |   |   |   |

**Step 3:** Encode the message **column-wise**:

    "Ms t euhSaC biclo aryed "

**Step 4:** Trim **all spaces at the end** and return the final encoded message:

    "Ms t euhSaC biclo aryed"

See below examples for a better understanding:

### Examples

    cipher("IAMSOINLOVEWITHTESHA", 5) ➞ "IOOIEAIVTSMNEHHSLWTA"
    
    cipher("Tesh is the love of my life.", 4) ➞ "T vyete sh lheoi  ffil esom."
    
    cipher("My heart beats for no one but Tesh.", 6) ➞ "Mrt eTytsn e   obshbf uheeoot.aarn"
    
    cipher("Mubashir Scytale Code", 6) ➞ "Ms t euhSaC biclo aryed"
    
    cipher(("Matt and Edabit are amazing", 8) ➞ "M  baai aaEirmn tndteag tda  z"
    
    cipher("", 54) ➞ ""