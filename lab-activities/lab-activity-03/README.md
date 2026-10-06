### Embedded Systems and IoT  - ISI LT - a.y. 2025/2026

## Lab Activity #03 - 20261007

v. 1.0.0-20261006
 
**MCU Programming basics - last mile** 

- Lab Activity #02 Exercise solutiom - Pulsing a LED, controlling the speed with a potentiometer
  - [controlled_pulsing](./controlled_pulsing/controlled_pulsing.ino)

- A look to EnableInterrupt library
  - https://github.com/GreyGnome/EnableInterrupt  
  - Uploading new libraries in Arduino IDE 

- Timers
  - [TimerOne library](https://docs.arduino.cc/libraries/timerone/)
      - [event-driven blinking example](./event_driven_blinking/event_driven_blinking.ino)
  - Libraries for Timer2
    - [TimerTwo](https://github.com/theAndreas/TimerTwo)
    - [MsTimer2](https://docs.arduino.cc/libraries/mstimer2/)

About Serial Communication
- Asynchronous serial
  - [Echo example](./serialecho/serialecho.ino)
- Synchronous Serial: The I2C Bus 
  - [I2C scanner](./i2c_scan/i2c_scan.ino)
  - [Using an I2C-based device: the LCD](./i2c_lcd/i2c_lcd.ino) 

Power Management
- Deep sleeping example 
  - [power-down + interrupt](./deepsleep/deepsleep.ino)
- Lightweight sleeping example 
  - [idle sleep + timer](./lightsleep_with_timer/lightsleep_with_timer.ino)

**About structuring superloop programs with interrupts**

State-based organization of programs based on superloop + interrupts + timings
- [superloop_interrupt_example](./superloop_interrupt_example/superloop_interrupt_example.ino)

**Assignment #01 Announcement**
 


