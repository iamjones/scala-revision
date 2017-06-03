package additionalquestions

object Question26 extends App {

    println("A refrigerator has a motor, a temperature sensor, a light, and a door. The motor turns" +
        "on and off primarily as prescribed by the temperature sensor. However, the motor" +
        "stops when the door is opened. The motor restarts when the door is closed assuming" +
        "the temperature is too high. The light is turned on when the door is opened and is" +
        "turned off when the door is closed.")

    println("Identify the classes in the preceding description of a refrigerator")
    println("Refrigerator, motor, temperature sensor, light, door")

    println("Identify the methods for each of your classes")
    println("Refrigerator - openDoor, closeDoor")
    println("Motor - start, stop")
    println("Temperature Sensor - getTemperature")
    println("Light - turnOff, turnOn")
    println("Door - open, shut")
}

class Refrigerator(
      motor: Motor,
      temperatureSensor: TemperatureSensor,
      light: Light,
      door: Door) {

    def openDoor(): Unit = {
        door.open()
        light.turnOn()
        motor.stop()
    }

    def closeDoor(): Unit ={
        door.close()
        light.turnOff()
    }
}

class Motor {
    def start(): Unit = {
        println("Start motor")
    }

    def stop(): Unit = {
        println("Stop motor")
    }
}

class TemperatureSensor {
    def getTemperature : Double = {
        println("Getting temperature")
        78.9
    }
}

class Light {
    def turnOff(): Unit = {
        println("Turn off")
    }

    def turnOn(): Unit = {
        println("Turn on")
    }
}

class Door {
    def open(): Unit = {
        println("Open door")
    }

    def close(): Unit = {
        println("Close door")
    }
}