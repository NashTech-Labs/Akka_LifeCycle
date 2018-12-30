package com.knoldus

import akka.actor.{ActorSystem, Props}

object AkkaApplication extends App {
    val number1 = 1
    val number0 = 0
    val number2 = 2

    val akkaActor = ActorSystem("ActorSystemName").actorOf(Props[AkkaActor], "ActorName")

    akkaActor ! number1
    akkaActor ! number0
    akkaActor ! number2
}


