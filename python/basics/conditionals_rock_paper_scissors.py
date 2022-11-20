#!/usr/bin/env python3

from random import choice

ROCK = 'rock'
PAPER = 'paper'
SCISSORS = 'scissors'

available_choices = [ROCK, PAPER, SCISSORS]

DRAW = 'Draw'
PLAYER_1_WON = 'Player 1 won !'
PLAYER_2_WON = 'Player 2 won !'


def start(opponent):
    def choice_validation(selected_choice):
        if selected_choice not in available_choices:
            print(f"Invalid entry '{selected_choice}', try again...")
            return False
        else:
            return True

    def check_winner(player_1_choice, player_2_choice):
        print(f'Player 1: {player_1_choice}. Player 2: {player_2_choice}')
        if player_1_choice == player_2_choice:
            print(DRAW)
            print('Restarting round...')
            start(opponent)
        elif player_1_choice == ROCK and player_2_choice != PAPER:
            print(PLAYER_1_WON)
        elif player_1_choice == PAPER and player_2_choice != SCISSORS:
            print(PLAYER_1_WON)
        elif player_1_choice == SCISSORS and player_2_choice != ROCK:
            print(PLAYER_1_WON)
        else:
            print(PLAYER_2_WON)

    def play(turn):
        player_choice = input(f'Player {turn}, enter your choice: ')
        return player_choice if choice_validation(player_choice) else play(turn)

    player_1 = play(1)
    for i in range(0, 30):
        print("Next player get READY...")
        i += 1
    player_2 = play(2) if opponent == 'human' else choice(available_choices)
    check_winner(player_1, player_2)


selection = input('Choose your opponent: human / computer: ')
start(selection)









