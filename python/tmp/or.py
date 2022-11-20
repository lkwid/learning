#!/usr/bin/env python3

consoles = ['xsx', 'xonex', 'switch', '...', 'PS5']
for c in consoles:
    i = consoles.index(c)
    print(f'Is {c} worth a purchase?')
    if c == '...' or c == 'PS5':
        print('NO')
    else:
        print('Yup')

