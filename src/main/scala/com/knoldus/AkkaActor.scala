package com.knoldus

import akka.actor.Actor

class AkkaActor extends Actor {

    override def receive : Receive = {
        case number : Int => println(s"Message received with number : $number")
            100 / number
    }

    override def preStart(){
        super.preStart()
        println("starting preStart")
    }

    override def postStop(){
        super.postStop()
        println("starting postStop")
    }

    override def preRestart(reason : Throwable, message : Option[Any]){
        super.preRestart(reason, message)
        println(s"starting preRestart because of $reason")
        println(s"Reason : $reason")
    }

    override def postRestart(reason : Throwable){
        super.postRestart(reason)
        println(s"starting postRestart because of $reason")
    }

    //here purpose of calling the super is not to change the default implementation of these methods
}
