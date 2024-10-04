# Exercise 1

## Task 1 - Print "Hello, World!"

### Configuring Visual Studio Code for Java Development (EEE Lab and vLab Machines)
The EEE lab machines have the Java Runtime Environment (JRE) installed on the "Shared Drive".
To allow the use of Visual Studio Code for programming in Java we need configure Visual Studio Code to use the JRE on the "Shared Drive" and install some plugins.

Below are some steps to run a Windows script to automatically configure the correct JRE path and install the necessary plugins for you.

> [!IMPORTANT]
> These steps are only for working on the QUB EEE lab and vLab machines

> [!WARNING]
> These steps will have to be repeated every time you log onto a new QUB EEE lab or vLab machine

1. Open "Google Chrome" by double clicking on the Desktop icon:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-1.png width=800>

2. Go to https://github.com/dlim04/fundamentals-of-programming-for-engineers-labs/ and click `dlim-configure-vscode-java.bat`:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-2.png width=800>

3. Click the "Download raw file" button:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-3.png width=800>

4. Wait for the file to download and then open the file:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-4.png width=800>

5. Click `More info`:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-5.png width=800>

6. Click the "Run anyway" button:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-6.png width=800>

7. A terminal window should appear.
Wait for the script to output "Complete!" and then press any key to close the teminal window:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-7.png width=800>

You have now successfully configured Visual Studio Code for Java development.

### Creating a Java Project and Running "Hello, World!"

1. Open "Visual Studio Code":
<img src=../assets/class-1-exercise-1/class-1-exercise-1-8.png width=800>

2. A "Getting Started with VS Code" tab may appear. Scroll down and click `Mark Done`:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-9.png width=800>

3. Click the "Explorer" button:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-10.png width=800>

4. Click the "Create Java Project" button:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-11.png width=800>

5. Click `No build tools`
<img src=../assets/class-1-exercise-1/class-1-exercise-1-12.png width=800>

5. A window will appear asking you to select a location to create your Java project folder.
In my case I chose to create a `fundamentals-of-programming-for-engineers-labs` folder in my `Documents` folder.
If you wish to save your lab work across machines you may wish to choose the `I:` drive as the location to create your Java project folder.
Click the "Select the project location" button:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-13.png width=800>

6. Type a name for your Java project and press the "Enter" key.
Here I have chosen the name `lab-1`:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-14.png width=800>

7. Click `src` (shorthand for source) in the "Explorer" sidebar:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-15.png width=800>

8. Open `App.java` by clicking it:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-16.png width=800>

9. Click the "Run" button:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-17.png width=800>

10. A terminal should appear with "Hello , World!" printed in it:
<img src=../assets/class-1-exercise-1/class-1-exercise-1-18.png width=800>

You have successfully run "Hello, World!" in Java.

## Task 2 - Penguin

- Print the following penguin:

```
                         4MMMMMMMMMMMML
                       4MMMMMMMMMMMMMMMML
                      MMMMMMMMMMMMMMMMMMML
                     4MMMMMMMMMMMMMMMMMMMMM
                    4MMMMMMMMMMMMMMMMMMMMMML
                    MMMMP   MMMMMM   MMMMMMM
                    MMMM MM  MMM  MM  MMMMMM
                    MMMM MM  MMM  MM  MMMMML
                     MMM MP,,,,,,,MM  MMMMMM
                      MM,"          "MMMMMMP
                      MMw           'MMMMMM
                      MM"w         w MMMMMMML
                      MM" w       w " MMMoMMML
                     MMM " wwwwwww "  MMMMMMML
                   MMMP   ".,,,,,,"     MMMMMMMML
                  MMMP                    MMMMMMMML
                MMMMM                      MMMMMMMML
               MMMMM,,-''             ''-,,MMMMMMMMML
              MMMMM                          MMMMMMMMML
             MMMMM                            MMMMMMMMML
            MMMMM                             MMMMMMMMMM
            MMMM                               MMMMMMMMMM
           MMMMM                               MMMMMMMMMML
          MMMMM                                MMMMMMMMMMM
         MMMMMM                                MMMMMMMMMMM
         MMMMMMM                               MMMMMMMMMMM
           ""MMMM                             MMMMMMMMMMP
        "     ""MMM                            MMMMMMMMP
   "" "         "MMMMMM                      ""MMMMMP""
 "               "MMMMMMM                   ""        ""   "
 "                ""MMMMMM                 M"             " ""
  "                 "                   MMM"                  "
 "                   "M               MMMM"                   "
 "                    "MM        MMMMMMMMM"                ""
 "                    "MMMMMMMMMMMMMMMMMMM                
                      MMMMMMMMMMMMMMMMMM"           ""
                   ""       MMMMM               "        ""
                     ""                      "  Larry Ewing & r^2
```
