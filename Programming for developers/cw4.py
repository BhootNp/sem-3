#Implement a queue using arrays in Java. Include METHODS FOR ENQUEUE, DEQUEUE, PEEK And checking if the queue is empty or full.
class ArrayQueue:
    def __init__(self, capacity):
        self.capacity = capacity
        self.queue = [None] * capacity
        self.front = 0
        self.rear = -1
        self.size = 0

    # Check if empty
    def is_empty(self):
        return self.size == 0

    # Check if full
    def is_full(self):
        return self.size == self.capacity

    # Enqueue
    def enqueue(self, value):
        if self.is_full():
            print("Queue is full! Cannot enqueue", value)
            return
        self.rear = (self.rear + 1) % self.capacity
        self.queue[self.rear] = value
        self.size += 1
        print(value, "enqueued.")

    # Dequeue
    def dequeue(self):
        if self.is_empty():
            print("Queue is empty! Cannot dequeue.")
            return None
        removed = self.queue[self.front]
        self.front = (self.front + 1) % self.capacity
        self.size -= 1
        return removed

    # Peek
    def peek(self):
        if self.is_empty():
            print("Queue is empty! Nothing to peek.")
            return None
        return self.queue[self.front]


# TESTING THE QUEUE
if __name__ == "__main__":
    q = ArrayQueue(5)

    q.enqueue(10)
    q.enqueue(20)
    q.enqueue(30)

    print("Peek:", q.peek())

    print("Dequeued:", q.dequeue())
    print("Peek after dequeue:", q.peek())

    q.enqueue(40)
    q.enqueue(50)
    q.enqueue(60)  # will fail if full

    print("Dequeued:", q.dequeue())
    print("Dequeued:", q.dequeue())

    print("Is empty?", q.is_empty())
    print("Is full?", q.is_full())
