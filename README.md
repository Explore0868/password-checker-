# Java Login System

A small console program for registering users and trying basic login and account-management flows. User records are held in a `LinkedHashMap` in memory and are lost when the program exits.

## About this project

This was the first program I created after attending classes on exception handling. It took me about two hours to write. I used my own logical thinking for every line and consulted sources only to learn command and method names.

I started working on it during free time after missing class. I was sitting on my bed, revising the text sections out of curiosity, and decided to try something with exceptions. That experiment became this program, and it remains a personal memory of that time.

I want to keep the code in the form I wrote it. I do not want to reshape it into a more popular style or a more polished structure. Any future changes I make will be to fix bugs I did not notice while writing it. When I look back at an earlier version, I sometimes find an unexpected bug; I have already corrected one such bug in the current version.

## Requirements

- JDK 14 or later. The source uses switch expressions; this project was compiled with JDK 17.

## Compile and run

Run these commands from the directory containing the `.java` files:

```sh
javac *.java
java main
```

The program starts with one hard-coded account:

| Username | Password |
| --- | --- |
| `Username` | `Password_123` |

Choose `2` to log in, then enter the username and password. Enter `Exit` at the main menu to quit.

## Menu options

1. Register a user
2. Log in
3. Change the logged-in user's password
4. Set a new password after entering a username
5. Change the logged-in user's username
6. Print registered usernames

Registration asks for a username, a password, and password confirmation. It then asks whether to save the account (`yes` or `save` saves it; `no` discards it).

Usernames must start with a capital letter, be 9–15 characters long, and must not contain `@`, `.`, `_`, `#`, or `$`. Passwords must start with a capital letter, be 9–15 characters long, and contain `_` or `@`.

## Current limitations

This is a personal learning project. The following behaviors and limitations are present in the current code:

- Login checks whether a password matches any value in the map, rather than checking the password for the entered username.
- Password change and recovery rely on shared login state. Password change mishandles invalid new passwords, and recovery changes a password after checking only the username.
- Duplicate usernames can overwrite existing accounts.
- Empty usernames or passwords can cause an uncaught `StringIndexOutOfBoundsException` during validation.
- Account data exists only for the current run, and passwords are stored as plain text. Do not use real or reused passwords.

## Verification performed

The sources compiled successfully with JDK 17 using `javac *.java`. Scripted console runs verified the seeded account login, new-user registration, and password recovery with the seeded account. Additional cases exposed the limitations listed above, including an uncaught exception for an empty registration username and an incorrect password-change path after entering an invalid new password.
