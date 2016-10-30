class Queue(){ // abstract class Queue
	var queue : List[Any] = Nil // Defining an empty List as a member of the class Queue
	def equals(obj: Queue): Boolean={ // Overriding equals function
		(this.queue, obj.queue) match{ 
			case (Nil, Nil) => true // If both the queues are empty then they are equal
			case (head1::rest1, head2::rest2) => (head1.equals(head2)) && (rest1.equals(rest2)) // If both the head and rest of both queues are in the same order
			case _ => false // Anything else, it will return false
		}
	}
	override def hashCode(): Int={
		var sumhash : Int=0
		this.queue.foreach{
			sumhash+=_.hashCode()
		}
		sumhash
	}
	def Enqueue(elem: Any): Unit={ // Function to add elem to queue
		this.queue=this.queue:::List(elem) // elem is simply added to the end of the list 
	}
	def Dequeue(): Unit={ // Function to remove element from queue
		this.queue match{
			case Nil => this.queue = Nil // If queue is alredy empty, then there is no element to remove. Thus, empty queue is returned
			case head::rest => this.queue=rest // Since elements are being added from the back, the head (last element in the queue) is removed
		}
	}
}