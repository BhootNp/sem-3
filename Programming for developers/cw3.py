#Write a program to demonstrate basic queue operations(add, remove, peek) using Java's Queue interface and LinkedList implementation in python

from collections import deque
queue = deque()

queue.append("1")
queue.append("2")
queue.append("3")

print("Queue after adding:", queue)

print("Peek:", queue[0])

removed = queue.popleft()
print("Removed:", removed)
print("Queue after removing:", queue)

print("Peek again:", queue[0])
