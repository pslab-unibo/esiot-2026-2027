### Embedded Systems and IoT - ISI LT - a.y. 2026/2027

## Lab Activity #07 - 20261104

v. 1.0.0-20261102

**Synchronous FSM Architecture - First examples & explorations**

Examples about first implementations of synchronous FSMs.

- blinkling sync
  - `blinking_fsm_synch`

- button led sync improvable 
  - `button_led_fsm_synch_first`

- button led sync good
  - `button_led_fsm_synch_improved`

**An IDE for complex projects**

- [PlatformIO IDE (+ Visual Studio Code)](https://platformio.org)
- Installation 
  - [instructions](https://platformio.org/install/ide?install=vscode)
  - [first install VS Code](https://code.visualstudio.com/)
- Install PlatformIO Extension
  - [setup](https://docs.platformio.org/en/latest//integration/ide/vscode.html#quick-start)

**Arduino/PC Communication via Serial Port**

**[Lab Notes] Arduino/PC Serial Communication**
- Material on the repo
  - Java side: `serial/java`
  - Arduino side: `serial/arduino`
- Examples
  - Showing the serial ports
    - Java side (from `serial/java`):  
		`java -cp bin:lib/jssc-2.9.6.jar esiot.serial.ShowSerialPorts`  
      **NOTE**: 
      - the classpath separator (in `bin:lib/jssc-2.9.6.jar`) is `:` in Linux/Mac, `;` in Windows
  - Simple serial monitor
    - Arduino side: 
      - running any program sending messages on the serial port
    - Java side:  
		  - `java -cp bin:lib/jssc-2.9.6.jar esiot.serial.SimpleSerialMonitor <serial port>`   
      - e.g.:  
        `java -cp bin:lib/jssc-2.9.6.jar esiot.serial.SimpleSerialMonitor COM3`  
        `java -cp bin:lib/jssc-2.9.6.jar esiot.serial.SimpleSerialMonitor /dev/tty.usbmodem1412101`
                                                                            
  - Remote Blinking
    - Arduino side - 2 versions:
      - raw: `serial/arduino/remote_blinking/remote_led.ino` 
      - with a MsgService: `serial/arduino/remote_blinking/remote_led_withmsg.ino`
    - Java side (being in `serial/java`):   
      - `java -cp bin:lib/jssc-2.9.6.jar esiot.serial.TestRemoteBlinking <serial port>`  
  - Test Ping Pong
    - Arduino side: 
      - running `serial/arduino/remote_blinking/remote_pingpong.ino`
    - Java side (being in `serial/java`):
      - `java -cp bin:lib/jssc-2.9.6.jar esiot.serial.TestPingPong  <serial port>`


**Case study in Lab** 

- Let's consider a simple system including a **servo motor (SM)**, a **led (L)** and a **button (B)**, with the following behaviour:
  - When started (initial conditions), the **SM** is at 0° degree, **L** is on.
  - When **B** is pressed, **SM** starts sweeping forward and backward, continuously, and **L** starts blinking (with period 0.1 sec). In particular:
    - sweeping forward (from 0° to 180° degrees) should be done in 2 seconds;
    - sweeping backward (from 180° to 0° degrees) should be done in 1 second.
  - **B** can be pressed again to stop sweeping, resetting the initial conditions. 
    - if it is stopped while sweeping forward, sweeping is immediately interrupted, while if it is stopped while sweeping backward, sweeping is not interrupted and the system stops when *SM* reaches 0°.
- The exercise:
  - Model the behaviour of the system with a FSM. 
  - Implement it as a synchronous FSM, choosing the proper period.






