from random import randint

winning_number = randint(1, 10)
guess = int(input('Guess a number between 1 and 10 '))

while True:
    if guess > winning_number:
        guess = int(input('Too high, try again! '))
    elif guess < winning_number:
        guess = int(input('Too low, try again! '))
    else:
        print('You guessed it!')
        if input('Wanna try again? ') in ('y', 'yes', 'sure', 'ok'):
            winning_number = randint(1, 10)
            guess = int(input('Guess a number between 1 and 10 '))
        else:
            break


