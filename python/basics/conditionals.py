#!/usr/bin/python

from random import randint


def roll_number():
    return randint(-100, 100)


def check_even_numbers(number):
    return number % 2 == 0


x = roll_number()
y = roll_number()

while x == 0:
    x = roll_number()
while y ==0:    
    y = roll_number()

if check_even_numbers(x) and check_even_numbers(y):
    print('both evens')
elif not check_even_numbers(x) and not check_even_numbers(y):
    print('both odds')
else:
    if check_even_numbers(x):
        print('x is even, y is odd')
    else:
        print('y is even, x is odd')






